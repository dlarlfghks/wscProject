
package wscproj;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>resultType complex type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
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
 *         &lt;element name="searchCnm" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="searchNm" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gdTrailInfo" type="{}gdTrailInfoType" maxOccurs="unbounded" minOccurs="0"/>
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
    "searchCnm",
    "searchNm",
    "gdTrailInfo"
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
    protected String searchCnm;
    @XmlElement(required = true)
    protected String searchNm;
    @JacksonXmlElementWrapper(useWrapping=false)
    protected List<GdTrailInfoType> gdTrailInfo;

    /**
     * key �Ӽ��� ���� �����ɴϴ�.
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
     * key �Ӽ��� ���� �����մϴ�.
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
     * totalCnt �Ӽ��� ���� �����ɴϴ�.
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
     * totalCnt �Ӽ��� ���� �����մϴ�.
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
     * pageUnit �Ӽ��� ���� �����ɴϴ�.
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
     * pageUnit �Ӽ��� ���� �����մϴ�.
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
     * pageIndex �Ӽ��� ���� �����ɴϴ�.
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
     * pageIndex �Ӽ��� ���� �����մϴ�.
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
     * searchCnm �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchCnm() {
        return searchCnm;
    }

    /**
     * searchCnm �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchCnm(String value) {
        this.searchCnm = value;
    }

    /**
     * searchNm �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchNm() {
        return searchNm;
    }

    /**
     * searchNm �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchNm(String value) {
        this.searchNm = value;
    }

    /**
     * Gets the value of the gdTrailInfo property.
     snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gdTrailInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGdTrailInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GdTrailInfoType }
     * 
     * 
     */
    @JacksonXmlElementWrapper(useWrapping=false)
    public List<GdTrailInfoType> getGdTrailInfo() {
        if (gdTrailInfo == null) {
            gdTrailInfo = new ArrayList<GdTrailInfoType>();
        }
        return this.gdTrailInfo;
    }
    @JacksonXmlElementWrapper(useWrapping=false)
    public void setGdTrailInfo(GdTrailInfoType value) {
        if (gdTrailInfo == null) {
            gdTrailInfo = new ArrayList<GdTrailInfoType>();
        }
        gdTrailInfo.add(value);
    }

}
