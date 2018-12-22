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
 *         &lt;element ref="{}SchemaVersion"/&gt;
 *         &lt;element ref="{}Modality"/&gt;
 *         &lt;element ref="{}InvoiceIssuerType"/&gt;
 *         &lt;element ref="{}Batch"/&gt;
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
    "schemaVersion",
    "modality",
    "invoiceIssuerType",
    "batch"
})
@XmlRootElement(name = "FileHeader")
public class FileHeader {

    @XmlElement(name = "SchemaVersion")
    protected float schemaVersion;
    @XmlElement(name = "Modality", required = true)
    protected String modality;
    @XmlElement(name = "InvoiceIssuerType", required = true)
    protected String invoiceIssuerType;
    @XmlElement(name = "Batch", required = true)
    protected Batch batch;

    /**
     * Obtiene el valor de la propiedad schemaVersion.
     * 
     */
    public float getSchemaVersion() {
        return schemaVersion;
    }

    /**
     * Define el valor de la propiedad schemaVersion.
     * 
     */
    public void setSchemaVersion(float value) {
        this.schemaVersion = value;
    }

    /**
     * Obtiene el valor de la propiedad modality.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModality() {
        return modality;
    }

    /**
     * Define el valor de la propiedad modality.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModality(String value) {
        this.modality = value;
    }

    /**
     * Obtiene el valor de la propiedad invoiceIssuerType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceIssuerType() {
        return invoiceIssuerType;
    }

    /**
     * Define el valor de la propiedad invoiceIssuerType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceIssuerType(String value) {
        this.invoiceIssuerType = value;
    }

    /**
     * Obtiene el valor de la propiedad batch.
     * 
     * @return
     *     possible object is
     *     {@link Batch }
     *     
     */
    public Batch getBatch() {
        return batch;
    }

    /**
     * Define el valor de la propiedad batch.
     * 
     * @param value
     *     allowed object is
     *     {@link Batch }
     *     
     */
    public void setBatch(Batch value) {
        this.batch = value;
    }

}
