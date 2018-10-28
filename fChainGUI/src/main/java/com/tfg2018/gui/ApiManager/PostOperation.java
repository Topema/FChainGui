/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tfg2018.gui.ApiManager;

import com.tfg2018.gui.Object.KeyPair;
import com.tfg2018.gui.Utils.GlobalVariables;
import com.tfg2018.gui.Utils.GsonTranslator;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
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

    public String executePostRequest(StringEntity request) throws Exception {
        try {
            httppost.setEntity(request);
            httppost.setHeader("Content-type", "application/json");
            CloseableHttpResponse response = httpclient.execute(httppost);
            HttpEntity entity = response.getEntity();
            response.close();
            return EntityUtils.toString(entity);
        } catch (IOException ex) {
            throw new Exception("error durante la ejecución de la solicitud Post");
        }
    }
}
