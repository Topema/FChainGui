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
 *         &lt;element ref="{}IBAN"/&gt;
 *         &lt;element ref="{}BankCode"/&gt;
 *         &lt;element ref="{}BranchCode"/&gt;
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
    "iban",
    "bankCode",
    "branchCode"
})
@XmlRootElement(name = "AccountToBeCredited")
public class AccountToBeCredited {

    @XmlElement(name = "IBAN", required = true)
    protected String iban;
    @XmlElement(name = "BankCode")
    protected short bankCode;
    @XmlElement(name = "BranchCode")
    protected short branchCode;

    /**
     * Obtiene el valor de la propiedad iban.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIBAN() {
        return iban;
    }

    /**
     * Define el valor de la propiedad iban.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIBAN(String value) {
        this.iban = value;
    }

    /**
     * Obtiene el valor de la propiedad bankCode.
     * 
     */
    public short getBankCode() {
        return bankCode;
    }

    /**
     * Define el valor de la propiedad bankCode.
     * 
     */
    public void setBankCode(short value) {
        this.bankCode = value;
    }

    /**
     * Obtiene el valor de la propiedad branchCode.
     * 
     */
    public short getBranchCode() {
        return branchCode;
    }

    /**
     * Define el valor de la propiedad branchCode.
     * 
     */
    public void setBranchCode(short value) {
        this.branchCode = value;
    }

}
