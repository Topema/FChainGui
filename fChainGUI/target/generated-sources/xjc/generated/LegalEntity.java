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
 *         &lt;element ref="{}CorporateName"/&gt;
 *         &lt;element ref="{}TradeName"/&gt;
 *         &lt;element ref="{}RegistrationData"/&gt;
 *         &lt;element ref="{}AddressInSpain"/&gt;
 *         &lt;element ref="{}ContactDetails"/&gt;
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
    "corporateName",
    "tradeName",
    "registrationData",
    "addressInSpain",
    "contactDetails"
})
@XmlRootElement(name = "LegalEntity")
public class LegalEntity {

    @XmlElement(name = "CorporateName", required = true)
    protected String corporateName;
    @XmlElement(name = "TradeName", required = true)
    protected String tradeName;
    @XmlElement(name = "RegistrationData", required = true)
    protected String registrationData;
    @XmlElement(name = "AddressInSpain", required = true)
    protected AddressInSpain addressInSpain;
    @XmlElement(name = "ContactDetails", required = true)
    protected ContactDetails contactDetails;

    /**
     * Obtiene el valor de la propiedad corporateName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorporateName() {
        return corporateName;
    }

    /**
     * Define el valor de la propiedad corporateName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorporateName(String value) {
        this.corporateName = value;
    }

    /**
     * Obtiene el valor de la propiedad tradeName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeName() {
        return tradeName;
    }

    /**
     * Define el valor de la propiedad tradeName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeName(String value) {
        this.tradeName = value;
    }

    /**
     * Obtiene el valor de la propiedad registrationData.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationData() {
        return registrationData;
    }

    /**
     * Define el valor de la propiedad registrationData.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationData(String value) {
        this.registrationData = value;
    }

    /**
     * Obtiene el valor de la propiedad addressInSpain.
     * 
     * @return
     *     possible object is
     *     {@link AddressInSpain }
     *     
     */
    public AddressInSpain getAddressInSpain() {
        return addressInSpain;
    }

    /**
     * Define el valor de la propiedad addressInSpain.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressInSpain }
     *     
     */
    public void setAddressInSpain(AddressInSpain value) {
        this.addressInSpain = value;
    }

    /**
     * Obtiene el valor de la propiedad contactDetails.
     * 
     * @return
     *     possible object is
     *     {@link ContactDetails }
     *     
     */
    public ContactDetails getContactDetails() {
        return contactDetails;
    }

    /**
     * Define el valor de la propiedad contactDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactDetails }
     *     
     */
    public void setContactDetails(ContactDetails value) {
        this.contactDetails = value;
    }

}
