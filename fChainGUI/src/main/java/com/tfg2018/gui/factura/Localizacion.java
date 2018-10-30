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
public class Localizacion {

    private String pais;
    private String calle;
    private String estado;
    private String municipio;
    private String CP;

    Localizacion(String paisEmisor, String calleEmisor, String estadoEmisor, String municipioEmisor, String CPEmisor) {
        this.pais = paisEmisor;
        this.calle = calleEmisor;
        this.estado = estadoEmisor;
        this.municipio = municipioEmisor;
        this.CP = CPEmisor;
    }

    /**
     * @return the paisEmisor
     */
    public String getPaisEmisor() {
        return pais;
    }

    /**
     * @param paisEmisor the paisEmisor to set
     */
    public void setPaisEmisor(String paisEmisor) {
        this.pais = paisEmisor;
    }

    /**
     * @return the calleEmisor
     */
    public String getCalleEmisor() {
        return calle;
    }

    /**
     * @param calleEmisor the calleEmisor to set
     */
    public void setCalleEmisor(String calleEmisor) {
        this.calle = calleEmisor;
    }

    /**
     * @return the estadoEmisor
     */
    public String getEstadoEmisor() {
        return estado;
    }

    /**
     * @param estadoEmisor the estadoEmisor to set
     */
    public void setEstadoEmisor(String estadoEmisor) {
        this.estado = estadoEmisor;
    }

    /**
     * @return the municipioEmisor
     */
    public String getMunicipioEmisor() {
        return municipio;
    }

    /**
     * @param municipioEmisor the municipioEmisor to set
     */
    public void setMunicipioEmisor(String municipioEmisor) {
        this.municipio = municipioEmisor;
    }

    /**
     * @return the CPEmisor
     */
    public String getCPEmisor() {
        return CP;
    }

    /**
     * @param CPEmisor the CPEmisor to set
     */
    public void setCPEmisor(String CPEmisor) {
        this.CP = CPEmisor;
    }
}
