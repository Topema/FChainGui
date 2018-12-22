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
 *         &lt;element ref="{}ReceiverContractReference" minOccurs="0"/&gt;
 *         &lt;element ref="{}ItemDescription"/&gt;
 *         &lt;element ref="{}Quantity"/&gt;
 *         &lt;element ref="{}UnitOfMeasure"/&gt;
 *         &lt;element ref="{}UnitPriceWithoutTax"/&gt;
 *         &lt;element ref="{}TotalCost"/&gt;
 *         &lt;element ref="{}GrossAmount"/&gt;
 *         &lt;element ref="{}TaxesOutputs"/&gt;
 *         &lt;element ref="{}ArticleCode"/&gt;
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
    "receiverContractReference",
    "itemDescription",
    "quantity",
    "unitOfMeasure",
    "unitPriceWithoutTax",
    "totalCost",
    "grossAmount",
    "taxesOutputs",
    "articleCode"
})
@XmlRootElement(name = "InvoiceLine")
public class InvoiceLine {

    @XmlElement(name = "ReceiverContractReference")
    protected Integer receiverContractReference;
    @XmlElement(name = "ItemDescription", required = true)
    protected String itemDescription;
    @XmlElement(name = "Quantity")
    protected float quantity;
    @XmlElement(name = "UnitOfMeasure")
    protected byte unitOfMeasure;
    @XmlElement(name = "UnitPriceWithoutTax")
    protected float unitPriceWithoutTax;
    @XmlElement(name = "TotalCost")
    protected float totalCost;
    @XmlElement(name = "GrossAmount")
    protected float grossAmount;
    @XmlElement(name = "TaxesOutputs", required = true)
    protected TaxesOutputs taxesOutputs;
    @XmlElement(name = "ArticleCode")
    protected int articleCode;

    /**
     * Obtiene el valor de la propiedad receiverContractReference.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReceiverContractReference() {
        return receiverContractReference;
    }

    /**
     * Define el valor de la propiedad receiverContractReference.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReceiverContractReference(Integer value) {
        this.receiverContractReference = value;
    }

    /**
     * Obtiene el valor de la propiedad itemDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemDescription() {
        return itemDescription;
    }

    /**
     * Define el valor de la propiedad itemDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemDescription(String value) {
        this.itemDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad quantity.
     * 
     */
    public float getQuantity() {
        return quantity;
    }

    /**
     * Define el valor de la propiedad quantity.
     * 
     */
    public void setQuantity(float value) {
        this.quantity = value;
    }

    /**
     * Obtiene el valor de la propiedad unitOfMeasure.
     * 
     */
    public byte getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Define el valor de la propiedad unitOfMeasure.
     * 
     */
    public void setUnitOfMeasure(byte value) {
        this.unitOfMeasure = value;
    }

    /**
     * Obtiene el valor de la propiedad unitPriceWithoutTax.
     * 
     */
    public float getUnitPriceWithoutTax() {
        return unitPriceWithoutTax;
    }

    /**
     * Define el valor de la propiedad unitPriceWithoutTax.
     * 
     */
    public void setUnitPriceWithoutTax(float value) {
        this.unitPriceWithoutTax = value;
    }

    /**
     * Obtiene el valor de la propiedad totalCost.
     * 
     */
    public float getTotalCost() {
        return totalCost;
    }

    /**
     * Define el valor de la propiedad totalCost.
     * 
     */
    public void setTotalCost(float value) {
        this.totalCost = value;
    }

    /**
     * Obtiene el valor de la propiedad grossAmount.
     * 
     */
    public float getGrossAmount() {
        return grossAmount;
    }

    /**
     * Define el valor de la propiedad grossAmount.
     * 
     */
    public void setGrossAmount(float value) {
        this.grossAmount = value;
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
     * Obtiene el valor de la propiedad articleCode.
     * 
     */
    public int getArticleCode() {
        return articleCode;
    }

    /**
     * Define el valor de la propiedad articleCode.
     * 
     */
    public void setArticleCode(int value) {
        this.articleCode = value;
    }

}
