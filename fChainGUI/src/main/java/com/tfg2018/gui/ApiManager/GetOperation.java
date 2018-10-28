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
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

/**
 *
 * @author Tomas
 */
public class GetOperation {

    private final String url = GlobalVariables.url;
    private final CloseableHttpClient httpclient = HttpClientBuilder.create().build();

    public KeyPair getNewKeyPair() throws IOException, Exception {
        HttpGet request = new HttpGet(url.concat("createKeyPair"));
        String answer = executeGetRequest(request);
        return GsonTranslator.getKeys(answer);
    }

    public String executeGetRequest(HttpGet request) throws Exception {
        try {
            CloseableHttpResponse response = httpclient.execute(request);
            HttpEntity entity = response.getEntity();
            response.close();
            return EntityUtils.toString(entity);
        } catch (IOException ex) {
            throw new Exception("Error durante la solicitud get");
        }
    }
}
