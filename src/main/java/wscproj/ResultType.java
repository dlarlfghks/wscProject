
package wscproj;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>resultType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
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
 *         &lt;element name="mntInfo" type="{}mntInfoType"/>
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
    @XmlElement(required = true)
    protected MntInfoType mntInfo;

    /**
     * key 속성의 값을 가져옵니다.
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
     * key 속성의 값을 설정합니다.
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
     * totalCnt 속성의 값을 가져옵니다.
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
     * totalCnt 속성의 값을 설정합니다.
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
     * pageUnit 속성의 값을 가져옵니다.
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
     * pageUnit 속성의 값을 설정합니다.
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
     * pageIndex 속성의 값을 가져옵니다.
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
     * pageIndex 속성의 값을 설정합니다.
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
     * searchWrd 속성의 값을 가져옵니다.
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
     * searchWrd 속성의 값을 설정합니다.
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
     * mntInfo 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link MntInfoType }
     *     
     */
    public MntInfoType getMntInfo() {
        return mntInfo;
    }

    /**
     * mntInfo 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link MntInfoType }
     *     
     */
    public void setMntInfo(MntInfoType value) {
        this.mntInfo = value;
    }

}
