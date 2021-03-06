/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tfg2018.gui.ResponseObject;

import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author Tomas
 */
public class KeyPair {
	private String address;
	private String pubkey;
	private String privkey;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
        
        public KeyPair(String privKey){
            this.privkey = privKey;
        }
        
        public KeyPair(String address, String pubKey, String privKey){
            this.address = address;
            this.pubkey = pubKey;
            this.privkey = privKey;
            
        }
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPubkey() {
		return pubkey;
	}

	public void setPubkey(String pubkey) {
		this.pubkey = pubkey;
	}

	public String getPrivkey() {
		return privkey;
	}

	public void setPrivkey(String privkey) {
		this.privkey = privkey;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
