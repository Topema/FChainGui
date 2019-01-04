/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tfg2018.gui.RequestObjects;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Tomas
 */
public class InstantTransactionStructure {

    private String addressSender;
    private String privKey;
    private String addressReceiver;
    private String tokenName;
    
    public InstantTransactionStructure (String addressSender, String privKey, String addressReceiver, String tokenName) {
        this.addressSender = addressSender;
        this.privKey = privKey;
        this.addressReceiver = addressReceiver;
        this.tokenName = tokenName;
    }

    public String getAddressSender() {
        return addressSender;
    }

    public void setAddressSender(String addressSender) {
        this.addressSender = addressSender;
    }

    public String getPrivKey() {
        return privKey;
    }

    public void setPrivKey(String privKey) {
        this.privKey = privKey;
    }

    public String getAddressReceiver() {
        return addressReceiver;
    }

    public void setAddressReceiver(String addressReceiver) {
        this.addressReceiver = addressReceiver;
    }

    public String getTokenName() {
        return tokenName;
    }

    public void setTokenName(String tokenName) {
        this.tokenName = tokenName;
    }
}
