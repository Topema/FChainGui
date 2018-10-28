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
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

/**
 *
 * @author Tomas
 */
public class GetOperation {
    private final String url = GlobalVariables.url;
    private final CloseableHttpClient httpclient = HttpClients.createDefault();
    
    public KeyPair getNewKeyPair() throws IOException {
        HttpGet request = new HttpGet(url.concat("createKeyPair"));
        CloseableHttpResponse response = httpclient.execute(request);
        HttpEntity entity = response.getEntity();
        String answer = EntityUtils.toString(entity);
        response.close();
        return GsonTranslator.getKeys(answer);
    }
}
