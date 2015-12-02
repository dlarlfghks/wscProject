
package wscproj;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>trailPlusType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
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
 *               &lt;enumeration value=" 쌍계사 십리벚꽃길과 화개장터 "/>
 *               &lt;enumeration value=" 천년고찰 화엄사 "/>
 *               &lt;enumeration value=" 통영 향토역사관 "/>
 *               &lt;enumeration value=" 통영의 재래시장 중앙시장 "/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="tpContent">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value=" &amp;lt;p&amp;gt;쌍계사에서 화개장터에 이르는 도로변으로 난 10리 벚꽃길. 매월 4월 초순이면 수령 60년 아름드리 벚나무가 하늘을 덮고 하얀 꽃비를 내려 장관을 이룬다. 이 길을 따라 나오면 옛 시골장터의 정겨움을 흠뻑 느낄 수 있는 화개장터가 지나가는 길손들의 발길을 멈추게 만든다.&amp;lt;/p&amp;gt; "/>
 *               &lt;enumeration value=" &amp;lt;p&amp;gt;백제 성왕 22년에 창건된 고찰로 각황전(국보 67호), 4사자3층석탑(국보 35호), 각황전 앞 석등(국보 12호), 영산회괘불탱(국보 301호), 대웅전(보물 299호), 동서5층석탑(보물 132/133호), 원통전 앞 사자탑(보물 300호), 서5층석탑 사리장엄구(보물 1348호), 대웅전 삼신불탱(보물 1363호) 등 수많은 문화재를 간직하고 있다. 보제루의 간이박물관에서는 각황전(覺皇殿)의 이름을 낳은 석경(石經) 조각들을 볼 수 있는데 임진왜란때 절이 불타며 깨진 것이다.&amp;lt;/p&amp;gt; "/>
 *               &lt;enumeration value=" &amp;lt;p&amp;gt;통영의 문화재와 유적 등을 한 번에 듣고, 보고, 배울 수 있는 곳이다. 총 2천5백여 점의 향토 관련 유물이 있으며 통영의 전승 공예품도 전시한다. 통영시 태평동에 위치하며 역사관 바로 옆에 세병관도 있어 이어 관람할 수 있다.&amp;lt;/p&amp;gt; "/>
 *               &lt;enumeration value=" &amp;lt;p&amp;gt;통영 시내 중간에는 항구를 낀 시장이 있다. 중앙시장은 통영에서 값싸고 싱싱하게 맛볼 수 있는 해산물과 활어는 물론 통영의 맛집과 전통 재래시장의 모습도 엿볼 수 있다.&amp;lt;/p&amp;gt; "/>
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
     * tpNo 속성의 값을 가져옵니다.
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
     * tpNo 속성의 값을 설정합니다.
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
     * tpTitl 속성의 값을 가져옵니다.
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
     * tpTitl 속성의 값을 설정합니다.
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
     * tpContent 속성의 값을 가져옵니다.
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
     * tpContent 속성의 값을 설정합니다.
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
