
package mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for itemsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="itemsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="obsname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="localarea" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tm10m" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hm10m" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="wd10m" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="wd10mstr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ws10m" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cprn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ts" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tm2m" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hm2m" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="wd2m" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="wd2mstr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ws2m" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="obsid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "itemsType", propOrder = {
    "obsname",
    "localarea",
    "tm10M",
    "hm10M",
    "wd10M",
    "wd10Mstr",
    "ws10M",
    "rn",
    "cprn",
    "pa",
    "ts",
    "tm2M",
    "hm2M",
    "wd2M",
    "wd2Mstr",
    "ws2M"
})
public class ItemsType {

    @XmlElement(required = true)
    protected String obsname;
    @XmlElement(required = true)
    protected String localarea;
    @XmlElement(name = "tm10m", required = true)
    protected String tm10M;
    @XmlElement(name = "hm10m", required = true)
    protected String hm10M;
    @XmlElement(name = "wd10m", required = true)
    protected String wd10M;
    @XmlElement(name = "wd10mstr", required = true)
    protected String wd10Mstr;
    @XmlElement(name = "ws10m", required = true)
    protected String ws10M;
    @XmlElement(required = true)
    protected String rn;
    @XmlElement(required = true)
    protected String cprn;
    @XmlElement(required = true)
    protected String pa;
    @XmlElement(required = true)
    protected String ts;
    @XmlElement(name = "tm2m", required = true)
    protected String tm2M;
    @XmlElement(name = "hm2m", required = true)
    protected String hm2M;
    @XmlElement(name = "wd2m", required = true)
    protected String wd2M;
    @XmlElement(name = "wd2mstr", required = true)
    protected String wd2Mstr;
    @XmlElement(name = "ws2m", required = true)
    protected String ws2M;
    @XmlAttribute(name = "obsid")
    protected String obsid;

    /**
     * Gets the value of the obsname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObsname() {
        return obsname;
    }

    /**
     * Sets the value of the obsname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObsname(String value) {
        this.obsname = value;
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
     * Gets the value of the tm10M property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTm10M() {
        return tm10M;
    }

    /**
     * Sets the value of the tm10M property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTm10M(String value) {
        this.tm10M = value;
    }

    /**
     * Gets the value of the hm10M property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHm10M() {
        return hm10M;
    }

    /**
     * Sets the value of the hm10M property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHm10M(String value) {
        this.hm10M = value;
    }

    /**
     * Gets the value of the wd10M property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWd10M() {
        return wd10M;
    }

    /**
     * Sets the value of the wd10M property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWd10M(String value) {
        this.wd10M = value;
    }

    /**
     * Gets the value of the wd10Mstr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWd10Mstr() {
        return wd10Mstr;
    }

    /**
     * Sets the value of the wd10Mstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWd10Mstr(String value) {
        this.wd10Mstr = value;
    }

    /**
     * Gets the value of the ws10M property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWs10M() {
        return ws10M;
    }

    /**
     * Sets the value of the ws10M property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWs10M(String value) {
        this.ws10M = value;
    }

    /**
     * Gets the value of the rn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRn() {
        return rn;
    }

    /**
     * Sets the value of the rn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRn(String value) {
        this.rn = value;
    }

    /**
     * Gets the value of the cprn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCprn() {
        return cprn;
    }

    /**
     * Sets the value of the cprn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCprn(String value) {
        this.cprn = value;
    }

    /**
     * Gets the value of the pa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPa() {
        return pa;
    }

    /**
     * Sets the value of the pa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPa(String value) {
        this.pa = value;
    }

    /**
     * Gets the value of the ts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTs() {
        return ts;
    }

    /**
     * Sets the value of the ts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTs(String value) {
        this.ts = value;
    }

    /**
     * Gets the value of the tm2M property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTm2M() {
        return tm2M;
    }

    /**
     * Sets the value of the tm2M property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTm2M(String value) {
        this.tm2M = value;
    }

    /**
     * Gets the value of the hm2M property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHm2M() {
        return hm2M;
    }

    /**
     * Sets the value of the hm2M property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHm2M(String value) {
        this.hm2M = value;
    }

    /**
     * Gets the value of the wd2M property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWd2M() {
        return wd2M;
    }

    /**
     * Sets the value of the wd2M property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWd2M(String value) {
        this.wd2M = value;
    }

    /**
     * Gets the value of the wd2Mstr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWd2Mstr() {
        return wd2Mstr;
    }

    /**
     * Sets the value of the wd2Mstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWd2Mstr(String value) {
        this.wd2Mstr = value;
    }

    /**
     * Gets the value of the ws2M property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWs2M() {
        return ws2M;
    }

    /**
     * Sets the value of the ws2M property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWs2M(String value) {
        this.ws2M = value;
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

}
