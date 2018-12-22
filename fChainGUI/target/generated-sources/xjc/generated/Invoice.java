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
 *         &lt;element ref="{}InvoiceHeader"/&gt;
 *         &lt;element ref="{}InvoiceIssueData"/&gt;
 *         &lt;element ref="{}TaxesOutputs"/&gt;
 *         &lt;element ref="{}InvoiceTotals"/&gt;
 *         &lt;element ref="{}Items"/&gt;
 *         &lt;element ref="{}PaymentDetails"/&gt;
 *         &lt;element ref="{}AdditionalData"/&gt;
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
    "invoiceHeader",
    "invoiceIssueData",
    "taxesOutputs",
    "invoiceTotals",
    "items",
    "paymentDetails",
    "additionalData"
})
@XmlRootElement(name = "Invoice")
public class Invoice {

    @XmlElement(name = "InvoiceHeader", required = true)
    protected InvoiceHeader invoiceHeader;
    @XmlElement(name = "InvoiceIssueData", required = true)
    protected InvoiceIssueData invoiceIssueData;
    @XmlElement(name = "TaxesOutputs", required = true)
    protected TaxesOutputs taxesOutputs;
    @XmlElement(name = "InvoiceTotals", required = true)
    protected InvoiceTotals invoiceTotals;
    @XmlElement(name = "Items", required = true)
    protected Items items;
    @XmlElement(name = "PaymentDetails", required = true)
    protected PaymentDetails paymentDetails;
    @XmlElement(name = "AdditionalData", required = true)
    protected String additionalData;

    /**
     * Obtiene el valor de la propiedad invoiceHeader.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceHeader }
     *     
     */
    public InvoiceHeader getInvoiceHeader() {
        return invoiceHeader;
    }

    /**
     * Define el valor de la propiedad invoiceHeader.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceHeader }
     *     
     */
    public void setInvoiceHeader(InvoiceHeader value) {
        this.invoiceHeader = value;
    }

    /**
     * Obtiene el valor de la propiedad invoiceIssueData.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceIssueData }
     *     
     */
    public InvoiceIssueData getInvoiceIssueData() {
        return invoiceIssueData;
    }

    /**
     * Define el valor de la propiedad invoiceIssueData.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceIssueData }
     *     
     */
    public void setInvoiceIssueData(InvoiceIssueData value) {
        this.invoiceIssueData = value;
    }

    /**
     * Obtiene el valor de la propiedad taxesOutputs.
     * 
     * @return
     *     possible object is
     *     {@link TaxesOutputs }
     *     
     */
    public TaxesOutputs getTaxesOutputs() {
        return taxesOutputs;
    }

    /**
     * Define el valor de la propiedad taxesOutputs.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxesOutputs }
     *     
     */
    public void setTaxesOutputs(TaxesOutputs value) {
        this.taxesOutputs = value;
    }

    /**
     * Obtiene el valor de la propiedad invoiceTotals.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceTotals }
     *     
     */
    public InvoiceTotals getInvoiceTotals() {
        return invoiceTotals;
    }

    /**
     * Define el valor de la propiedad invoiceTotals.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceTotals }
     *     
     */
    public void setInvoiceTotals(InvoiceTotals value) {
        this.invoiceTotals = value;
    }

    /**
     * Obtiene el valor de la propiedad items.
     * 
     * @return
     *     possible object is
     *     {@link Items }
     *     
     */
    public Items getItems() {
        return items;
    }

    /**
     * Define el valor de la propiedad items.
     * 
     * @param value
     *     allowed object is
     *     {@link Items }
     *     
     */
    public void setItems(Items value) {
        this.items = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentDetails.
     * 
     * @return
     *     possible object is
     *     {@link PaymentDetails }
     *     
     */
    public PaymentDetails getPaymentDetails() {
        return paymentDetails;
    }

    /**
     * Define el valor de la propiedad paymentDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentDetails }
     *     
     */
    public void setPaymentDetails(PaymentDetails value) {
        this.paymentDetails = value;
    }

    /**
     * Obtiene el valor de la propiedad additionalData.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalData() {
        return additionalData;
    }

    /**
     * Define el valor de la propiedad additionalData.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalData(String value) {
        this.additionalData = value;
    }

}
