
package i2i_benimle;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for balance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="balance">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contract_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="expiration_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="msisdn_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="remaining_data" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="remaining_sms" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="remaining_voice" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "balance", propOrder = {
    "contractId",
    "expirationDate",
    "id",
    "msisdnId",
    "remainingData",
    "remainingSms",
    "remainingVoice"
})
public class Balance {

    @XmlElement(name = "contract_id")
    protected int contractId;
    @XmlElement(name = "expiration_date")
    protected String expirationDate;
    protected int id;
    @XmlElement(name = "msisdn_id")
    protected int msisdnId;
    @XmlElement(name = "remaining_data")
    protected int remainingData;
    @XmlElement(name = "remaining_sms")
    protected int remainingSms;
    @XmlElement(name = "remaining_voice")
    protected int remainingVoice;

    /**
     * Gets the value of the contractId property.
     * 
     */
    public int getContractId() {
        return contractId;
    }

    /**
     * Sets the value of the contractId property.
     * 
     */
    public void setContractId(int value) {
        this.contractId = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirationDate(String value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the msisdnId property.
     * 
     */
    public int getMsisdnId() {
        return msisdnId;
    }

    /**
     * Sets the value of the msisdnId property.
     * 
     */
    public void setMsisdnId(int value) {
        this.msisdnId = value;
    }

    /**
     * Gets the value of the remainingData property.
     * 
     */
    public int getRemainingData() {
        return remainingData;
    }

    /**
     * Sets the value of the remainingData property.
     * 
     */
    public void setRemainingData(int value) {
        this.remainingData = value;
    }

    /**
     * Gets the value of the remainingSms property.
     * 
     */
    public int getRemainingSms() {
        return remainingSms;
    }

    /**
     * Sets the value of the remainingSms property.
     * 
     */
    public void setRemainingSms(int value) {
        this.remainingSms = value;
    }

    /**
     * Gets the value of the remainingVoice property.
     * 
     */
    public int getRemainingVoice() {
        return remainingVoice;
    }

    /**
     * Sets the value of the remainingVoice property.
     * 
     */
    public void setRemainingVoice(int value) {
        this.remainingVoice = value;
    }

}
