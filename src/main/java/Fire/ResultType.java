
package Fire;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="totalCnt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pageUnit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pageIndex" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="searchStDt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="searchEdDt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="frstFireInfo" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ocurDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ocurYoil" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="              ��          "/>
 *                         &lt;enumeration value="              ��          "/>
 *                         &lt;enumeration value="              ��          "/>
 *                         &lt;enumeration value="              ȭ          "/>
 *                         &lt;enumeration value="              ��          "/>
 *                         &lt;enumeration value="              ��          "/>
 *                         &lt;enumeration value="              ��          "/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="extingDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="exintgTm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ocurGm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ocurDo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ocurSgg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ocurEmd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ocurRi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ocurJibun" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ownerSec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ocurCause" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="dmgArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="dmgMoney" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="riskAvg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="riskMax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="tempAvg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="humidCurr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="humidRel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="humidMin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="windMax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="windAvg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="dirMax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="dirAvg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="rainDays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="rainAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultType", propOrder = {
    "key",
    "totalCnt",
    "pageUnit",
    "pageIndex",
    "searchStDt",
    "searchEdDt",
    "frstFireInfo"
})
public class ResultType {

    @XmlElement(required = true)
    protected String key;
    @XmlElement(required = true)
    protected String totalCnt;
    @XmlElement(required = true)
    protected String pageUnit;
    @XmlElement(required = true)
    protected String pageIndex;
    @XmlElement(required = true)
    protected String searchStDt;
    @XmlElement(required = true)
    protected String searchEdDt;
    protected List<ResultType.FrstFireInfo> frstFireInfo;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the totalCnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalCnt() {
        return totalCnt;
    }

    /**
     * Sets the value of the totalCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalCnt(String value) {
        this.totalCnt = value;
    }

    /**
     * Gets the value of the pageUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageUnit() {
        return pageUnit;
    }

    /**
     * Sets the value of the pageUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageUnit(String value) {
        this.pageUnit = value;
    }

    /**
     * Gets the value of the pageIndex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageIndex() {
        return pageIndex;
    }

    /**
     * Sets the value of the pageIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageIndex(String value) {
        this.pageIndex = value;
    }

    /**
     * Gets the value of the searchStDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchStDt() {
        return searchStDt;
    }

    /**
     * Sets the value of the searchStDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchStDt(String value) {
        this.searchStDt = value;
    }

    /**
     * Gets the value of the searchEdDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchEdDt() {
        return searchEdDt;
    }

    /**
     * Sets the value of the searchEdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchEdDt(String value) {
        this.searchEdDt = value;
    }

    /**
     * Gets the value of the frstFireInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the frstFireInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFrstFireInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResultType.FrstFireInfo }
     * 
     * 
     */
    @JacksonXmlElementWrapper(useWrapping=false)
    public List<ResultType.FrstFireInfo> getFrstFireInfo() {
        if (frstFireInfo == null) {
            frstFireInfo = new ArrayList<ResultType.FrstFireInfo>();
        }
        return this.frstFireInfo;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ocurDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ocurYoil" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="              ��          "/>
     *               &lt;enumeration value="              ��          "/>
     *               &lt;enumeration value="              ��          "/>
     *               &lt;enumeration value="              ȭ          "/>
     *               &lt;enumeration value="              ��          "/>
     *               &lt;enumeration value="              ��          "/>
     *               &lt;enumeration value="              ��          "/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="extingDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="exintgTm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ocurGm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ocurDo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ocurSgg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ocurEmd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ocurRi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ocurJibun" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ownerSec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ocurCause" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="dmgArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="dmgMoney" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="riskAvg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="riskMax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="tempAvg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="humidCurr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="humidRel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="humidMin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="windMax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="windAvg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="dirMax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="dirAvg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="rainDays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="rainAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "content"
    })
    public static class FrstFireInfo {

        @XmlElementRefs({
            @XmlElementRef(name = "ocurYoil", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "rainDays", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "ocurDt", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "dirAvg", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "rainAmount", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "riskAvg", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "humidMin", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "ocurJibun", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "riskMax", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "extingDt", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "dmgArea", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "windAvg", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "dirMax", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "ocurSgg", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "humidRel", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "windMax", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "ocurDo", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "ocurEmd", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "dmgMoney", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "exintgTm", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "ocurGm", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "ownerSec", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "ocurRi", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "ocurCause", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "humidCurr", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "tempAvg", type = JAXBElement.class, required = false)
        })
        @XmlMixed
        @JacksonXmlElementWrapper(useWrapping=false)
        protected List<Serializable> content;

        /**
         * Gets the value of the content property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the content property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link String }
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * 
         * 
         */
        @JacksonXmlElementWrapper(useWrapping=false)
        public List<Serializable> getContent() {
            if (content == null) {
                content = new ArrayList<Serializable>();
            }
            return this.content;
        }

    }

}
