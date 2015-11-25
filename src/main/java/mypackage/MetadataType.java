
package mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for metadataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
     * Gets the value of the resultSummary property.
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
     * Sets the value of the resultSummary property.
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
     * Gets the value of the inputData property.
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
     * Sets the value of the inputData property.
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
     * Gets the value of the outputData property.
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
     * Sets the value of the outputData property.
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
