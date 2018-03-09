
package com.i2i.i2ibenimle.beans;

import com.i2i.i2ibenimle.services.LogFourJService;
import com.i2i.i2ibenimle.services.WebServiceConnection;
import javax.el.ELContext;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;

/**
 *
 * @author said özgat
 */
@ManagedBean
@SessionScoped
public class LoginControl {
  private  String msisdn;
  private  String password;
  private String errorMessage;
  private static Logger logger;
   

   
     WebServiceConnection con = new WebServiceConnection();
     Contract contractId = new Contract();
     Customer customer = getCustomer();
     Balance balance = getBalance();
     Wallet wallet = getWallet();
     CustomerRatePlan customerRatePlan = getRatePlan();
     ProgressBar progressbar = getProgress();

    /**
     *
     * @return
     */
    public String login(){
       
 
    Logger logger=LogFourJService.logProperties("LoginControl.class");
    if(msisdn=="" || password =="" ){
           setErrorMessage("Telefon Numarası / Şifre boş bırakılamaz!");
            logger.info("TELEFON NUMARASI VE ŞİFRE ---BOŞ--- GİRİLDİ!");
           return   "";
       }
        
       contractId.setContractId( con.getWebServiceData().getContractId(msisdn, password));
       logger.info("TELEFON NUMARASI VE ŞİFRE GİRİLDİ!");
       logger.info("TELEFON NUMARASI:" + msisdn + " ŞİFRE: " + password);
       
       
       
     if(contractId.getContractId()!= -1){
         logger.info("TELEFON NUMARASI VE ŞİFRE DOĞRU!");
         setErrorMessage("");
         customer.setCustomer();
         wallet.setWalletAmount(contractId.getContractId());
         logger.info("PROGRESS BAR ÇALIŞIYOR.");
         progressbar.setProgressBar();
         return "homepage.xhtml";
    
    }   
     else{
         logger.error("TELEFON NUMARASI VE ŞİFRE HATALI!");
         logger.error("TELEFON NUMARASI:" + msisdn + " ŞİFRE: " + password);
         setErrorMessage("Telefon Numaranız veya Şifreniz Hatalı!");
         return "";
     }    
     }


     
    /**
     *
     * @return
     */
    public Customer getCustomer(){
         
        FacesContext context = FacesContext.getCurrentInstance();
        ELContext elContext = context.getELContext();
        return (Customer) elContext.getELResolver().getValue(elContext, null, "customer");
    
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
    public Wallet getWallet(){
         FacesContext context = FacesContext.getCurrentInstance();
        ELContext elContext = context.getELContext();
        return (Wallet) elContext.getELResolver().getValue(elContext, null, "wallet");
     }
     
    /**
     *
     * @return
     */
    public ProgressBar getProgress(){
         
        FacesContext context = FacesContext.getCurrentInstance();
        ELContext elContext = context.getELContext();
        return (ProgressBar) elContext.getELResolver().getValue(elContext, null, "progressBar");
    
     }

    /**
     *
     * @return
     */
    public String getMsisdn() {
        return msisdn;
    }

    /**
     *
     * @param msisdn
     */
    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    /**
     *
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     *
     * @return
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     *
     * @param errorMessage
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    
    
    
    
}
