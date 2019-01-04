/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tfg2018.gui.ApiManager;

import com.tfg2018.gui.Utils.GlobalVariables;
import java.io.IOException;
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
public class RequestExecutioner {

    private HttpPost httppost = null;
    private String url = GlobalVariables.url;
    private CloseableHttpClient httpclient = HttpClientBuilder.create().build();
    
    public RequestExecutioner(){   
    }

    public String executeRequest(HttpGet request) throws Exception {
        try {
            CloseableHttpResponse response = this.httpclient.execute(request);
            HttpEntity entity = response.getEntity();
            String answer = EntityUtils.toString(entity);
            response.close();
            return answer;
        } catch (IOException ex) {
            throw new Exception("get request execution error");
        }
    }

    public String executeRequest(StringEntity request, String operation) throws Exception {
        try {
            this.httppost = new HttpPost(url.concat(operation));
            this.httppost.setEntity(request);
            this.httppost.setHeader("Content-type", "application/json");
            CloseableHttpResponse response = this.httpclient.execute(httppost);
            HttpEntity entity = response.getEntity();
            String answer = EntityUtils.toString(entity);
            response.close();
            return answer;
        } catch (IOException ex) {
            throw new Exception("post request execution errort");
        }
    }
}
