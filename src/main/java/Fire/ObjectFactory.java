
package Fire;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the Fire package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Result_QNAME = new QName("", "result");
    private final static QName _ResultTypeFrstFireInfoWindAvg_QNAME = new QName("", "windAvg");
    private final static QName _ResultTypeFrstFireInfoRainAmount_QNAME = new QName("", "rainAmount");
    private final static QName _ResultTypeFrstFireInfoOcurYoil_QNAME = new QName("", "ocurYoil");
    private final static QName _ResultTypeFrstFireInfoOcurSgg_QNAME = new QName("", "ocurSgg");
    private final static QName _ResultTypeFrstFireInfoOcurDo_QNAME = new QName("", "ocurDo");
    private final static QName _ResultTypeFrstFireInfoDmgArea_QNAME = new QName("", "dmgArea");
    private final static QName _ResultTypeFrstFireInfoDmgMoney_QNAME = new QName("", "dmgMoney");
    private final static QName _ResultTypeFrstFireInfoWindMax_QNAME = new QName("", "windMax");
    private final static QName _ResultTypeFrstFireInfoRainDays_QNAME = new QName("", "rainDays");
    private final static QName _ResultTypeFrstFireInfoExintgTm_QNAME = new QName("", "exintgTm");
    private final static QName _ResultTypeFrstFireInfoHumidRel_QNAME = new QName("", "humidRel");
    private final static QName _ResultTypeFrstFireInfoOcurCause_QNAME = new QName("", "ocurCause");
    private final static QName _ResultTypeFrstFireInfoOcurRi_QNAME = new QName("", "ocurRi");
    private final static QName _ResultTypeFrstFireInfoHumidMin_QNAME = new QName("", "humidMin");
    private final static QName _ResultTypeFrstFireInfoHumidCurr_QNAME = new QName("", "humidCurr");
    private final static QName _ResultTypeFrstFireInfoOcurEmd_QNAME = new QName("", "ocurEmd");
    private final static QName _ResultTypeFrstFireInfoOcurGm_QNAME = new QName("", "ocurGm");
    private final static QName _ResultTypeFrstFireInfoDirAvg_QNAME = new QName("", "dirAvg");
    private final static QName _ResultTypeFrstFireInfoRiskMax_QNAME = new QName("", "riskMax");
    private final static QName _ResultTypeFrstFireInfoOcurJibun_QNAME = new QName("", "ocurJibun");
    private final static QName _ResultTypeFrstFireInfoOcurDt_QNAME = new QName("", "ocurDt");
    private final static QName _ResultTypeFrstFireInfoDirMax_QNAME = new QName("", "dirMax");
    private final static QName _ResultTypeFrstFireInfoRiskAvg_QNAME = new QName("", "riskAvg");
    private final static QName _ResultTypeFrstFireInfoExtingDt_QNAME = new QName("", "extingDt");
    private final static QName _ResultTypeFrstFireInfoTempAvg_QNAME = new QName("", "tempAvg");
    private final static QName _ResultTypeFrstFireInfoOwnerSec_QNAME = new QName("", "ownerSec");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: Fire
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ResultType }
     * 
     */
    public ResultType createResultType() {
        return new ResultType();
    }

    /**
     * Create an instance of {@link FrstFireInfoType }
     * 
     */
    public FrstFireInfoType createFrstFireInfoType() {
        return new FrstFireInfoType();
    }

    /**
     * Create an instance of {@link ResultType.FrstFireInfo }
     * 
     */
    public ResultType.FrstFireInfo createResultTypeFrstFireInfo() {
        return new ResultType.FrstFireInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "result")
    public JAXBElement<ResultType> createResult(ResultType value) {
        return new JAXBElement<ResultType>(_Result_QNAME, ResultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "windAvg", scope = ResultType.FrstFireInfo.class)
    public JAXBElement<String> createResultTypeFrstFireInfoWindAvg(String value) {
        return new JAXBElement<String>(_ResultTypeFrstFireInfoWindAvg_QNAME, String.class, ResultType.FrstFireInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "rainAmount", scope = ResultType.FrstFireInfo.class)
    public JAXBElement<String> createResultTypeFrstFireInfoRainAmount(String value) {
        return new JAXBElement<String>(_ResultTypeFrstFireInfoRainAmount_QNAME, String.class, ResultType.FrstFireInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ocurYoil", scope = ResultType.FrstFireInfo.class)
    public JAXBElement<String> createResultTypeFrstFireInfoOcurYoil(String value) {
        return new JAXBElement<String>(_ResultTypeFrstFireInfoOcurYoil_QNAME, String.class, ResultType.FrstFireInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ocurSgg", scope = ResultType.FrstFireInfo.class)
    public JAXBElement<String> createResultTypeFrstFireInfoOcurSgg(String value) {
        return new JAXBElement<String>(_ResultTypeFrstFireInfoOcurSgg_QNAME, String.class, ResultType.FrstFireInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ocurDo", scope = ResultType.FrstFireInfo.class)
    public JAXBElement<String> createResultTypeFrstFireInfoOcurDo(String value) {
        return new JAXBElement<String>(_ResultTypeFrstFireInfoOcurDo_QNAME, String.class, ResultType.FrstFireInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "dmgArea", scope = ResultType.FrstFireInfo.class)
    public JAXBElement<String> createResultTypeFrstFireInfoDmgArea(String value) {
        return new JAXBElement<String>(_ResultTypeFrstFireInfoDmgArea_QNAME, String.class, ResultType.FrstFireInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "dmgMoney", scope = ResultType.FrstFireInfo.class)
    public JAXBElement<String> createResultTypeFrstFireInfoDmgMoney(String value) {
        return new JAXBElement<String>(_ResultTypeFrstFireInfoDmgMoney_QNAME, String.class, ResultType.FrstFireInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "windMax", scope = ResultType.FrstFireInfo.class)
    public JAXBElement<String> createResultTypeFrstFireInfoWindMax(String value) {
        return new JAXBElement<String>(_ResultTypeFrstFireInfoWindMax_QNAME, String.class, ResultType.FrstFireInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "rainDays", scope = ResultType.FrstFireInfo.class)
    public JAXBElement<String> createResultTypeFrstFireInfoRainDays(String value) {
        return new JAXBElement<String>(_ResultTypeFrstFireInfoRainDays_QNAME, String.class, ResultType.FrstFireInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "exintgTm", scope = ResultType.FrstFireInfo.class)
    public JAXBElement<String> createResultTypeFrstFireInfoExintgTm(String value) {
        return new JAXBElement<String>(_ResultTypeFrstFireInfoExintgTm_QNAME, String.class, ResultType.FrstFireInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "humidRel", scope = ResultType.FrstFireInfo.class)
    public JAXBElement<String> createResultTypeFrstFireInfoHumidRel(String value) {
        return new JAXBElement<String>(_ResultTypeFrstFireInfoHumidRel_QNAME, String.class, ResultType.FrstFireInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ocurCause", scope = ResultType.FrstFireInfo.class)
    public JAXBElement<String> createResultTypeFrstFireInfoOcurCause(String value) {
        return new JAXBElement<String>(_ResultTypeFrstFireInfoOcurCause_QNAME, String.class, ResultType.FrstFireInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ocurRi", scope = ResultType.FrstFireInfo.class)
    public JAXBElement<String> createResultTypeFrstFireInfoOcurRi(String value) {
        return new JAXBElement<String>(_ResultTypeFrstFireInfoOcurRi_QNAME, String.class, ResultType.FrstFireInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "humidMin", scope = ResultType.FrstFireInfo.class)
    public JAXBElement<String> createResultTypeFrstFireInfoHumidMin(String value) {
        return new JAXBElement<String>(_ResultTypeFrstFireInfoHumidMin_QNAME, String.class, ResultType.FrstFireInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "humidCurr", scope = ResultType.FrstFireInfo.class)
    public JAXBElement<String> createResultTypeFrstFireInfoHumidCurr(String value) {
        return new JAXBElement<String>(_ResultTypeFrstFireInfoHumidCurr_QNAME, String.class, ResultType.FrstFireInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ocurEmd", scope = ResultType.FrstFireInfo.class)
    public JAXBElement<String> createResultTypeFrstFireInfoOcurEmd(String value) {
        return new JAXBElement<String>(_ResultTypeFrstFireInfoOcurEmd_QNAME, String.class, ResultType.FrstFireInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ocurGm", scope = ResultType.FrstFireInfo.class)
    public JAXBElement<String> createResultTypeFrstFireInfoOcurGm(String value) {
        return new JAXBElement<String>(_ResultTypeFrstFireInfoOcurGm_QNAME, String.class, ResultType.FrstFireInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "dirAvg", scope = ResultType.FrstFireInfo.class)
    public JAXBElement<String> createResultTypeFrstFireInfoDirAvg(String value) {
        return new JAXBElement<String>(_ResultTypeFrstFireInfoDirAvg_QNAME, String.class, ResultType.FrstFireInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "riskMax", scope = ResultType.FrstFireInfo.class)
    public JAXBElement<String> createResultTypeFrstFireInfoRiskMax(String value) {
        return new JAXBElement<String>(_ResultTypeFrstFireInfoRiskMax_QNAME, String.class, ResultType.FrstFireInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ocurJibun", scope = ResultType.FrstFireInfo.class)
    public JAXBElement<String> createResultTypeFrstFireInfoOcurJibun(String value) {
        return new JAXBElement<String>(_ResultTypeFrstFireInfoOcurJibun_QNAME, String.class, ResultType.FrstFireInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ocurDt", scope = ResultType.FrstFireInfo.class)
    public JAXBElement<String> createResultTypeFrstFireInfoOcurDt(String value) {
        return new JAXBElement<String>(_ResultTypeFrstFireInfoOcurDt_QNAME, String.class, ResultType.FrstFireInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "dirMax", scope = ResultType.FrstFireInfo.class)
    public JAXBElement<String> createResultTypeFrstFireInfoDirMax(String value) {
        return new JAXBElement<String>(_ResultTypeFrstFireInfoDirMax_QNAME, String.class, ResultType.FrstFireInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "riskAvg", scope = ResultType.FrstFireInfo.class)
    public JAXBElement<String> createResultTypeFrstFireInfoRiskAvg(String value) {
        return new JAXBElement<String>(_ResultTypeFrstFireInfoRiskAvg_QNAME, String.class, ResultType.FrstFireInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "extingDt", scope = ResultType.FrstFireInfo.class)
    public JAXBElement<String> createResultTypeFrstFireInfoExtingDt(String value) {
        return new JAXBElement<String>(_ResultTypeFrstFireInfoExtingDt_QNAME, String.class, ResultType.FrstFireInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "tempAvg", scope = ResultType.FrstFireInfo.class)
    public JAXBElement<String> createResultTypeFrstFireInfoTempAvg(String value) {
        return new JAXBElement<String>(_ResultTypeFrstFireInfoTempAvg_QNAME, String.class, ResultType.FrstFireInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ownerSec", scope = ResultType.FrstFireInfo.class)
    public JAXBElement<String> createResultTypeFrstFireInfoOwnerSec(String value) {
        return new JAXBElement<String>(_ResultTypeFrstFireInfoOwnerSec_QNAME, String.class, ResultType.FrstFireInfo.class, value);
    }

}
