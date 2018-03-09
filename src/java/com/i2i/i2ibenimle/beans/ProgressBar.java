
package com.i2i.i2ibenimle.beans;

import com.i2i.i2ibenimle.services.LogFourJService;
import javax.el.ELContext;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.apache.log4j.Logger;

/**
 *
 * @author said özgat
 */
@ManagedBean
@SessionScoped          //Progress bar sadece kendi işini yapsın
public class ProgressBar {
    private int voiceValue; 
    private int smsValue;
    private int dataValue;
        
    private  CustomerRatePlan customerRatePlan = getRatePlan(); //private
    Balance balance = getBalance();
    
    private Logger logger=LogFourJService.logProperties("ProgressBar.class");
    
    /**
     *
     */
    public void setProgressBar(){
    setVoiceValue(balance.getRemainingVoice()*100/customerRatePlan.getVoiceAmount());
    setSmsValue(balance.getRemainingSms()*100/customerRatePlan.getSmsAmount());
    setDataValue(balance.getRemainingData()*100/customerRatePlan.getDataAmount());
    logger.info("YÜZDELİK KALAN KULLANIMLAR-> VOİCE: "+ voiceValue + " SMS: "+ smsValue + " DATA: "+ dataValue );
    }
 
    /**
     *
     * @return
     */
    public int getVoiceValue() {
        return voiceValue;
    }

    /**
     *
     * @param voiceValue
     */
    public void setVoiceValue(int voiceValue) {
        this.voiceValue = voiceValue;
    }

    /**
     *
     * @return
     */
    public int getSmsValue() {
        return smsValue;
    }

    /**
     *
     * @param smsValue
     */
    public void setSmsValue(int smsValue) {
        this.smsValue = smsValue;
    }

    /**
     *
     * @return
     */
    public int getDataValue() {
        return dataValue;
    }

    /**
     *
     * @param dataValue
     */
    public void setDataValue(int dataValue) {
        this.dataValue = dataValue;
    }
    
    /**
     *
     * @return
     */
    public CustomerRatePlan getRatePlan(){
         
        FacesContext context = FacesContext.getCurrentInstance();
        ELContext elContext = context.getELContext();
        return (CustomerRatePlan) elContext.getELResolver().getValue(elContext, null, "customerRatePlan");
    
     }
     
    /**
     *
     * @return
     */
    public Balance getBalance(){
         
        FacesContext context = FacesContext.getCurrentInstance();
        ELContext elContext = context.getELContext();
        return (Balance) elContext.getELResolver().getValue(elContext, null, "balance");
    
     }
    
        
    
    
    
    
}
