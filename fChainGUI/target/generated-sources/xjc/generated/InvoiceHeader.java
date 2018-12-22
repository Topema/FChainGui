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
 *         &lt;element ref="{}InvoiceNumber"/&gt;
 *         &lt;element ref="{}InvoiceSeriesCode"/&gt;
 *         &lt;element ref="{}InvoiceDocumentType"/&gt;
 *         &lt;element ref="{}InvoiceClass"/&gt;
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
    "invoiceNumber",
    "invoiceSeriesCode",
    "invoiceDocumentType",
    "invoiceClass"
})
@XmlRootElement(name = "InvoiceHeader")
public class InvoiceHeader {

    @XmlElement(name = "InvoiceNumber")
    protected int invoiceNumber;
    @XmlElement(name = "InvoiceSeriesCode", required = true)
    protected String invoiceSeriesCode;
    @XmlElement(name = "InvoiceDocumentType", required = true)
    protected String invoiceDocumentType;
    @XmlElement(name = "InvoiceClass", required = true)
    protected String invoiceClass;

    /**
     * Obtiene el valor de la propiedad invoiceNumber.
     * 
     */
    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * Define el valor de la propiedad invoiceNumber.
     * 
     */
    public void setInvoiceNumber(int value) {
        this.invoiceNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad invoiceSeriesCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceSeriesCode() {
        return invoiceSeriesCode;
    }

    /**
     * Define el valor de la propiedad invoiceSeriesCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceSeriesCode(String value) {
        this.invoiceSeriesCode = value;
    }

    /**
     * Obtiene el valor de la propiedad invoiceDocumentType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceDocumentType() {
        return invoiceDocumentType;
    }

    /**
     * Define el valor de la propiedad invoiceDocumentType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceDocumentType(String value) {
        this.invoiceDocumentType = value;
    }

    /**
     * Obtiene el valor de la propiedad invoiceClass.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceClass() {
        return invoiceClass;
    }

    /**
     * Define el valor de la propiedad invoiceClass.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceClass(String value) {
        this.invoiceClass = value;
    }

}
