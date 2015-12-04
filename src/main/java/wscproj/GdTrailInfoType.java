
package wscproj;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>gdTrailInfoType complex type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
 * 
 * <pre>
 * &lt;complexType name="gdTrailInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mntnCd">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="2809040100"/>
 *               &lt;enumeration value="2816132100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="mntNm">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value=" ������ "/>
 *               &lt;enumeration value=" ������(�뿵) "/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="subNm">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value=" ����� ��, ������ �ǿ� ������ �Բ� �����ִ� �̻��� "/>
 *               &lt;enumeration value=" ��󳲵� �뿵�� �緮��(������)�� �ִ� �� "/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="areaNm">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value=" ����ϵ� ������,���󳲵� ���ʱ�,��󳲵� �ϵ���,��󳲵���û��,��󳲵� �Ծ籺 "/>
 *               &lt;enumeration value=" ��󳲵� �뿵�� �緮�� "/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="mntHeight">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="1915.4"/>
 *               &lt;enumeration value="399.3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="aeatReason">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value=" &lt;P>�Ŷ� 5���� �������� ���� ������ �ְ���� õ�պ�(1,915m)�� �ֺ����� ����(1,507m), �ݾߺ�(1,751m) �� ������ 100������ �Ŵ��� ��Ǳ��� �̷� "������ 12��õ"�� �����ϴ� �� ����� �پ�� �츮���� �ִ��� �ڿ����°� �����̸� �������� ��1ȣ�� ����(1967��)�� �� ���� ����Ͽ� ����, ����� ����� �ӹ��� �����ο� ������� �޶����ٰ� �ѵ��� ���̸��� ����.ȭ����, õ����, �����, �ְ�� ���� ����&lt;/P> "/>
 *               &lt;enumeration value=" &lt;P>�ѷ������� ��� ����� ��ȭ�� �̷�� Ư�� �Ҹ��, ������, ���, ����� �� �� ������� �������� ��ϱ����� �����ϰ� ������ ���� �� ���� ����Ͽ� ����,"�������� �ٶ� ���̴� ��"�̶� �濡�� ���̸��� �����Ͽ�����, ���������� �������̶�� �Ҹ������� ����. �ٵ����� ���� ������ �� ������ �⹦�� ���� �ɼ��� Ư�� ����&lt;/P> "/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="overView">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value=" &lt;P>&amp;lt;3�� ���������� ��ģ �Ŵ��� �걹&amp;gt;&lt;BR>�������� ũ��. ���� �а� �׸��� ���. 3�� ���� �������Ծ�, ��û, �ϵ�, ����, ����, ���[��]�� �׸��� �帮�� �Ŵ��� �걹(ߣ��)�̴�. 1000���� �̻��� �ָ��� �ص� 110���� �ȴ�. �ǻ�� ���� ���λ�(1149.9m)���� õ�պ� ���� ������(1315.4m)������(����Ÿ� �����̸� ���ܡ�õ�պ� ���� ���� ����� 34.2km��). �ﳲ�� ���� �븶�簡 �ȴ�. &lt;BR>&lt;BR>�븶�翡���� ���� ���� �������簡 �귯������ �ִ�. �������� ���̿��� �� �׸�ŭ�� ��¥����� �ִ�. �Ͽ� ��� 1��4õ������, ����� �굢�̸� �̷��. �� �ȿ��� 10���� �ִ�. ���� ����, �Ǿư� ��ǳ, �ݾߺ� ����, ���ҷ� ���, �������� ö��, ��������, ����õ ����(���), õ�պ� ����, ĥ�����, ������ ���� ���̴�. &lt;BR>&lt;BR>�ְ� ������� �ս÷��(1243m)�̴�. �ű⼭ �������� �𷡹��� �����ó�� ��¦�̰� õ�պ��� �ϴ� �� ���� ������ �������� �д���� �Ŵ����� �����ٺ��� �ִ�. �ұ���ȭ�� �����̱⵵ �ϴ�. �ְ��, �����, ȭ����, õ����, �ǻ��, ���ۻ�, �׸��� ��ž �Ѹ� ���׷� �ܼӻ�����. ��� ���� ���� �ϰ��� �����ټ� ���� ������ �����ִ�. &lt;BR>&lt;BR>�ݰ���, �Ѷ��� �Բ� ��Ż��� �ݿ��� �ö��ִ�. �����, �η���, �Һ����̶� �Ҹ��⵵ �ߴ�. �����δ� ����(���)�ο� ����(���)�� ��Ÿ�� ���̴�.&lt;/P> "/>
 *               &lt;enumeration value=" &lt;P>&amp;lt;������ �ٶ��̴� �緮�� ������&amp;gt;&lt;BR>�������� �ѷ��ػ󱹸������� �ִ� �緮���� ��ġ�� ������ ���� �̸��� ���������̴�. �� ��Ī�� �������� 1ȣ�� �������� �����ȴٴ� ������ �ٿ����ٰ� �Ѵ�. ������ �Ʒ������� �������� �ִµ� �̵� �� �� ���̸� �����̶�� �θ���. �������� �緮���� �ּ��� ������ �ڸ��ϰ� �ִ�. �������� ���� ���츮 �� ������� ��� �꼼�� ������ ������ ���� �����ϴ�. �׷��� �Ϻ����� �̾��� �ɼ����� �ټ� �����ѵ� �ʺ��ڸ� ���� ��ȸ�ΰ� �ִ�. ������� ������ ������ ������ ���츮�⵵ �ϴ�.&lt;BR>&lt;BR>� �� ��Ӵϸ� ���� ���డ ���ڰ� �������� õ���� ������ �ƹ����� ���ฦ ���Ϸ� �� ���డ ���� ���츮���� ���� �ٴٷ� �����ٰ� �Ѵ�. ������ ����츮 ������ ������ ������ ����� �� �ƴ϶� ǳ���������ε� �꼼�� ������ �Ź��� Ÿ�� ���� ź�����̶� ������� ���� ������ ���� �����ش�.&lt;/P> "/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="details">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value=" &lt;P>����ϼ��� ���� �̸��ӿ� �ѷ��׿� �ֱ� �����̴�. ���κ��� �������� ��δ밣�� ���� ũ�� ������ ������ '�ø���'������ �η����̶�� �Ͽ����� ����Ȳ ���� ��Ż��� �ϳ��� '�����'�̶� �̸��� ���⵵ �ߴ�. �׸��� '���̻�'�� '������ �ٸ� ��' 'õ�������� �̸� �ƴ� ���� �ִ� ��'�̶� ǥ���ϴ� �� �̸��� ���� ������ ���� �ִ�. &lt;BR>&lt;BR>���ݰ����� ����� �������� ���ϰ�, �������� �����ϵ� ����� ���ϰ���� �������� ������ �ֵ� �������� ��ī�Ӱ� ����� �����ϳ� �����ϰ� �θ������� ����� �����δ�. ���������� �泲 ��û�� ��õ�� �߻긮 ߣ 208������ ������ õ�պ�(1,915m)�� �ֺ����� �ݾߺ�(1,732m), ����(1,507m)�� ��ǥ���̸�, õ�պ����� ������ �մ� 100�� �ɼ����� 1õ 5����Ͱ� �Ѵ� ����� 10��, 1õ���Ͱ� �Ѵ� ���츮�� 20������ ���� ������ ���� ũ��. ������ ������뵵 ���� �ߴ��� �߻�ȭ�� ö�� ���� ����� �̷�⵵ �Ѵ�. �꼼�� ������ �����鼭 ���츮�� 80���� ���ϴٺ��� ���츮 ���̷� ����� �ߴ��ߴ�. &lt;BR>&lt;BR>���� ���� ��絵�� ������ �ʴ� Ư¡�� �ִ�. �߻긮���, �������, �Ÿ����, �����, ������, ȭ������, �ɿ����, �Ǿư���, �ѽ�(�鹫��)���, ĥ����� �� ���� ���� 20������ �ִ�.&lt;/P> "/>
 *               &lt;enumeration value=" &lt;P>"ȯ���� ��" �緮�� �� �߰��� ��Ҽ��� �� �ٸ� "������"(398m) ����� ���� ������� �ٶ󺸴� �ѷ������� �ϻ����� �̽��� ȸ�� ���� ���� ��̴� ȯ���� ���� �緮���� ���� �Ƹ���� ������ �¾��.&lt;BR>&lt;BR>���߾����� �緮���� ������ ���� ������ ��۵�� �����ڵ鿡�� �幵�ϰ� �� ��Ȥ���� ���¸� �巯���� �� ���̴�. �뿵�ÿ��� ��ģ �������߷� �����ؼ������� �����ǰ� ������ �͹̳��� ���Ӱ� ����ǰ� �����ߴ� ���ΰ� �߹����� ����Ǵ� �� ã�� �̵��� ������ ���Ǹ� �����Ͽ� �緮���� ������ ��������� �պ�� �ִ�.&lt;BR>&lt;BR>�緮���� �뿵�� �緮�鿡 �ش��ϴ� ������ �츮���� ���� �ٵ��� �ѷ��ػ������ �ѷ����� �Ƹ��ٿ� ���̴�. �緮���� �� ��ü�� �� ������� ����� ���� ���ٰ� �ؼ� ���� �̸��̶� �ϴµ�, �� ���ڰ� �̷� �� ���� ����� ���ο��ϴ� ��纴���� �׾���� �Ǿ��ٴ� �̾߱⵵ ���ؿ´�.��õ���� �չٴ��� ������ ������ ������ �緮�� �󵵿� �����ϸ� �� ��� ��� ���� �������� �� �� �ִ�.&lt;BR>&lt;BR>������ �츮���� �� �˷��� �ִ� ���󵵿� ��󵵿� ��ģ ����� �������� �ٶ�ٺ��� �����̸��꡹�̶� �Ҹ��ٰ� �� ���� �پ� �������꡹�� �� ���̴�. ���̴� �󸶵��� ������ �ѷ������� ��� ����� ��췯�� �� ��� ��� ���� �ʰ� ������ ����� �����ϰ� �ִ�.&lt;BR>&lt;BR>�꿡 ������ ���� ���� ������ ���������� �ù������� ������ ������� ��ġ�� �ɼ��� Ÿ�� �������� ������ �ڽ��� ���ϴ� ���� �� ���� ������� ���� �� ��� �� �ִ� ����̴�.������ ������ ����� ������� Ǫ�� ������ �ѽǴ�� �ٴٸ� ��������� ������ �׸����� ������ �������̴�. ������ �������� ���� ������ �����ϸ� ������� �����µ� �þ߿� ������ �ٴ� ǳ�� ���� ������ �������� �ʰ� �Ʊ��ڱ��ϱ⸸ �ϴ�. �࿩ ���� ����� �ü��� ���Ѱ� ���̶� ������ ������ �� ������.&lt;/P> "/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="trailPlus" type="{}trailPlusType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="transport">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value=" &lt;P>������ ����, ����, �Ծ��̴�. ���ʿ��� ȭ������ ������ ���÷� ������ �ְ������ 13ȸ, ���������� 8ȸ �ִ�. ���ֿ��� �߻긮���� 16ȸ, �Ծ翡�� �鹫������ 18ȸ �ִ�. ���ʴ� �Ϸ� 13ȸ(���� ����) �ٴϴ� ���� ������ �̿��ϴ� ���� ������ ���ֳ� �Ծ����δ� ������ ���ϴ�. ���ִ� ���� �����͹̳ο��� �������� 30�� ����(�ɾ� 3ȸ), �λ� �������͹̳ο��� 20�� ����, �뱸 ���������忡�� 45�� ����, ���� �����͹̳ο��� �� �ð� �������� �ٴѴ�. &lt;BR>&lt;BR>��õ, û��, ���, ����, ����, ���������� ������ �ִ�. �Ծ����δ� �������͹̳ο��� 12ȸ(�ɾ� 2ȸ), �����͹̳ο��� 8ȸ �����Ѵ�. �λ꿡���� 15��, �뱸������ 30�� �������� �ٴϸ� ��õ, ����, ����, ���ֿ����� ������ �ִ�.&lt;/P> "/>
 *               &lt;enumeration value=" &lt;P>������ �뿵�̴�. ���� ����ġ�����忡�� �������� Ÿ�� ����. �� �����, ��õ�������͹̳ο��� �緮�� ���� �谡 �ִ�.&lt;BR>�뿵��緮�� ���� : ī�丮 �������� 1�� 6ȸ ����(����� 5ȸ ����), ���� ���� ����.&lt;/P> "/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="tourismInf">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value=" &lt;P>�� ���� �� ��Ÿ����&lt;BR>������ �ϴ뿡�� ���̰� ������ �������� ã�ƺ���. ȭ����� ���� ����� ���ǰ���(��061-782-2715)�� �������������� ������ ���ִ�. �ְ�� �Ա� ȭ�������� �������� ���Կ� ��ø��, ����Ƣ���� �� �������Ѵ�. �º��Ĵ�(��055-883-2466) ����Ĵ�(��055-883-8333) ���񿡴� û�� �곪���� ���� ��ä������ �߹���� ������ û�۰���(��063-636-3563)�� �ִ�.&lt;BR>��⽾�� �� ���� �������� �����ϰ�� �� �ι��̴�. ȭ���� �ֺ����� ������������ȣ�� ��061-782-2171 ȭ�������� ��061-782-0997 �ְ������ �ְ躰�� ��055-883-1665 �������Ĵ� ��055-883-2345 �߻긮�� õ�պ��� �� ��055-972-1155 �η����� ��055-972-1289 �鹫���� �鹫�����ްԼ� ��055-962-5211 ������ ��055-962-5332 &lt;BR>&lt;BR>�� �̿빮��&lt;BR>�����걹������ ���ΰ����繫�� ��055-942-7771~2 ���ΰ����繫�� ��061-783-9100~1 �Ϻΰ����繫�� ��063-625-8911~2&lt;/P> "/>
 *               &lt;enumeration value=" &lt;P>�� ���� �� ��Ÿ ����&lt;BR>�緮�� �� �������� �ι����� ��Ѵ�. &lt;BR>�緮����ȣ���� (�� 055-641-8247)&lt;BR>&lt;BR>�� �̿빮��&lt;BR>�緮��繫�� �� 055-642-6119&lt;/P> "/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="etcCourse">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value=" &lt;P>�� �߻긮-Į����-������-�����(��Ÿ�����Ǽ�)-õ�ջ�-õ�պ�-�߻긮(�� 8�ð�)&lt;BR>�� ������-����-�Ӱɷ�-����-�ݾߺ�-ȭ����-����-�ݼ�(�� 7�ð� 30��)&lt;BR>�� �Ÿ�-�������Ǽ�-���Ϻ�-������-õ�պ�-�߻긮(�� 9�ð�)&lt;/P> "/>
 *               &lt;enumeration value=" &lt;P>�� �ݺϰ�-������-�޹���-������-�����-���� (�� 4�ð� 40��)&lt;BR>�� ����-�޹���-������-�����-���� (�� 2�ð� 50��)&lt;/P> "/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="flashUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="videoUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gdTrailInfoType", propOrder = {
    "mntnCd",
    "mntNm",
    "subNm",
    "areaNm",
    "mntHeight",
    "aeatReason",
    "overView",
    "details",
    "trailPlus",
    "transport",
    "tourismInf",
    "etcCourse",
    "flashUrl",
    "videoUrl"
})
public class GdTrailInfoType {

