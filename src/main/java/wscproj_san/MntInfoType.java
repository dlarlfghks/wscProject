
package wscproj_san;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

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
 *         &lt;element name="mntiListNo">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="2809040100"/>
 *               &lt;enumeration value="2816132100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="mntiTop" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mntiName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="������"/>
 *               &lt;enumeration value="������(�뿵)"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="mntiSname">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value=""/>
 *               &lt;enumeration value="��󳲵� �뿵�� �緮��(������)�� �ִ� ��"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="mntiAdd">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="����ϵ� ������,���󳲵� ���ʱ�,��󳲵� �ϵ���,��󳲵���û��,��󳲵� �Ծ籺"/>
 *               &lt;enumeration value="��󳲵� �뿵�� �緮��"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="mntiHigh">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="1915"/>
 *               &lt;enumeration value="398"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="mntiAdmin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mntiAdminNum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mntiSummary">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value=" &lt;3�� ���������� ��ģ �Ŵ��� �걹>�������� ũ��. ���� �а� �׸��� ���. 3�� ���� �������Ծ�, ��û, �ϵ�, ����, ����, ���[��]�� �׸��� �帮�� �Ŵ��� �걹(ߣ��)�̴�. 1000���� �̻��� �ָ��� �ص� 110���� �ȴ�. �ǻ�� ���� ���λ�(1149.9m)���� õ�պ� ���� ������(1315.4m)������(����Ÿ� �����̸� ���ܡ�õ�պ� ���� ���� ����� 34.2km��). �ﳲ�� ���� �븶�簡 �ȴ�. �븶�翡���� ���� ���� �������簡 �귯������ �ִ�. �������� ���̿��� �� �׸�ŭ�� ��¥����� �ִ�. �Ͽ� ��� 1��4õ������, ����� �굢�̸� �̷��. �� �ȿ��� 10���� �ִ�. ���� ����, �Ǿư� ��ǳ, �ݾߺ� ����, ���ҷ� ���, �������� ö��, ��������, ����õ ����(���), õ�պ� ����, ĥ�����, ������ ���� ���̴�. �ְ� ������� �ս÷��(1243m)�̴�. �ű⼭ �������� �𷡹��� �����ó�� ��¦�̰� õ�պ��� �ϴ� �� ���� ������ �������� �д���� �Ŵ����� �����ٺ��� �ִ�. �ұ���ȭ�� �����̱⵵ �ϴ�. �ְ��, �����, ȭ����, õ����, �ǻ��, ���ۻ�, �׸��� ��ž �Ѹ� ���׷� �ܼӻ�����. ��� ���� ���� �ϰ��� �����ټ� ���� ������ �����ִ�. �ݰ���, �Ѷ��� �Բ� ��Ż��� �ݿ��� �ö��ִ�. �����, �η���, �Һ����̶� �Ҹ��⵵ �ߴ�. �����δ� ����(���)�ο� ����(���)�� ��Ÿ�� ���̴�. "/>
 *               &lt;enumeration value=" &lt;������ �ٶ��̴� �緮�� ������> �������� �ѷ��ػ󱹸������� �ִ� �緮���� ��ġ�� ������ ���� �̸��� ���������̴�. �� ��Ī�� �������� 1ȣ�� �������� �����ȴٴ� ������ �ٿ����ٰ� �Ѵ�. ������ �Ʒ������� �������� �ִµ� �̵� �� �� ���̸� �����̶�� �θ���. �������� �緮���� �ּ��� ������ �ڸ��ϰ� �ִ�. �������� ���� ���츮 �� ������� ��� �꼼�� ������ ������ ���� �����ϴ�. �׷��� �Ϻ����� �̾��� �ɼ����� �ټ� �����ѵ� �ʺ��ڸ� ���� ��ȸ�ΰ� �ִ�. ������� ������ ������ ������ ���츮�⵵ �ϴ�.  � �� ��Ӵϸ� ���� ���డ ���ڰ� �������� õ���� ������ �ƹ����� ���ฦ ���Ϸ� �� ���డ ���� ���츮���� ���� �ٴٷ� �����ٰ� �Ѵ�. ������ ����츮 ������ ������ ������ ����� �� �ƴ϶� ǳ���������ε� �꼼�� ������ �Ź��� Ÿ�� ���� ź�����̶� ������� ���� ������ ���� �����ش�. "/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="mntiDetails">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="  "/>
 *               &lt;enumeration value=" "ȯ���� ��" �緮�� �� �߰��� ��Ҽ��� �� �ٸ� "������"(398m) ����� ���� ������� �ٶ󺸴� �ѷ������� �ϻ����� �̽��� ȸ�� ���� ���� ��̴� ȯ���� ���� �緮���� ���� �Ƹ���� ������ �¾��.  ���߾����� �緮���� ������ ���� ������ ��۵�� �����ڵ鿡�� �幵�ϰ� �� ��Ȥ���� ���¸� �巯���� �� ���̴�. �뿵�ÿ��� ��ģ �������߷� �����ؼ������� �����ǰ� ������ �͹̳��� ���Ӱ� ����ǰ� �����ߴ� ���ΰ� �߹����� ����Ǵ� �� ã�� �̵��� ������ ���Ǹ� �����Ͽ� �緮���� ������ ��������� �պ�� �ִ�.  �緮���� �뿵�� �緮�鿡 �ش��ϴ� ������ �츮���� ���� �ٵ��� �ѷ��ػ������ �ѷ����� �Ƹ��ٿ� ���̴�. �緮���� �� ��ü�� �� ������� ����� ���� ���ٰ� �ؼ� ���� �̸��̶� �ϴµ�, �� ���ڰ� �̷� �� ���� ����� ���ο��ϴ� ��纴���� �׾���� �Ǿ��ٴ� �̾߱⵵ ���ؿ´�.��õ���� �չٴ��� ������ ������ ������ �緮�� �󵵿� �����ϸ� �� ��� ��� ���� �������� �� �� �ִ�.  ������ �츮���� �� �˷��� �ִ� ���󵵿� ��󵵿� ��ģ ����� �������� �ٶ�ٺ��� �����̸��꡹�̶� �Ҹ��ٰ� �� ���� �پ� �������꡹�� �� ���̴�. ���̴� �󸶵��� ������ �ѷ������� ��� ����� ��췯�� �� ��� ��� ���� �ʰ� ������ ����� �����ϰ� �ִ�.  �꿡 ������ ���� ���� ������ ���������� �ù������� ������ ������� ��ġ�� �ɼ��� Ÿ�� �������� ������ �ڽ��� ���ϴ� ���� �� ���� ������� ���� �� ��� �� �ִ� ����̴�.������ ������ ����� ������� Ǫ�� ������ �ѽǴ�� �ٴٸ� ��������� ������ �׸����� ������ �������̴�. ������ �������� ���� ������ �����ϸ� ������� �����µ� �þ߿� ������ �ٴ� ǳ�� ���� ������ �������� �ʰ� �Ʊ��ڱ��ϱ⸸ �ϴ�. �࿩ ���� ����� �ü��� ���Ѱ� ���̶� ������ ������ �� ������. "/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
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
    @JacksonXmlElementWrapper(useWrapping=false)
    protected List<ImageType> image;

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
    public List<ImageType> getImage() {
        if (image == null) {
            image = new ArrayList<ImageType>();
        }
        return this.image;
    }

}
