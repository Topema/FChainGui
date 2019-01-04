/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tfg2018.gui.ApiManager;

import com.tfg2018.gui.RequestObjects.RequestMessage;
import com.tfg2018.gui.ResponseObject.KeyPair;
import com.tfg2018.gui.ResponseObject.ResponseMessage;
import com.tfg2018.gui.ResponseObject.Token;
import com.tfg2018.gui.Utils.GlobalVariables;
import com.tfg2018.gui.Utils.GsonTranslator;
import java.io.IOException;
import java.util.List;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.entity.StringEntity;

/**
 *
 * @author Tomas
 */
public class GetOperation {

    private String url = GlobalVariables.url;

    public KeyPair getNewKeyPair() throws IOException, Exception {
        HttpGet request = new HttpGet(url.concat("createKeyPair"));
        String answer = executeRequest(request);
        return GsonTranslator.getKeys(answer);
    }

    public String getTokenOwner(String token) throws Exception {
        try {
            ResponseMessage message = new ResponseMessage();
            message.setMessage(token);
            StringEntity request = new StringEntity(GsonTranslator.formatJson(message));
            String answer = executeRequest(request, "getTokenOwner");
            return GsonTranslator.getMessage(answer).getMessage();
        } catch (Exception ex) {
            throw new Exception("Error obteniendo dueño del token");
        }
    }

    public Token getTokenInfo(String tokenName) throws Exception {
        ResponseMessage message = createResponseMessage(tokenName);
        StringEntity request = new StringEntity(GsonTranslator.formatJson(tokenName));
        String answer = executeRequest(request, "getToken");
        return GsonTranslator.getToken(answer);
    }

    public String getTokenLastOwner(String token) throws Exception {
        try {
            ResponseMessage message = createResponseMessage(token);
            StringEntity request = new StringEntity(GsonTranslator.formatJson(message));
            String answer = executeRequest(request, "getLastTokenOwner");
            return GsonTranslator.getMessage(answer).getMessage();
        } catch (Exception ex) {
            throw new Exception("Error obteniendo dueño del token");
        }
    }

    public String getTokenCreator(String token) throws Exception {
        try {
            ResponseMessage message = createResponseMessage(token);
            StringEntity request = new StringEntity(GsonTranslator.formatJson(message));
            String answer = executeRequest(request, "getTokenCreator");
            return GsonTranslator.getMessage(answer).getMessage();
        } catch (Exception ex) {
            throw new Exception("Error obteniendo al creador del token");
        }
    }

    public String getTokenInitialOwner(String token) throws Exception {
        try {
            ResponseMessage message = createResponseMessage(token);
            StringEntity request = new StringEntity(GsonTranslator.formatJson(message));
            String answer = executeRequest(request, "getInitialTokenOwner");
            return GsonTranslator.getMessage(answer).getMessage();
        } catch (Exception ex) {
            throw new Exception("Error obteniendo al creador del token");
        }
    }

    public List<String> getAddressBalances(String address) throws Exception {
        try {
            ResponseMessage message = createResponseMessage(address);
            StringEntity request = new StringEntity(GsonTranslator.formatJson(message));
            String response = executeRequest(request, "getAddressBalance");
            return GsonTranslator.getAddressBalances(response);
        } catch (Exception ex) {
            throw new Exception("Error obteniendo los balances de la dirección");
        }
    }

    private ResponseMessage createResponseMessage(String parameter) {
        ResponseMessage message = new ResponseMessage();
        message.setMessage(parameter);
        return message;
    }

    private String executeRequest(HttpGet request) throws Exception {
        RequestExecutioner requestExecutioner = new RequestExecutioner();
        return requestExecutioner.executeRequest(request);
    }

    private String executeRequest(StringEntity request, String operation) throws Exception {
        RequestExecutioner requestExecutioner = new RequestExecutioner();
        return requestExecutioner.executeRequest(request, operation);
    }
}
