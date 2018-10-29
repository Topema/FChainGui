/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tfg2018.gui.ApiManager;

import com.tfg2018.gui.RequestObjects.CheckToken;
import com.tfg2018.gui.RequestObjects.CreateTokenStructure;
import com.tfg2018.gui.ResponseObject.KeyPair;
import com.tfg2018.gui.ResponseObject.Token;
import com.tfg2018.gui.Utils.GlobalVariables;
import com.tfg2018.gui.Utils.GsonTranslator;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
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
        httppost = new HttpPost(url.concat("validateAddress"));
        StringEntity request = new StringEntity(GsonTranslator.formatJson(keys));
        String answer = executePostRequest(request);
        return GsonTranslator.getKeys(answer);
    }

    public Token generateToken(CreateTokenStructure tokenInfo) throws Exception {
        try {
            httppost = new HttpPost(url.concat("generateNewToken"));
            StringEntity request = new StringEntity(GsonTranslator.formatJson(tokenInfo));
            String answer = executePostRequest(request);
            return GsonTranslator.getToken(answer);
        } catch (Exception ex) {
            throw new Exception("Error generando el token");
        }
    }

    public Token getTokenInfo(CheckToken tokenName) throws Exception {
        httppost = new HttpPost(url.concat("getToken"));
        StringEntity request = new StringEntity(GsonTranslator.formatJson(tokenName));
        String answer = executePostRequest(request);
        return GsonTranslator.getToken(answer);
    }

    private String executePostRequest(StringEntity request) throws Exception {
        try {
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
