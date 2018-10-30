/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tfg2018.gui.factura;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author Tomas
 */
public class InvoiceReader {

    private DocumentBuilderFactory dbf;
    private DocumentBuilder documentBuilder;

    public InvoiceReader() throws ParserConfigurationException {
        this.dbf = DocumentBuilderFactory.newInstance();
        this.documentBuilder = this.dbf.newDocumentBuilder();
    }

    public Factura readInvoice(File archivo) throws ParserConfigurationException, SAXException, IOException {
        Document document = documentBuilder.parse(archivo);
        document.getDocumentElement().normalize();

        ComprobanteInfo infoComprobante = getComprobanteInfo(document);
        Participant emisor = getParticipantInfo(document, true);
        Participant receptor = getParticipantInfo(document, false);
        String[] concept = getConcepts(document);
        String[] impuesto = getImpuesto(document);
        
        return new Factura(infoComprobante,emisor,receptor,concept,impuesto);

    }

    private ComprobanteInfo getComprobanteInfo(Document document) {
        NodeList Comprobante = document.getElementsByTagName("cfdi:Comprobante");
        Element elementComprobante = (Element) Comprobante.item(0);

        String fecha = elementComprobante.getAttribute("fecha");
        String formaDePago = elementComprobante.getAttribute("formaDePago");
        String tipoDeComprobante = elementComprobante.getAttribute("tipodeComprobante");
        String total = elementComprobante.getAttribute("total");
        String subTotal = elementComprobante.getAttribute("subTotal");
        String LugarExpedicion = elementComprobante.getAttribute("LugarExpedicion");
        String metodoDePago = elementComprobante.getAttribute("metodoDePago");

        return new ComprobanteInfo(fecha, formaDePago, tipoDeComprobante, total, subTotal, LugarExpedicion, metodoDePago);
    }

    private Participant getParticipantInfo(Document document, boolean isEmisor) {
        String participant;
        String domicilio;
        if (isEmisor) {
            participant = "cfdi:Emisor";
            domicilio = "cfdi:DomicilioFiscal";
        } else {
            participant = "cfdi:Receptor";
            domicilio = "cfdi:Domicilio";
        }
        NodeList Emisor = document.getElementsByTagName(participant);
        Element elementEmisor = (Element) Emisor.item(0);

        String rfc = elementEmisor.getAttribute("rfc");
        String nombre = elementEmisor.getAttribute("nombre");

        NodeList EmisorDetalles = elementEmisor.getElementsByTagName(domicilio);
        Element elementEmisordetalles = (Element) EmisorDetalles.item(0);

        String pais = elementEmisordetalles.getAttribute("pais");
        String calle = elementEmisordetalles.getAttribute("calle");
        String estado = elementEmisordetalles.getAttribute("estado");
        String municipio = elementEmisordetalles.getAttribute("municipio");
        String CP = elementEmisordetalles.getAttribute("codigoPostal");

        Localizacion localizacion = new Localizacion(pais, calle, estado, municipio, CP);

        return new Participant(rfc, nombre, localizacion);
    }

    private String[] getConcepts(Document document) {
        NodeList Conceptos = document.getElementsByTagName("cfdi:Conceptos");
        Element elementsConcepto = (Element) Conceptos.item(0);

        NodeList Concepto = elementsConcepto.getElementsByTagName("cfdi:Concepto");
        String[] concepts = new String[Concepto.getLength()];

        for (int temp = 0; temp < Concepto.getLength(); temp++) {
            Node nodo = Concepto.item(temp);
            if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                Element elementConcepto = (Element) nodo;
                concepts[temp] = " unidad-> " + elementConcepto.getAttribute("unidad")
                        + ", importe-> " + elementConcepto.getAttribute("importe")
                        + ", cantidad-> " + elementConcepto.getAttribute("cantidad")
                        + ", descripcion-> " + elementConcepto.getAttribute("descripcion")
                        + ", valorUnitario-> " + elementConcepto.getAttribute("valorUnitario");
            }
        }
        return concepts;
    }
    
    private String[] getImpuesto(Document document){
        NodeList Impuestos = document.getElementsByTagName("cfdi:Traslados");
        Element elementsImpuesto = (Element) Impuestos.item(0);

        NodeList Impuesto = elementsImpuesto.getElementsByTagName("cfdi:Traslado");
        String[] impuestos = new String[Impuesto.getLength()];

        for (int temp = 0; temp < Impuesto.getLength(); temp++) {
            Node nodo = Impuesto.item(temp);
            if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                Element elementConcepto = (Element) nodo;
                impuestos[temp] = "tasa-> " + elementConcepto.getAttribute("tasa")
                        + ", importe-> " + elementConcepto.getAttribute("importe")
                        + ", impuesto-> " + elementConcepto.getAttribute("impuesto");

            }
        }
        return impuestos;
    }

}
