//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.10.30 a las 12:16:51 AM GMT 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}TaxIdentification"/&gt;
 *         &lt;element ref="{}PartyIdentification"/&gt;
 *         &lt;element ref="{}LegalEntity"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "taxIdentification",
    "partyIdentification",
    "legalEntity"
})
@XmlRootElement(name = "BuyerParty")
public class BuyerParty {

    @XmlElement(name = "TaxIdentification", required = true)
    protected TaxIdentification taxIdentification;
    @XmlElement(name = "PartyIdentification")
    protected int partyIdentification;
    @XmlElement(name = "LegalEntity", required = true)
    protected LegalEntity legalEntity;

    /**
     * Obtiene el valor de la propiedad taxIdentification.
     * 
     * @return
     *     possible object is
     *     {@link TaxIdentification }
     *     
     */
    public TaxIdentification getTaxIdentification() {
        return taxIdentification;
    }

    /**
     * Define el valor de la propiedad taxIdentification.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxIdentification }
     *     
     */
    public void setTaxIdentification(TaxIdentification value) {
        this.taxIdentification = value;
    }

    /**
     * Obtiene el valor de la propiedad partyIdentification.
     * 
     */
    public int getPartyIdentification() {
        return partyIdentification;
    }

    /**
     * Define el valor de la propiedad partyIdentification.
     * 
     */
    public void setPartyIdentification(int value) {
        this.partyIdentification = value;
    }

    /**
     * Obtiene el valor de la propiedad legalEntity.
     * 
     * @return
     *     possible object is
     *     {@link LegalEntity }
     *     
     */
    public LegalEntity getLegalEntity() {
        return legalEntity;
    }

    /**
     * Define el valor de la propiedad legalEntity.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalEntity }
     *     
     */
    public void setLegalEntity(LegalEntity value) {
        this.legalEntity = value;
    }

}
