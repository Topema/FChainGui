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
 *         &lt;element ref="{}TaxTypeCode"/&gt;
 *         &lt;element ref="{}TaxRate"/&gt;
 *         &lt;element ref="{}TaxableBase"/&gt;
 *         &lt;element ref="{}TaxAmount"/&gt;
 *         &lt;element ref="{}EquivalenceSurcharge" minOccurs="0"/&gt;
 *         &lt;element ref="{}EquivalenceSurchargeAmount" minOccurs="0"/&gt;
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
    "taxTypeCode",
    "taxRate",
    "taxableBase",
    "taxAmount",
    "equivalenceSurcharge",
    "equivalenceSurchargeAmount"
})
@XmlRootElement(name = "Tax")
public class Tax {

    @XmlElement(name = "TaxTypeCode")
    protected byte taxTypeCode;
    @XmlElement(name = "TaxRate")
    protected float taxRate;
    @XmlElement(name = "TaxableBase", required = true)
    protected TaxableBase taxableBase;
    @XmlElement(name = "TaxAmount", required = true)
    protected TaxAmount taxAmount;
    @XmlElement(name = "EquivalenceSurcharge")
    protected Float equivalenceSurcharge;
    @XmlElement(name = "EquivalenceSurchargeAmount")
    protected EquivalenceSurchargeAmount equivalenceSurchargeAmount;

    /**
     * Obtiene el valor de la propiedad taxTypeCode.
     * 
     */
    public byte getTaxTypeCode() {
        return taxTypeCode;
    }

    /**
     * Define el valor de la propiedad taxTypeCode.
     * 
     */
    public void setTaxTypeCode(byte value) {
        this.taxTypeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad taxRate.
     * 
     */
    public float getTaxRate() {
        return taxRate;
    }

    /**
     * Define el valor de la propiedad taxRate.
     * 
     */
    public void setTaxRate(float value) {
        this.taxRate = value;
    }

    /**
     * Obtiene el valor de la propiedad taxableBase.
     * 
     * @return
     *     possible object is
     *     {@link TaxableBase }
     *     
     */
    public TaxableBase getTaxableBase() {
        return taxableBase;
    }

    /**
     * Define el valor de la propiedad taxableBase.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxableBase }
     *     
     */
    public void setTaxableBase(TaxableBase value) {
        this.taxableBase = value;
    }

    /**
     * Obtiene el valor de la propiedad taxAmount.
     * 
     * @return
     *     possible object is
     *     {@link TaxAmount }
     *     
     */
    public TaxAmount getTaxAmount() {
        return taxAmount;
    }

    /**
     * Define el valor de la propiedad taxAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxAmount }
     *     
     */
    public void setTaxAmount(TaxAmount value) {
        this.taxAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad equivalenceSurcharge.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getEquivalenceSurcharge() {
        return equivalenceSurcharge;
    }

    /**
     * Define el valor de la propiedad equivalenceSurcharge.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setEquivalenceSurcharge(Float value) {
        this.equivalenceSurcharge = value;
    }

    /**
     * Obtiene el valor de la propiedad equivalenceSurchargeAmount.
     * 
     * @return
     *     possible object is
     *     {@link EquivalenceSurchargeAmount }
     *     
     */
    public EquivalenceSurchargeAmount getEquivalenceSurchargeAmount() {
        return equivalenceSurchargeAmount;
    }

    /**
     * Define el valor de la propiedad equivalenceSurchargeAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link EquivalenceSurchargeAmount }
     *     
     */
    public void setEquivalenceSurchargeAmount(EquivalenceSurchargeAmount value) {
        this.equivalenceSurchargeAmount = value;
    }

}
