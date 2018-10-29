/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tfg2018.gui.RequestObjects;

import com.tfg2018.gui.ResponseObject.Token;
import java.util.Map;

/**
 *
 * @author Tomas
 */
public class CreateTokenStructure {
    private String address;
    private String tokenName;
    private Map<String, String> details;
    
    public CreateTokenStructure(String address, String tokenName, Map<String, String> details){
        this.address = address;
        this.tokenName = tokenName;
        this.details = details;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the tokenName
     */
    public String getTokenName() {
        return tokenName;
    }

    /**
     * @param tokenName the tokenName to set
     */
    public void setTokenName(String tokenName) {
        this.tokenName = tokenName;
    }

    /**
     * @return the details
     */
    public Map<String, String> getDetails() {
        return details;
    }

    /**
     * @param details the details to set
     */
    public void setDetails(Map<String, String> details) {
        this.details = details;
    }
    
    public Token getToken() {
    	return new Token(this.tokenName,this.details);
    }
}
