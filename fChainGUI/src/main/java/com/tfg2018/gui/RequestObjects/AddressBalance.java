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
public class AddressBalance {
    	private String name;
	private Object assetref;
	private Double qty;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public String getName() {
	return name;
	}

	public void setName(String name) {
	this.name = name;
	}

	public Object getAssetref() {
	return assetref;
	}

	public void setAssetref(Object assetref) {
	this.assetref = assetref;
	}

	public Double getQty() {
	return qty;
	}

	public void setQty(Double qty) {
	this.qty = qty;
	}

	public Map<String, Object> getAdditionalProperties() {
	return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
	this.additionalProperties.put(name, value);
	}
}
