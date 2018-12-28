/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tfg2018.gui.Utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.tfg2018.gui.RequestObjects.InstantTransactionStructure;
import com.tfg2018.gui.RequestObjects.RequestMessage;
import com.tfg2018.gui.ResponseObject.KeyPair;
import com.tfg2018.gui.ResponseObject.ResponseMessage;
import com.tfg2018.gui.ResponseObject.Token;

/**
 *
 * @author Tomas
 */
public class GsonTranslator {

    public static String formatJson(Object value) {
        final GsonBuilder builder = new GsonBuilder();
        final Gson gson = builder.create();
        return gson.toJson(value);
    }

    public static KeyPair getKeys(String keyPair) {
        Gson gson = new Gson();
        return gson.fromJson(keyPair, KeyPair.class);
    }
    
    public static Token getToken(String token){
        Gson gson = new Gson();
        return gson.fromJson(token, Token.class);
    }
    
    public static ResponseMessage getMessage(String message){
        Gson gson = new Gson();
        return gson.fromJson(message, ResponseMessage.class);
    }

    public static Object getTransaction(String answer) {
        Gson gson = new Gson();
        return gson.fromJson(answer, InstantTransactionStructure.class);
    }

}
