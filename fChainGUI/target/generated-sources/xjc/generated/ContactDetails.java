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
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element ref="{}Telephone"/&gt;
 *         &lt;element ref="{}TeleFax"/&gt;
 *         &lt;element ref="{}WebAddress" minOccurs="0"/&gt;
 *         &lt;element ref="{}ElectronicMail"/&gt;
 *         &lt;element ref="{}ContactPersons" minOccurs="0"/&gt;
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
    "telephone",
    "teleFax",
    "webAddress",
    "electronicMail",
    "contactPersons"
})
@XmlRootElement(name = "ContactDetails")
public class ContactDetails {

    @XmlElement(name = "Telephone")
    protected int telephone;
    @XmlElement(name = "TeleFax")
    protected int teleFax;
    @XmlElement(name = "WebAddress")
    @XmlSchemaType(name = "anyURI")
    protected String webAddress;
    @XmlElement(name = "ElectronicMail", required = true)
    protected String electronicMail;
    @XmlElement(name = "ContactPersons")
    protected String contactPersons;

    /**
     * Obtiene el valor de la propiedad telephone.
     * 
     */
    public int getTelephone() {
        return telephone;
    }

    /**
     * Define el valor de la propiedad telephone.
     * 
     */
    public void setTelephone(int value) {
        this.telephone = value;
    }

    /**
     * Obtiene el valor de la propiedad teleFax.
     * 
     */
    public int getTeleFax() {
        return teleFax;
    }

    /**
     * Define el valor de la propiedad teleFax.
     * 
     */
    public void setTeleFax(int value) {
        this.teleFax = value;
    }

    /**
     * Obtiene el valor de la propiedad webAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebAddress() {
        return webAddress;
    }

    /**
     * Define el valor de la propiedad webAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebAddress(String value) {
        this.webAddress = value;
    }

    /**
     * Obtiene el valor de la propiedad electronicMail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElectronicMail() {
        return electronicMail;
    }

    /**
     * Define el valor de la propiedad electronicMail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElectronicMail(String value) {
        this.electronicMail = value;
    }

    /**
     * Obtiene el valor de la propiedad contactPersons.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPersons() {
        return contactPersons;
    }

    /**
     * Define el valor de la propiedad contactPersons.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPersons(String value) {
        this.contactPersons = value;
    }

}
