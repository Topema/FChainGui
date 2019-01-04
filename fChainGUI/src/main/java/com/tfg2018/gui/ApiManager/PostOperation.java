/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tfg2018.gui.ApiManager;

import com.tfg2018.gui.RequestObjects.InstantTransactionStructure;
import com.tfg2018.gui.RequestObjects.CreateTokenStructure;
import com.tfg2018.gui.ResponseObject.KeyPair;
import com.tfg2018.gui.ResponseObject.Token;
import com.tfg2018.gui.Utils.GsonTranslator;
import org.apache.http.entity.StringEntity;

/**
 *
 * @author Tomas
 */
public class PostOperation {

    public KeyPair validateAddress(KeyPair keys) throws Exception {
        StringEntity request = new StringEntity(GsonTranslator.formatJson(keys));
        String answer = executeRequest(request, "validateAddress");
        return GsonTranslator.getKeys(answer);
    }

    public Token generateToken(CreateTokenStructure tokenInfo) throws Exception {
        try {
            StringEntity request = new StringEntity(GsonTranslator.formatJson(tokenInfo));
            String answer = executeRequest(request, "generateNewToken");
            return GsonTranslator.getToken(answer);
        } catch (Exception ex) {
            throw new Exception("Error generando el token");
        }
    }

    public String createInstantTransaction(InstantTransactionStructure transaction) throws Exception {
        try {
            StringEntity request = new StringEntity(GsonTranslator.formatJson(transaction));
            System.out.println(GsonTranslator.formatJson(transaction));
            String answer = executeRequest(request, "createInstantTransaction");
            return GsonTranslator.getMessage(answer).getMessage();
        } catch (Exception ex) {
            throw new Exception("Error creando la transacción del token");
        }
    }

    public String burnToken(InstantTransactionStructure transaction) throws Exception {
        try {
            StringEntity request = new StringEntity(GsonTranslator.formatJson(transaction));
            System.out.println(GsonTranslator.formatJson(transaction));
            String answer = executeRequest(request, "burnToken");
            return GsonTranslator.getMessage(answer).getMessage();
        } catch (Exception ex) {
            throw new Exception("Error destruyendo el token token");
        }
    }

    public String executeRequest(StringEntity request, String operation) throws Exception {
        RequestExecutioner requestExecutioner = new RequestExecutioner();
        return requestExecutioner.executeRequest(request, operation);
    }
}
