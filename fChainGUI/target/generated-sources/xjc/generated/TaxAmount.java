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
 *         &lt;element ref="{}TotalAmount"/&gt;
 *         &lt;element ref="{}EquivalentInEuros"/&gt;
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
    "totalAmount",
    "equivalentInEuros"
})
@XmlRootElement(name = "TaxAmount")
public class TaxAmount {

    @XmlElement(name = "TotalAmount")
    protected float totalAmount;
    @XmlElement(name = "EquivalentInEuros")
    protected float equivalentInEuros;

    /**
     * Obtiene el valor de la propiedad totalAmount.
     * 
     */
    public float getTotalAmount() {
        return totalAmount;
    }

    /**
     * Define el valor de la propiedad totalAmount.
     * 
     */
    public void setTotalAmount(float value) {
        this.totalAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad equivalentInEuros.
     * 
     */
    public float getEquivalentInEuros() {
        return equivalentInEuros;
    }

    /**
     * Define el valor de la propiedad equivalentInEuros.
     * 
     */
    public void setEquivalentInEuros(float value) {
        this.equivalentInEuros = value;
    }

}
