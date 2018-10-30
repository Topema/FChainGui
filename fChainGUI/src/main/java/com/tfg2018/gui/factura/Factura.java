/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tfg2018.gui.factura;

import java.text.Normalizer;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Tomas
 */
public class Factura {

    private Map<String, String> tokenParameters;

    Factura(ComprobanteInfo infoComprobante, Participant emisor, Participant receptor, String[] concept, String[] impuesto) {
        this.tokenParameters = new HashMap<String, String>();
        setFacturaInfo(infoComprobante);
        setParticipant(emisor, "emisor");
        setParticipant(receptor, "receptor");
        setConcept(concept);
        setImpuesto(impuesto);
    }

    private void setParticipant(Participant participant, String type) {
        addTokenParameter(type + "rfc", participant.getRfc());
        addTokenParameter(type + "nombre", cleanString(participant.getNombre()));
        addTokenParameter(type + "codigoPostal", cleanString(participant.getLocalizacion().getCPEmisor()));
        addTokenParameter(type + "calle", cleanString(participant.getLocalizacion().getCalleEmisor()));
        addTokenParameter(type + "estado", cleanString(participant.getLocalizacion().getEstadoEmisor()));
        addTokenParameter(type + "municipio", cleanString(participant.getLocalizacion().getMunicipioEmisor()));
        addTokenParameter(type + "pais", cleanString(participant.getLocalizacion().getPaisEmisor()));
    }

    private void setFacturaInfo(ComprobanteInfo infoComprobante) {
        addTokenParameter("fechaExpedicionFactura", cleanString(infoComprobante.getFecha()));
        addTokenParameter("formaDePago", cleanString(infoComprobante.getFormaDePago()));
        addTokenParameter("lugarExpedicion", cleanString(infoComprobante.getLugarExpedicion()));
        addTokenParameter("medotoPago", cleanString(infoComprobante.getMetodoDePago()));
        addTokenParameter("tipoComprobante", cleanString(infoComprobante.getTipoDeComprobante()));
        addTokenParameter("total", cleanString(infoComprobante.getTotal()));
        addTokenParameter("subTotal", cleanString(infoComprobante.getSubTotal()));
        addTokenParameter("infoComprobante", cleanString(infoComprobante.getMetodoDePago()));
    }

    private void setConcept(String[] concept) {
        for (int i = 0; i < concept.length; i++) {
            addTokenParameter("concepto-" + (i + 1), cleanString(concept[i]));
        }
    }

    private void setImpuesto(String[] concept) {
        for (int i = 0; i < concept.length; i++) {
            addTokenParameter("impuesto-" + (i + 1), cleanString(concept[i]));
        }
    }

    /**
     * @return the tokenParameters
     */
    public Map<String, String> getTokenParameters() {
        return tokenParameters;
    }

    public void addTokenParameter(String key, String value) {
        this.tokenParameters.put(key, value);
    }

    /**
     * @param tokenParameters the tokenParameters to set
     */
    public void setTokenParameters(Map<String, String> tokenParameters) {
        this.tokenParameters = tokenParameters;
    }

    public static String cleanString(String texto) {
        texto = Normalizer.normalize(texto, Normalizer.Form.NFD);
        texto = texto.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
        return texto;
    }
}