    @XmlElement(required = true)
    protected String mntnCd;
    @XmlElement(required = true)
    protected String mntNm;
    @XmlElement(required = true)
    protected String subNm;
    @XmlElement(required = true)
    protected String areaNm;
    @XmlElement(required = true)
    protected String mntHeight;
    @XmlElement(required = true)
    protected String aeatReason;
    @XmlElement(required = true)
    protected String overView;
    @XmlElement(required = true)
    protected String details;
    @JacksonXmlElementWrapper(useWrapping=false)
    protected List<TrailPlusType> trailPlus;
    @XmlElement(required = true)
    protected String transport;
    @XmlElement(required = true)
    protected String tourismInf;
    @XmlElement(required = true)
    protected String etcCourse;
    @XmlElement(required = true)
    protected String flashUrl;
    @XmlElement(required = true)
    protected String videoUrl;

    /**
     * mntnCd �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMntnCd() {
        return mntnCd;
    }

    /**
     * mntnCd �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMntnCd(String value) {
        this.mntnCd = value;
    }

    /**
     * mntNm �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMntNm() {
        return mntNm;
    }

    /**
     * mntNm �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMntNm(String value) {
        this.mntNm = value;
    }

    /**
     * subNm �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubNm() {
        return subNm;
    }

    /**
     * subNm �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubNm(String value) {
        this.subNm = value;
    }

    /**
     * areaNm �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaNm() {
        return areaNm;
    }

    /**
     * areaNm �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaNm(String value) {
        this.areaNm = value;
    }

    /**
     * mntHeight �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMntHeight() {
        return mntHeight;
    }

    /**
     * mntHeight �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMntHeight(String value) {
        this.mntHeight = value;
    }

    /**
     * aeatReason �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAeatReason() {
        return aeatReason;
    }

    /**
     * aeatReason �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAeatReason(String value) {
        this.aeatReason = value;
    }

    /**
     * overView �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverView() {
        return overView;
    }

    /**
     * overView �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverView(String value) {
        this.overView = value;
    }

    /**
     * details �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetails() {
        return details;
    }

    /**
     * details �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetails(String value) {
        this.details = value;
    }

    /**
     * Gets the value of the trailPlus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trailPlus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrailPlus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrailPlusType }
     * 
     * 
     */
    public List<TrailPlusType> getTrailPlus() {
        if (trailPlus == null) {
            trailPlus = new ArrayList<TrailPlusType>();
        }
        return this.trailPlus;
    }

    /**
     * transport �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransport() {
        return transport;
    }

    /**
     * transport �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransport(String value) {
        this.transport = value;
    }

    /**
     * tourismInf �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTourismInf() {
        return tourismInf;
    }

    /**
     * tourismInf �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTourismInf(String value) {
        this.tourismInf = value;
    }

    /**
     * etcCourse �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEtcCourse() {
        return etcCourse;
    }

    /**
     * etcCourse �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEtcCourse(String value) {
        this.etcCourse = value;
    }

    /**
     * flashUrl �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlashUrl() {
        return flashUrl;
    }

    /**
     * flashUrl �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlashUrl(String value) {
        this.flashUrl = value;
    }

    /**
     * videoUrl �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVideoUrl() {
        return videoUrl;
    }

    /**
     * videoUrl �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVideoUrl(String value) {
        this.videoUrl = value;
    }

}
