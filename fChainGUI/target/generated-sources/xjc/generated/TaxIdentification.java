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
 *         &lt;element ref="{}PersonTypeCode"/&gt;
 *         &lt;element ref="{}ResidenceTypeCode"/&gt;
 *         &lt;element ref="{}TaxIdentificationNumber"/&gt;
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
    "personTypeCode",
    "residenceTypeCode",
    "taxIdentificationNumber"
})
@XmlRootElement(name = "TaxIdentification")
public class TaxIdentification {

    @XmlElement(name = "PersonTypeCode", required = true)
    protected String personTypeCode;
    @XmlElement(name = "ResidenceTypeCode", required = true)
    protected String residenceTypeCode;
    @XmlElement(name = "TaxIdentificationNumber", required = true)
    protected String taxIdentificationNumber;

    /**
     * Obtiene el valor de la propiedad personTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonTypeCode() {
        return personTypeCode;
    }

    /**
     * Define el valor de la propiedad personTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonTypeCode(String value) {
        this.personTypeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad residenceTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidenceTypeCode() {
        return residenceTypeCode;
    }

    /**
     * Define el valor de la propiedad residenceTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidenceTypeCode(String value) {
        this.residenceTypeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad taxIdentificationNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxIdentificationNumber() {
        return taxIdentificationNumber;
    }

    /**
     * Define el valor de la propiedad taxIdentificationNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxIdentificationNumber(String value) {
        this.taxIdentificationNumber = value;
    }

}
