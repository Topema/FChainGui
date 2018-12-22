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
 *         &lt;element ref="{}BatchIdentifier"/&gt;
 *         &lt;element ref="{}InvoicesCount"/&gt;
 *         &lt;element ref="{}TotalInvoicesAmount"/&gt;
 *         &lt;element ref="{}TotalOutstandingAmount"/&gt;
 *         &lt;element ref="{}TotalExecutableAmount"/&gt;
 *         &lt;element ref="{}InvoiceCurrencyCode"/&gt;
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
    "batchIdentifier",
    "invoicesCount",
    "totalInvoicesAmount",
    "totalOutstandingAmount",
    "totalExecutableAmount",
    "invoiceCurrencyCode"
})
@XmlRootElement(name = "Batch")
public class Batch {

    @XmlElement(name = "BatchIdentifier", required = true)
    protected String batchIdentifier;
    @XmlElement(name = "InvoicesCount")
    protected byte invoicesCount;
    @XmlElement(name = "TotalInvoicesAmount", required = true)
    protected TotalInvoicesAmount totalInvoicesAmount;
    @XmlElement(name = "TotalOutstandingAmount", required = true)
    protected TotalOutstandingAmount totalOutstandingAmount;
    @XmlElement(name = "TotalExecutableAmount", required = true)
    protected TotalExecutableAmount totalExecutableAmount;
    @XmlElement(name = "InvoiceCurrencyCode", required = true)
    protected String invoiceCurrencyCode;

    /**
     * Obtiene el valor de la propiedad batchIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchIdentifier() {
        return batchIdentifier;
    }

    /**
     * Define el valor de la propiedad batchIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchIdentifier(String value) {
        this.batchIdentifier = value;
    }

    /**
     * Obtiene el valor de la propiedad invoicesCount.
     * 
     */
    public byte getInvoicesCount() {
        return invoicesCount;
    }

    /**
     * Define el valor de la propiedad invoicesCount.
     * 
     */
    public void setInvoicesCount(byte value) {
        this.invoicesCount = value;
    }

    /**
     * Obtiene el valor de la propiedad totalInvoicesAmount.
     * 
     * @return
     *     possible object is
     *     {@link TotalInvoicesAmount }
     *     
     */
    public TotalInvoicesAmount getTotalInvoicesAmount() {
        return totalInvoicesAmount;
    }

    /**
     * Define el valor de la propiedad totalInvoicesAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalInvoicesAmount }
     *     
     */
    public void setTotalInvoicesAmount(TotalInvoicesAmount value) {
        this.totalInvoicesAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad totalOutstandingAmount.
     * 
     * @return
     *     possible object is
     *     {@link TotalOutstandingAmount }
     *     
     */
    public TotalOutstandingAmount getTotalOutstandingAmount() {
        return totalOutstandingAmount;
    }

    /**
     * Define el valor de la propiedad totalOutstandingAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalOutstandingAmount }
     *     
     */
    public void setTotalOutstandingAmount(TotalOutstandingAmount value) {
        this.totalOutstandingAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad totalExecutableAmount.
     * 
     * @return
     *     possible object is
     *     {@link TotalExecutableAmount }
     *     
     */
    public TotalExecutableAmount getTotalExecutableAmount() {
        return totalExecutableAmount;
    }

    /**
     * Define el valor de la propiedad totalExecutableAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalExecutableAmount }
     *     
     */
    public void setTotalExecutableAmount(TotalExecutableAmount value) {
        this.totalExecutableAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad invoiceCurrencyCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceCurrencyCode() {
        return invoiceCurrencyCode;
    }

    /**
     * Define el valor de la propiedad invoiceCurrencyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceCurrencyCode(String value) {
        this.invoiceCurrencyCode = value;
    }

}
