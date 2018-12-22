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
 *         &lt;element ref="{}TotalGrossAmount"/&gt;
 *         &lt;element ref="{}TotalGrossAmountBeforeTaxes"/&gt;
 *         &lt;element ref="{}TotalTaxOutputs"/&gt;
 *         &lt;element ref="{}TotalTaxesWithheld"/&gt;
 *         &lt;element ref="{}InvoiceTotal"/&gt;
 *         &lt;element ref="{}TotalOutstandingAmount"/&gt;
 *         &lt;element ref="{}TotalPaymentsOnAccount"/&gt;
 *         &lt;element ref="{}TotalExecutableAmount"/&gt;
 *         &lt;element ref="{}TotalReimbursableExpenses"/&gt;
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
    "totalGrossAmount",
    "totalGrossAmountBeforeTaxes",
    "totalTaxOutputs",
    "totalTaxesWithheld",
    "invoiceTotal",
    "totalOutstandingAmount",
    "totalPaymentsOnAccount",
    "totalExecutableAmount",
    "totalReimbursableExpenses"
})
@XmlRootElement(name = "InvoiceTotals")
public class InvoiceTotals {

    @XmlElement(name = "TotalGrossAmount")
    protected float totalGrossAmount;
    @XmlElement(name = "TotalGrossAmountBeforeTaxes")
    protected float totalGrossAmountBeforeTaxes;
    @XmlElement(name = "TotalTaxOutputs")
    protected float totalTaxOutputs;
    @XmlElement(name = "TotalTaxesWithheld")
    protected float totalTaxesWithheld;
    @XmlElement(name = "InvoiceTotal")
    protected float invoiceTotal;
    @XmlElement(name = "TotalOutstandingAmount", required = true)
    protected TotalOutstandingAmount totalOutstandingAmount;
    @XmlElement(name = "TotalPaymentsOnAccount")
    protected float totalPaymentsOnAccount;
    @XmlElement(name = "TotalExecutableAmount", required = true)
    protected TotalExecutableAmount totalExecutableAmount;
    @XmlElement(name = "TotalReimbursableExpenses")
    protected float totalReimbursableExpenses;

    /**
     * Obtiene el valor de la propiedad totalGrossAmount.
     * 
     */
    public float getTotalGrossAmount() {
        return totalGrossAmount;
    }

    /**
     * Define el valor de la propiedad totalGrossAmount.
     * 
     */
    public void setTotalGrossAmount(float value) {
        this.totalGrossAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad totalGrossAmountBeforeTaxes.
     * 
     */
    public float getTotalGrossAmountBeforeTaxes() {
        return totalGrossAmountBeforeTaxes;
    }

    /**
     * Define el valor de la propiedad totalGrossAmountBeforeTaxes.
     * 
     */
    public void setTotalGrossAmountBeforeTaxes(float value) {
        this.totalGrossAmountBeforeTaxes = value;
    }

    /**
     * Obtiene el valor de la propiedad totalTaxOutputs.
     * 
     */
    public float getTotalTaxOutputs() {
        return totalTaxOutputs;
    }

    /**
     * Define el valor de la propiedad totalTaxOutputs.
     * 
     */
    public void setTotalTaxOutputs(float value) {
        this.totalTaxOutputs = value;
    }

    /**
     * Obtiene el valor de la propiedad totalTaxesWithheld.
     * 
     */
    public float getTotalTaxesWithheld() {
        return totalTaxesWithheld;
    }

    /**
     * Define el valor de la propiedad totalTaxesWithheld.
     * 
     */
    public void setTotalTaxesWithheld(float value) {
        this.totalTaxesWithheld = value;
    }

    /**
     * Obtiene el valor de la propiedad invoiceTotal.
     * 
     */
    public float getInvoiceTotal() {
        return invoiceTotal;
    }

    /**
     * Define el valor de la propiedad invoiceTotal.
     * 
     */
    public void setInvoiceTotal(float value) {
        this.invoiceTotal = value;
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
     * Obtiene el valor de la propiedad totalPaymentsOnAccount.
     * 
     */
    public float getTotalPaymentsOnAccount() {
        return totalPaymentsOnAccount;
    }

    /**
     * Define el valor de la propiedad totalPaymentsOnAccount.
     * 
     */
    public void setTotalPaymentsOnAccount(float value) {
        this.totalPaymentsOnAccount = value;
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
     * Obtiene el valor de la propiedad totalReimbursableExpenses.
     * 
     */
    public float getTotalReimbursableExpenses() {
        return totalReimbursableExpenses;
    }

    /**
     * Define el valor de la propiedad totalReimbursableExpenses.
     * 
     */
    public void setTotalReimbursableExpenses(float value) {
        this.totalReimbursableExpenses = value;
    }

}
