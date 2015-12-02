
package Fire;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for frstFireInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="frstFireInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ocurDt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ocurYoil" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="              금          "/>
 *               &lt;enumeration value="              목          "/>
 *               &lt;enumeration value="              수          "/>
 *               &lt;enumeration value="              화          "/>
 *               &lt;enumeration value="              월          "/>
 *               &lt;enumeration value="              일          "/>
 *               &lt;enumeration value="              토          "/>
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
@XmlType(name = "frstFireInfoType", propOrder = {
    "ocurDt",
    "ocurYoil",
    "extingDt",
    "exintgTm",
    "ocurGm",
    "ocurDo",
    "ocurSgg",
    "ocurEmd",
    "ocurRi",
    "ocurJibun",
    "ownerSec",
    "ocurCause",
    "dmgArea",
    "dmgMoney",
    "riskAvg",
    "riskMax",
    "tempAvg",
    "humidCurr",
    "humidRel",
    "humidMin",
    "windMax",
    "windAvg",
    "dirMax",
    "dirAvg",
    "rainDays",
    "rainAmount"
})
public class FrstFireInfoType {

    protected String ocurDt;
    protected String ocurYoil;
    protected String extingDt;
    protected String exintgTm;
    protected String ocurGm;
    protected String ocurDo;
    protected String ocurSgg;
    protected String ocurEmd;
    protected String ocurRi;
    protected String ocurJibun;
    protected String ownerSec;
    protected String ocurCause;
    protected String dmgArea;
    protected String dmgMoney;
    protected String riskAvg;
    protected String riskMax;
    protected String tempAvg;
    protected String humidCurr;
    protected String humidRel;
    protected String humidMin;
    protected String windMax;
    protected String windAvg;
    protected String dirMax;
    protected String dirAvg;
    protected String rainDays;
    protected String rainAmount;

    /**
     * Gets the value of the ocurDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOcurDt() {
        return ocurDt;
    }

    /**
     * Sets the value of the ocurDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOcurDt(String value) {
        this.ocurDt = value;
    }

    /**
     * Gets the value of the ocurYoil property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOcurYoil() {
        return ocurYoil;
    }

    /**
     * Sets the value of the ocurYoil property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOcurYoil(String value) {
        this.ocurYoil = value;
    }

    /**
     * Gets the value of the extingDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtingDt() {
        return extingDt;
    }

    /**
     * Sets the value of the extingDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtingDt(String value) {
        this.extingDt = value;
    }

    /**
     * Gets the value of the exintgTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExintgTm() {
        return exintgTm;
    }

    /**
     * Sets the value of the exintgTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExintgTm(String value) {
        this.exintgTm = value;
    }

    /**
     * Gets the value of the ocurGm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOcurGm() {
        return ocurGm;
    }

    /**
     * Sets the value of the ocurGm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOcurGm(String value) {
        this.ocurGm = value;
    }

    /**
     * Gets the value of the ocurDo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOcurDo() {
        return ocurDo;
    }

    /**
     * Sets the value of the ocurDo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOcurDo(String value) {
        this.ocurDo = value;
    }

    /**
     * Gets the value of the ocurSgg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOcurSgg() {
        return ocurSgg;
    }

    /**
     * Sets the value of the ocurSgg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOcurSgg(String value) {
        this.ocurSgg = value;
    }

    /**
     * Gets the value of the ocurEmd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOcurEmd() {
        return ocurEmd;
    }

    /**
     * Sets the value of the ocurEmd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOcurEmd(String value) {
        this.ocurEmd = value;
    }

    /**
     * Gets the value of the ocurRi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOcurRi() {
        return ocurRi;
    }

    /**
     * Sets the value of the ocurRi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOcurRi(String value) {
        this.ocurRi = value;
    }

    /**
     * Gets the value of the ocurJibun property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOcurJibun() {
        return ocurJibun;
    }

    /**
     * Sets the value of the ocurJibun property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOcurJibun(String value) {
        this.ocurJibun = value;
    }

    /**
     * Gets the value of the ownerSec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerSec() {
        return ownerSec;
    }

    /**
     * Sets the value of the ownerSec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerSec(String value) {
        this.ownerSec = value;
    }

    /**
     * Gets the value of the ocurCause property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOcurCause() {
        return ocurCause;
    }

    /**
     * Sets the value of the ocurCause property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOcurCause(String value) {
        this.ocurCause = value;
    }

    /**
     * Gets the value of the dmgArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDmgArea() {
        return dmgArea;
    }

    /**
     * Sets the value of the dmgArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDmgArea(String value) {
        this.dmgArea = value;
    }

    /**
     * Gets the value of the dmgMoney property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDmgMoney() {
        return dmgMoney;
    }

    /**
     * Sets the value of the dmgMoney property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDmgMoney(String value) {
        this.dmgMoney = value;
    }

    /**
     * Gets the value of the riskAvg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskAvg() {
        return riskAvg;
    }

    /**
     * Sets the value of the riskAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskAvg(String value) {
        this.riskAvg = value;
    }

    /**
     * Gets the value of the riskMax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskMax() {
        return riskMax;
    }

    /**
     * Sets the value of the riskMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskMax(String value) {
        this.riskMax = value;
    }

    /**
     * Gets the value of the tempAvg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTempAvg() {
        return tempAvg;
    }

    /**
     * Sets the value of the tempAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTempAvg(String value) {
        this.tempAvg = value;
    }

    /**
     * Gets the value of the humidCurr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHumidCurr() {
        return humidCurr;
    }

    /**
     * Sets the value of the humidCurr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHumidCurr(String value) {
        this.humidCurr = value;
    }

    /**
     * Gets the value of the humidRel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHumidRel() {
        return humidRel;
    }

    /**
     * Sets the value of the humidRel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHumidRel(String value) {
        this.humidRel = value;
    }

    /**
     * Gets the value of the humidMin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHumidMin() {
        return humidMin;
    }

    /**
     * Sets the value of the humidMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHumidMin(String value) {
        this.humidMin = value;
    }

    /**
     * Gets the value of the windMax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWindMax() {
        return windMax;
    }

    /**
     * Sets the value of the windMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWindMax(String value) {
        this.windMax = value;
    }

    /**
     * Gets the value of the windAvg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWindAvg() {
        return windAvg;
    }

    /**
     * Sets the value of the windAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWindAvg(String value) {
        this.windAvg = value;
    }

    /**
     * Gets the value of the dirMax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirMax() {
        return dirMax;
    }

    /**
     * Sets the value of the dirMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirMax(String value) {
        this.dirMax = value;
    }

    /**
     * Gets the value of the dirAvg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirAvg() {
        return dirAvg;
    }

    /**
     * Sets the value of the dirAvg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirAvg(String value) {
        this.dirAvg = value;
    }

    /**
     * Gets the value of the rainDays property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRainDays() {
        return rainDays;
    }

    /**
     * Sets the value of the rainDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRainDays(String value) {
        this.rainDays = value;
    }

    /**
     * Gets the value of the rainAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRainAmount() {
        return rainAmount;
    }

    /**
     * Sets the value of the rainAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRainAmount(String value) {
        this.rainAmount = value;
    }

}
