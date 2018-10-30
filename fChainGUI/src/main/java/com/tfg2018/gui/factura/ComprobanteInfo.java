/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tfg2018.gui.factura;

/**
 *
 * @author Tomas
 */
public class ComprobanteInfo {

    private String fecha;
    private String formaDePago;
    private String tipoDeComprobante;
    private String total;
    private String subTotal;
    private String LugarExpedicion;
    private String metodoDePago;

    ComprobanteInfo(String fecha, String formaDePago, String tipoDeComprobante, String total, String subTotal, String LugarExpedicion, String metodoDePago) {
        this.fecha = fecha;
        this.formaDePago = formaDePago;
        this.tipoDeComprobante = tipoDeComprobante;
        this.total = total;
        this.subTotal = subTotal;
        this.LugarExpedicion = LugarExpedicion;
        this.metodoDePago = metodoDePago;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the formaDePago
     */
    public String getFormaDePago() {
        return formaDePago;
    }

    /**
     * @param formaDePago the formaDePago to set
     */
    public void setFormaDePago(String formaDePago) {
        this.formaDePago = formaDePago;
    }

    /**
     * @return the tipoDeComprobante
     */
    public String getTipoDeComprobante() {
        return tipoDeComprobante;
    }

    /**
     * @param tipoDeComprobante the tipoDeComprobante to set
     */
    public void setTipoDeComprobante(String tipoDeComprobante) {
        this.tipoDeComprobante = tipoDeComprobante;
    }

    /**
     * @return the total
     */
    public String getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(String total) {
        this.total = total;
    }

    /**
     * @return the subTotal
     */
    public String getSubTotal() {
        return subTotal;
    }

    /**
     * @param subTotal the subTotal to set
     */
    public void setSubTotal(String subTotal) {
        this.subTotal = subTotal;
    }

    /**
     * @return the LugarExpedicion
     */
    public String getLugarExpedicion() {
        return LugarExpedicion;
    }

    /**
     * @param LugarExpedicion the LugarExpedicion to set
     */
    public void setLugarExpedicion(String LugarExpedicion) {
        this.LugarExpedicion = LugarExpedicion;
    }

    /**
     * @return the metodoDePago
     */
    public String getMetodoDePago() {
        return metodoDePago;
    }

    /**
     * @param metodoDePago the metodoDePago to set
     */
    public void setMetodoDePago(String metodoDePago) {
        this.metodoDePago = metodoDePago;
    }

}
