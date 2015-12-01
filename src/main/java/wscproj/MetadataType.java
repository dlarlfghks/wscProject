
package wscproj;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>metadataType complex type�� ���� Java Ŭ�����Դϴ�.
 * 
 * <p>���� ��Ű�� ������ �� Ŭ������ ���ԵǴ� �ʿ��� �������� �����մϴ�.
 * 
 * <pre>
 * &lt;complexType name="metadataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultSummary" type="{}resultSummaryType"/>
 *         &lt;element name="inputData" type="{}inputDataType"/>
 *         &lt;element name="outputData" type="{}outputDataType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "metadataType", propOrder = {
    "resultSummary",
    "inputData",
    "outputData"
})
public class MetadataType {

    @XmlElement(required = true)
    protected ResultSummaryType resultSummary;
    @XmlElement(required = true)
    protected InputDataType inputData;
    @XmlElement(required = true)
    protected OutputDataType outputData;

    /**
     * resultSummary �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link ResultSummaryType }
     *     
     */
    public ResultSummaryType getResultSummary() {
        return resultSummary;
    }

    /**
     * resultSummary �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultSummaryType }
     *     
     */
    public void setResultSummary(ResultSummaryType value) {
        this.resultSummary = value;
    }

    /**
     * inputData �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link InputDataType }
     *     
     */
    public InputDataType getInputData() {
        return inputData;
    }

    /**
     * inputData �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link InputDataType }
     *     
     */
    public void setInputData(InputDataType value) {
        this.inputData = value;
    }

    /**
     * outputData �Ӽ��� ���� �����ɴϴ�.
     * 
     * @return
     *     possible object is
     *     {@link OutputDataType }
     *     
     */
    public OutputDataType getOutputData() {
        return outputData;
    }

    /**
     * outputData �Ӽ��� ���� �����մϴ�.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputDataType }
     *     
     */
    public void setOutputData(OutputDataType value) {
        this.outputData = value;
    }

}
