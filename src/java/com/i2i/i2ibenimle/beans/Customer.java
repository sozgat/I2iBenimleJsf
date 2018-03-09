
package com.i2i.i2ibenimle.beans;

import com.i2i.i2ibenimle.services.LogFourJService;
import com.i2i.i2ibenimle.services.WebServiceConnection;
import javax.el.ELContext;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.apache.log4j.Logger;

/**
 *
 * @author said özgat
 */
@ManagedBean
@SessionScoped
public class Customer  {
    private int id;
    private String firstName;
    private String lastName;
    private String tariffName;

    
    
    

    
   private  WebServiceConnection port = new WebServiceConnection();
   private Logger logger=LogFourJService.logProperties("Customer.class");
   
   public void setCustomer(){
       logger.info("MÜŞTERİ BİLGİLERİ WEB SERVİSTEN ÇEKİLİYOR.");
       i2i_benimle.Balance balance = port.getWebServiceData().getBalance(Contract.getContractId());
       i2i_benimle.Customer customer =port.getWebServiceData().getCustomerCredential(Contract.getContractId());
       i2i_benimle.Tariff tariff = port.getWebServiceData().getRateplan(Contract.getContractId());
       Balance.setRemainingData(balance.getRemainingData());
       Balance.setRemainingSms(balance.getRemainingSms());
       Balance.setRemainingVoice(balance.getRemainingVoice());
       Balance.setExpirationDate(balance.getExpirationDate());
       setFirstName(customer.getFirstName());
       setLastName(customer.getLastName()); 
       CustomerRatePlan.setTariffName(tariff.getName());
       CustomerRatePlan.setDataAmount(tariff.getDataAmount());
       CustomerRatePlan.setSmsAmount(tariff.getSmsAmount());
       CustomerRatePlan.setVoiceAmount(tariff.getVoiceAmount());
        logger.info("MÜŞTERİ ADI-SOYADI:" + getFullName());
        logger.info("MÜŞTERİ PAKET KALAN DEĞERLERİ:   VOİCE:" + Balance.remainingVoice + " SMS:" + Balance.remainingSms+ " DATA:" + Balance.remainingData);
        logger.info("MÜŞTERİ PAKET  DEĞERLERİ:   VOİCE:" + tariff.getVoiceAmount() + " SMS:" + tariff.getSmsAmount()+ " DATA:" + tariff.getDataAmount());
        
   }

    
   

    /**
     *
     * @return
     */
    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public String getFirstName() {
        return firstName;
    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     *
     * @return
     */
    public String getLastName() {
        return lastName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     *
     * @return
     */
    public String getFullName() {
        return  firstName + " " + lastName;
    }


    
}
