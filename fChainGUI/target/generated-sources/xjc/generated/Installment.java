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
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element ref="{}InstallmentDueDate"/&gt;
 *         &lt;element ref="{}InstallmentAmount"/&gt;
 *         &lt;element ref="{}PaymentMeans"/&gt;
 *         &lt;element ref="{}AccountToBeCredited"/&gt;
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
    "installmentDueDate",
    "installmentAmount",
    "paymentMeans",
    "accountToBeCredited"
})
@XmlRootElement(name = "Installment")
public class Installment {

    @XmlElement(name = "InstallmentDueDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar installmentDueDate;
    @XmlElement(name = "InstallmentAmount")
    protected float installmentAmount;
    @XmlElement(name = "PaymentMeans")
    protected byte paymentMeans;
    @XmlElement(name = "AccountToBeCredited", required = true)
    protected AccountToBeCredited accountToBeCredited;

    /**
     * Obtiene el valor de la propiedad installmentDueDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInstallmentDueDate() {
        return installmentDueDate;
    }

    /**
     * Define el valor de la propiedad installmentDueDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInstallmentDueDate(XMLGregorianCalendar value) {
        this.installmentDueDate = value;
    }

    /**
     * Obtiene el valor de la propiedad installmentAmount.
     * 
     */
    public float getInstallmentAmount() {
        return installmentAmount;
    }

    /**
     * Define el valor de la propiedad installmentAmount.
     * 
     */
    public void setInstallmentAmount(float value) {
        this.installmentAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentMeans.
     * 
     */
    public byte getPaymentMeans() {
        return paymentMeans;
    }

    /**
     * Define el valor de la propiedad paymentMeans.
     * 
     */
    public void setPaymentMeans(byte value) {
        this.paymentMeans = value;
    }

    /**
     * Obtiene el valor de la propiedad accountToBeCredited.
     * 
     * @return
     *     possible object is
     *     {@link AccountToBeCredited }
     *     
     */
    public AccountToBeCredited getAccountToBeCredited() {
        return accountToBeCredited;
    }

    /**
     * Define el valor de la propiedad accountToBeCredited.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountToBeCredited }
     *     
     */
    public void setAccountToBeCredited(AccountToBeCredited value) {
        this.accountToBeCredited = value;
    }

}
