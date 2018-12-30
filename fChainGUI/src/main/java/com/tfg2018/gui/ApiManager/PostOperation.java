/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tfg2018.gui.ApiManager;

import com.tfg2018.gui.RequestObjects.AddressBalance;
import com.tfg2018.gui.RequestObjects.InstantTransactionStructure;
import com.tfg2018.gui.RequestObjects.CreateTokenStructure;
import com.tfg2018.gui.RequestObjects.RequestMessage;
import com.tfg2018.gui.ResponseObject.KeyPair;
import com.tfg2018.gui.ResponseObject.ResponseMessage;
import com.tfg2018.gui.ResponseObject.Token;
import com.tfg2018.gui.Utils.GlobalVariables;
import com.tfg2018.gui.Utils.GsonTranslator;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

/**
 *
 * @author Tomas
 */
public class PostOperation {

    private HttpPost httppost = null;
    private String url = GlobalVariables.url;
    private CloseableHttpClient httpclient = HttpClientBuilder.create().build();

    public KeyPair validateAddress(KeyPair keys) throws Exception {
        StringEntity request = new StringEntity(GsonTranslator.formatJson(keys));
        String answer = executePostRequest(request, "validateAddress");
        return GsonTranslator.getKeys(answer);
    }

    public Token getTokenInfo(RequestMessage tokenName) throws Exception {
        StringEntity request = new StringEntity(GsonTranslator.formatJson(tokenName));
        String answer = executePostRequest(request, "getToken");
        return GsonTranslator.getToken(answer);
    }

    public Token generateToken(CreateTokenStructure tokenInfo) throws Exception {
        try {
            StringEntity request = new StringEntity(GsonTranslator.formatJson(tokenInfo));
            String answer = executePostRequest(request, "generateNewToken");
            return GsonTranslator.getToken(answer);
        } catch (Exception ex) {
            throw new Exception("Error generando el token");
        }
    }

    public String getTokenOwner(String token) throws Exception {
        try {
            ResponseMessage message = new ResponseMessage();
            message.setMessage(token);
            StringEntity request = new StringEntity(GsonTranslator.formatJson(message));
            String answer = executePostRequest(request, "getTokenOwner");
            return GsonTranslator.getMessage(answer).getMessage();
        } catch (Exception ex) {
            throw new Exception("Error obteniendo dueño del token");
        }
    }

    public String getTokenCreator(String token) throws Exception {
        try {
            ResponseMessage message = new ResponseMessage();
            message.setMessage(token);
            StringEntity request = new StringEntity(GsonTranslator.formatJson(message));
            String answer = executePostRequest(request, "getTokenCreator");
            return GsonTranslator.getMessage(answer).getMessage();
        } catch (Exception ex) {
            throw new Exception("Error obteniendo al creador del token");
        }
    }
    
    public String getTokenInitialOwner(String token) throws Exception {
        try {
            ResponseMessage message = new ResponseMessage();
            message.setMessage(token);
            StringEntity request = new StringEntity(GsonTranslator.formatJson(message));
            String answer = executePostRequest(request, "getInitialTokenOwner");
            return GsonTranslator.getMessage(answer).getMessage();
        } catch (Exception ex) {
            throw new Exception("Error obteniendo al creador del token");
        }
    }

    public List<String> getAddressBalances(String address) throws Exception {
        try {
            ResponseMessage message = new ResponseMessage();
            message.setMessage(address);
            StringEntity request = new StringEntity(GsonTranslator.formatJson(message));
            String response = executePostRequest(request, "getAddressBalance");
            return GsonTranslator.getAddressBalances(response);
        } catch (Exception ex) {
            throw new Exception("Error obteniendo los balances de la dirección");
        }
    }

    public String createInstantTransaction(InstantTransactionStructure transaction) throws Exception {
        try {
            StringEntity request = new StringEntity(GsonTranslator.formatJson(transaction));
            System.out.println(GsonTranslator.formatJson(transaction));
            String answer = executePostRequest(request, "createInstantTransaction");
            return GsonTranslator.getMessage(answer).getMessage();
        } catch (Exception ex) {
            throw new Exception("Error creando la transacción del token");
        }
    }

    public String burnToken(InstantTransactionStructure transaction) throws Exception {
        try {
            StringEntity request = new StringEntity(GsonTranslator.formatJson(transaction));
            System.out.println(GsonTranslator.formatJson(transaction));
            String answer = executePostRequest(request, "burnToken");
            return GsonTranslator.getMessage(answer).getMessage();
        } catch (Exception ex) {
            throw new Exception("Error destruyendo el token token");
        }
    }

    private String executePostRequest(StringEntity request, String operation) throws Exception {
        try {
            httppost = new HttpPost(url.concat(operation));
            httppost.setEntity(request);
            httppost.setHeader("Content-type", "application/json");
            CloseableHttpResponse response = httpclient.execute(httppost);
            HttpEntity entity = response.getEntity();
            String answer = EntityUtils.toString(entity);
            response.close();
            return answer;
        } catch (IOException ex) {
            throw new Exception("error durante la ejecución de la solicitud Post");
        }
    }
}
