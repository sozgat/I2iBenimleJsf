
package i2i_benimle;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tariff complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tariff">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="data_amount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sms_amount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="voice_amount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tariff", propOrder = {
    "dataAmount",
    "description",
    "id",
    "name",
    "price",
    "smsAmount",
    "voiceAmount"
})
public class Tariff {

    @XmlElement(name = "data_amount")
    protected int dataAmount;
    protected String description;
    protected int id;
    protected String name;
    protected int price;
    @XmlElement(name = "sms_amount")
    protected int smsAmount;
    @XmlElement(name = "voice_amount")
    protected int voiceAmount;

    /**
     * Gets the value of the dataAmount property.
     * 
     */
    public int getDataAmount() {
        return dataAmount;
    }

    /**
     * Sets the value of the dataAmount property.
     * 
     */
    public void setDataAmount(int value) {
        this.dataAmount = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the price property.
     * 
     */
    public int getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     */
    public void setPrice(int value) {
        this.price = value;
    }

    /**
     * Gets the value of the smsAmount property.
     * 
     */
    public int getSmsAmount() {
        return smsAmount;
    }

    /**
     * Sets the value of the smsAmount property.
     * 
     */
    public void setSmsAmount(int value) {
        this.smsAmount = value;
    }

    /**
     * Gets the value of the voiceAmount property.
     * 
     */
    public int getVoiceAmount() {
        return voiceAmount;
    }

    /**
     * Sets the value of the voiceAmount property.
     * 
     */
    public void setVoiceAmount(int value) {
        this.voiceAmount = value;
    }

}
