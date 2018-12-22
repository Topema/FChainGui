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
 *         &lt;element ref="{}IssueDate"/&gt;
 *         &lt;element ref="{}OperationDate"/&gt;
 *         &lt;element ref="{}InvoicingPeriod"/&gt;
 *         &lt;element ref="{}InvoiceCurrencyCode"/&gt;
 *         &lt;element ref="{}ExchangeRateDetails"/&gt;
 *         &lt;element ref="{}TaxCurrencyCode"/&gt;
 *         &lt;element ref="{}LanguageName"/&gt;
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
    "issueDate",
    "operationDate",
    "invoicingPeriod",
    "invoiceCurrencyCode",
    "exchangeRateDetails",
    "taxCurrencyCode",
    "languageName"
})
@XmlRootElement(name = "InvoiceIssueData")
public class InvoiceIssueData {

    @XmlElement(name = "IssueDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar issueDate;
    @XmlElement(name = "OperationDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar operationDate;
    @XmlElement(name = "InvoicingPeriod", required = true)
    protected InvoicingPeriod invoicingPeriod;
    @XmlElement(name = "InvoiceCurrencyCode", required = true)
    protected String invoiceCurrencyCode;
    @XmlElement(name = "ExchangeRateDetails", required = true)
    protected ExchangeRateDetails exchangeRateDetails;
    @XmlElement(name = "TaxCurrencyCode", required = true)
    protected String taxCurrencyCode;
    @XmlElement(name = "LanguageName", required = true)
    protected String languageName;

    /**
     * Obtiene el valor de la propiedad issueDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIssueDate() {
        return issueDate;
    }

    /**
     * Define el valor de la propiedad issueDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIssueDate(XMLGregorianCalendar value) {
        this.issueDate = value;
    }

    /**
     * Obtiene el valor de la propiedad operationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOperationDate() {
        return operationDate;
    }

    /**
     * Define el valor de la propiedad operationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOperationDate(XMLGregorianCalendar value) {
        this.operationDate = value;
    }

    /**
     * Obtiene el valor de la propiedad invoicingPeriod.
     * 
     * @return
     *     possible object is
     *     {@link InvoicingPeriod }
     *     
     */
    public InvoicingPeriod getInvoicingPeriod() {
        return invoicingPeriod;
    }

    /**
     * Define el valor de la propiedad invoicingPeriod.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoicingPeriod }
     *     
     */
    public void setInvoicingPeriod(InvoicingPeriod value) {
        this.invoicingPeriod = value;
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

    /**
     * Obtiene el valor de la propiedad exchangeRateDetails.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeRateDetails }
     *     
     */
    public ExchangeRateDetails getExchangeRateDetails() {
        return exchangeRateDetails;
    }

    /**
     * Define el valor de la propiedad exchangeRateDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeRateDetails }
     *     
     */
    public void setExchangeRateDetails(ExchangeRateDetails value) {
        this.exchangeRateDetails = value;
    }

    /**
     * Obtiene el valor de la propiedad taxCurrencyCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxCurrencyCode() {
        return taxCurrencyCode;
    }

    /**
     * Define el valor de la propiedad taxCurrencyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxCurrencyCode(String value) {
        this.taxCurrencyCode = value;
    }

    /**
     * Obtiene el valor de la propiedad languageName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageName() {
        return languageName;
    }

    /**
     * Define el valor de la propiedad languageName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageName(String value) {
        this.languageName = value;
    }

}
