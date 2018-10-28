/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tfg2018.gui.Utils;

import com.google.gson.Gson;
import com.tfg2018.gui.Object.KeyPair;

/**
 *
 * @author Tomas
 */
public class GsonTranslator {

    public static KeyPair getKeys(String keyPair) {
        Gson gson = new Gson();
        return gson.fromJson(keyPair, KeyPair.class);
    }

}
