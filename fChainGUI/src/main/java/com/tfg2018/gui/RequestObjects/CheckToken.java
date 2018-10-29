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
public class CheckToken {

    private String name;

    public CheckToken(String assetName) {
        this.name = assetName;
    }

    public String getName() {
        return name;
    }
}
