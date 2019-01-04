/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tfg2018.gui.RequestObjects;

/**
 *
 * @author Tomas
 */
public class RequestMessage {

    private String message;

    public RequestMessage(String assetName) {
        this.message = assetName;
    }

    public String getMessage() {
        return message;
    }
    
    public void setMessage(String message){
        this.message = message;
    }
}
