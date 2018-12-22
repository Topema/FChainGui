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
 *         &lt;element ref="{}SellerParty"/&gt;
 *         &lt;element ref="{}BuyerParty"/&gt;
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
    "sellerParty",
    "buyerParty"
})
@XmlRootElement(name = "Parties")
public class Parties {

    @XmlElement(name = "SellerParty", required = true)
    protected SellerParty sellerParty;
    @XmlElement(name = "BuyerParty", required = true)
    protected BuyerParty buyerParty;

    /**
     * Obtiene el valor de la propiedad sellerParty.
     * 
     * @return
     *     possible object is
     *     {@link SellerParty }
     *     
     */
    public SellerParty getSellerParty() {
        return sellerParty;
    }

    /**
     * Define el valor de la propiedad sellerParty.
     * 
     * @param value
     *     allowed object is
     *     {@link SellerParty }
     *     
     */
    public void setSellerParty(SellerParty value) {
        this.sellerParty = value;
    }

    /**
     * Obtiene el valor de la propiedad buyerParty.
     * 
     * @return
     *     possible object is
     *     {@link BuyerParty }
     *     
     */
    public BuyerParty getBuyerParty() {
        return buyerParty;
    }

    /**
     * Define el valor de la propiedad buyerParty.
     * 
     * @param value
     *     allowed object is
     *     {@link BuyerParty }
     *     
     */
    public void setBuyerParty(BuyerParty value) {
        this.buyerParty = value;
    }

}
