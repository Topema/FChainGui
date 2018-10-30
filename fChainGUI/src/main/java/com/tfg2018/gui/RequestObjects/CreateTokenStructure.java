/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tfg2018.gui.RequestObjects;

import com.tfg2018.gui.ResponseObject.Token;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bouncycastle.util.encoders.Hex;

/**
 *
 * @author Tomas
 */
public class CreateTokenStructure {

    private String address;
    private String tokenName;
    private Map<String, String> details;

    public CreateTokenStructure(String address, Map<String, String> details) throws Exception {
        try {
            this.address = address;
            this.tokenName = generateTokenName(details);
            this.details = details;
        } catch (NoSuchAlgorithmException ex) {
            throw new Exception("error generando el código sha256 de la factura");
        }
    }

    public String generateTokenName(Map<String, String> details) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("MD5");
        byte[] hash = digest.digest(
                details.toString().getBytes(StandardCharsets.UTF_8));
        return new String(Hex.encode(hash));
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
        return new Token(this.tokenName, this.details);
    }
}
