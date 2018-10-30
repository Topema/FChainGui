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
public class Participant {

    private String rfc;
    private String nombre;
    private Localizacion localizacion;

    Participant(String rfc, String nombre, Localizacion localizacion) {
        this.rfc = rfc;
        this.nombre = nombre;
        this.localizacion = localizacion;
    }

    /**
     * @return the rfc
     */
    public String getRfc() {
        return rfc;
    }

    /**
     * @param rfc the rfc to set
     */
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the localizacion
     */
    public Localizacion getLocalizacion() {
        return localizacion;
    }

    /**
     * @param localizacion the localizacion to set
     */
    public void setLocalizacion(Localizacion localizacion) {
        this.localizacion = localizacion;
    }

}
