
package com.i2i.i2ibenimle.beans;

import com.i2i.i2ibenimle.services.LogFourJService;
import com.i2i.i2ibenimle.services.WebServiceConnection;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import org.apache.log4j.Logger;

/**
 *
 * @author said özgat
 */
@ManagedBean
@SessionScoped
public class Wallet{
    private int amount;
    private String addmsisdn;
    private int addamount;
    private String addMessage;
    private String addAmountControlMessage;
   private WebServiceConnection conn = new  WebServiceConnection();
   private  Logger logger=LogFourJService.logProperties("Wallet.class");
    
    /**
     *
     * @param contractId
     */
    public void setWalletAmount(int contractId){
        
       setAmount(conn.getWebServiceData().getCustomerWallet(contractId).getAmount());
       logger.info("MÜŞTERİNİN KALAN TL'Sİ: " + amount);
    }

    /**
     *
     * @return 
     */
    public String AddWalletAmount(){
        if(addamount!=0 ){
            if(addmsisdn!=""){
        conn.getWebServiceData().updateCustomerWallet(addamount, addmsisdn);
        setAmount(conn.getWebServiceData().getCustomerWallet(Contract.getContractId()).getAmount());
        logger.info(addmsisdn +" NUMARASINA "+ addamount + " TL YÜKLEME YAPILDI.");
        addAmountControlMessage="";
        addMessage="Yükleme işleminiz başarıyla gerçekleşti. Teşekkür ederiz.";
        return "addbalanceaction";
            }
            else{
                addAmountControlMessage="Telefon numarası boş bırakılamaz.";
            }
        
        }
        else{
            addAmountControlMessage="Lütfen yükleme yapılacak miktarı seçiniz.";
            logger.error("TL YÜKLEMESİ YAPARKEN MİKTAR SEÇİLMEDİ");
        }
            
        return "";
         
    }
    public void message(){
        addMessage="";
        
    }

    /**
     *
     * @return
     */
    public int getAmount() {
        return amount;
    }

    /**
     *
     * @param amount
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     *
     * @return
     */
    public String getAddmsisdn() {
        return addmsisdn;
    }

    /**
     *
     * @param addmsisdn
     */
    public void setAddmsisdn(String addmsisdn) {
        this.addmsisdn = addmsisdn;
    }

    /**
     *
     * @return
     */
    public int getAddamount() {
        return addamount;
    }

    /**
     *
     * @param addamount
     */
    public void setAddamount(int addamount) {
        this.addamount = addamount;
    }

    public String getAddMessage() {
        return addMessage;
    }

    public void setAddMessage(String addMessage) {
        this.addMessage = addMessage;
    }

    public String getAddAmountControlMessage() {
        return addAmountControlMessage;
    }

    public void setAddAmountControlMessage(String addAmountControlMessage) {
        this.addAmountControlMessage = addAmountControlMessage;
    }
    
    
    
    
    
    
}
