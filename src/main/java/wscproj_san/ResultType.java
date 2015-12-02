
package wscproj_san;

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
 *         &lt;element name="searchWrd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mntInfo" type="{}mntInfoType" maxOccurs="unbounded" minOccurs="0"/>
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
    "searchWrd",
    "mntInfo"
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
    protected String searchWrd;
    @JacksonXmlElementWrapper(useWrapping=false)
    protected List<MntInfoType> mntInfo;

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
     * searchWrd �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchWrd() {
        return searchWrd;
    }

    /**
     * searchWrd �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchWrd(String value) {
        this.searchWrd = value;
    }

    /**
     * Gets the value of the mntInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mntInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMntInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MntInfoType }
     * 
     * 
     */
    @JacksonXmlElementWrapper(useWrapping=false)
    public List<MntInfoType> getMntInfo() {
        if (mntInfo == null) {
            mntInfo = new ArrayList<MntInfoType>();
        }
        return this.mntInfo;
    }
    @JacksonXmlElementWrapper(useWrapping=false)
    public void setMntInfo(MntInfoType value) {
        if (mntInfo == null) {
            mntInfo = new ArrayList<MntInfoType>();
        }
        mntInfo.add(value);
    }

}
