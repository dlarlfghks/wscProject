
package wscproj;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>mntInfoType complex type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
 * 
 * <pre>
 * &lt;complexType name="mntInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mntiListNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mntiTop" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mntiName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mntiSname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mntiAdd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mntiHigh" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mntiAdmin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mntiAdminNum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mntiSummary" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mntiDetails" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="image" type="{}imageType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mntInfoType", propOrder = {
    "mntiListNo",
    "mntiTop",
    "mntiName",
    "mntiSname",
    "mntiAdd",
    "mntiHigh",
    "mntiAdmin",
    "mntiAdminNum",
    "mntiSummary",
    "mntiDetails",
    "image"
})
public class MntInfoType {

    @XmlElement(required = true)
    protected String mntiListNo;
    @XmlElement(required = true)
    protected String mntiTop;
    @XmlElement(required = true)
    protected String mntiName;
    @XmlElement(required = true)
    protected String mntiSname;
    @XmlElement(required = true)
    protected String mntiAdd;
    @XmlElement(required = true)
    protected String mntiHigh;
    @XmlElement(required = true)
    protected String mntiAdmin;
    @XmlElement(required = true)
    protected String mntiAdminNum;
    @XmlElement(required = true)
    protected String mntiSummary;
    @XmlElement(required = true)
    protected String mntiDetails;
    protected ImageType image;

    /**
     * mntiListNo �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMntiListNo() {
        return mntiListNo;
    }

    /**
     * mntiListNo �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMntiListNo(String value) {
        this.mntiListNo = value;
    }

    /**
     * mntiTop �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMntiTop() {
        return mntiTop;
    }

    /**
     * mntiTop �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMntiTop(String value) {
        this.mntiTop = value;
    }

    /**
     * mntiName �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMntiName() {
        return mntiName;
    }

    /**
     * mntiName �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMntiName(String value) {
        this.mntiName = value;
    }

    /**
     * mntiSname �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMntiSname() {
        return mntiSname;
    }

    /**
     * mntiSname �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMntiSname(String value) {
        this.mntiSname = value;
    }

    /**
     * mntiAdd �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMntiAdd() {
        return mntiAdd;
    }

    /**
     * mntiAdd �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMntiAdd(String value) {
        this.mntiAdd = value;
    }

    /**
     * mntiHigh �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMntiHigh() {
        return mntiHigh;
    }

    /**
     * mntiHigh �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMntiHigh(String value) {
        this.mntiHigh = value;
    }

    /**
     * mntiAdmin �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMntiAdmin() {
        return mntiAdmin;
    }

    /**
     * mntiAdmin �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMntiAdmin(String value) {
        this.mntiAdmin = value;
    }

    /**
     * mntiAdminNum �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMntiAdminNum() {
        return mntiAdminNum;
    }

    /**
     * mntiAdminNum �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMntiAdminNum(String value) {
        this.mntiAdminNum = value;
    }

    /**
     * mntiSummary �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMntiSummary() {
        return mntiSummary;
    }

    /**
     * mntiSummary �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMntiSummary(String value) {
        this.mntiSummary = value;
    }

    /**
     * mntiDetails �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMntiDetails() {
        return mntiDetails;
    }

    /**
     * mntiDetails �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMntiDetails(String value) {
        this.mntiDetails = value;
    }

    /**
     * Gets the value of the image property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the image property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImageType }
     * 
     * 
     */
    public ImageType getImage() {
        return image;
    }

}
