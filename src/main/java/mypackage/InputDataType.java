
package mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for inputDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="inputDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="keyValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="localarea" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="obsid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tm" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inputDataType", propOrder = {
    "keyValue",
    "localarea",
    "obsid",
    "tm"
})
public class InputDataType {

    @XmlElement(required = true)
    protected String keyValue;
    @XmlElement(required = true)
    protected String localarea;
    @XmlElement(required = true)
    protected String obsid;
    @XmlElement(required = true)
    protected String tm;

    /**
     * Gets the value of the keyValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyValue() {
        return keyValue;
    }

    /**
     * Sets the value of the keyValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyValue(String value) {
        this.keyValue = value;
    }

    /**
     * Gets the value of the localarea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalarea() {
        return localarea;
    }

    /**
     * Sets the value of the localarea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalarea(String value) {
        this.localarea = value;
    }

    /**
     * Gets the value of the obsid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObsid() {
        return obsid;
    }

    /**
     * Sets the value of the obsid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObsid(String value) {
        this.obsid = value;
    }

    /**
     * Gets the value of the tm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTm() {
        return tm;
    }

    /**
     * Sets the value of the tm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTm(String value) {
        this.tm = value;
    }

}
