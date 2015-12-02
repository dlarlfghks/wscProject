
package wscproj;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>trailPlusType complex type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
 * 
 * <pre>
 * &lt;complexType name="trailPlusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tpNo">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="tpTitl">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value=" �ְ�� �ʸ����ɱ�� ȭ������ "/>
 *               &lt;enumeration value=" õ����� ȭ���� "/>
 *               &lt;enumeration value=" �뿵 ���俪��� "/>
 *               &lt;enumeration value=" �뿵�� �緡���� �߾ӽ��� "/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="tpContent">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value=" &amp;lt;p&amp;gt;�ְ�翡�� ȭ�����Ϳ� �̸��� ���κ����� �� 10�� ���ɱ�. �ſ� 4�� �ʼ��̸� ���� 60�� �Ƹ��帮 �������� �ϴ��� ���� �Ͼ� �ɺ� ���� ����� �̷��. �� ���� ���� ������ �� �ð������� ���ܿ��� �컶 ���� �� �ִ� ȭ�����Ͱ� �������� ��յ��� �߱��� ���߰� �����.&amp;lt;/p&amp;gt; "/>
 *               &lt;enumeration value=" &amp;lt;p&amp;gt;���� ���� 22�⿡ â�ǵ� ������ ��Ȳ��(���� 67ȣ), 4����3����ž(���� 35ȣ), ��Ȳ�� �� ����(���� 12ȣ), ����ȸ������(���� 301ȣ), �����(���� 299ȣ), ����5����ž(���� 132/133ȣ), ������ �� ����ž(���� 300ȣ), ��5����ž �縮�����(���� 1348ȣ), ����� ��ź���(���� 1363ȣ) �� ������ ��ȭ�縦 �����ϰ� �ִ�. �������� ���̹ڹ��������� ��Ȳ��(������)�� �̸��� ���� ����(���) �������� �� �� �ִµ� �����ֶ��� ���� ��Ÿ�� ���� ���̴�.&amp;lt;/p&amp;gt; "/>
 *               &lt;enumeration value=" &amp;lt;p&amp;gt;�뿵�� ��ȭ��� ���� ���� �� ���� ���, ����, ��� �� �ִ� ���̴�. �� 2õ5�鿩 ���� ���� ���� ������ ������ �뿵�� ���� ����ǰ�� �����Ѵ�. �뿵�� ���򵿿� ��ġ�ϸ� ����� �ٷ� ���� �������� �־� �̾� ������ �� �ִ�.&amp;lt;/p&amp;gt; "/>
 *               &lt;enumeration value=" &amp;lt;p&amp;gt;�뿵 �ó� �߰����� �ױ��� �� ������ �ִ�. �߾ӽ����� �뿵���� ���ΰ� �̽��ϰ� ���� �� �ִ� �ػ깰�� Ȱ��� ���� �뿵�� ������ ���� �緡������ ����� ���� �� �ִ�.&amp;lt;/p&amp;gt; "/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
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
@XmlType(name = "trailPlusType", propOrder = {
    "tpNo",
    "tpTitl",
    "tpContent"
})
public class TrailPlusType {

    @XmlElement(required = true)
    protected String tpNo;
    @XmlElement(required = true)
    protected String tpTitl;
    @XmlElement(required = true)
    protected String tpContent;

    /**
     * tpNo �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpNo() {
        return tpNo;
    }

    /**
     * tpNo �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpNo(String value) {
        this.tpNo = value;
    }

    /**
     * tpTitl �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpTitl() {
        return tpTitl;
    }

    /**
     * tpTitl �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpTitl(String value) {
        this.tpTitl = value;
    }

    /**
     * tpContent �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpContent() {
        return tpContent;
    }

    /**
     * tpContent �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpContent(String value) {
        this.tpContent = value;
    }

}
