package com.i2i.i2ibenimle.beans;



/**
 *
 * @author said özgat
 */
import com.i2i.i2ibenimle.services.LogFourJService;
import com.i2i.i2ibenimle.services.TariffService;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.apache.log4j.Logger;

/**
 *
 * @author 7141
 */
@ManagedBean
@ViewScoped
public class TariffListView implements Serializable {
     
    private List<Tariff> tariffList;
         
    private Tariff selectedTariff;
    private Logger logger=LogFourJService.logProperties("Customer.class");

    /**
     *
     */
    private String tariffName;
    private  String tariffInformation;
    private String tariffDataAmount;
    private String tariffVoiceAmount;
    private String tariffSmsAmount;
    private String tariffPrice; 
     
    @ManagedProperty("#{tariffService}")
    private TariffService service;
     
    /**
     *
     */
    @PostConstruct
    public void init() {
        tariffList = service.createRecipes();
    }

    /**
     *
     * @return
     */
    public List<Tariff> getTariffList() {
        return tariffList;
    }

    /**
     *
     * @param tariffList
     */
    public void setTariffList(List<Tariff> tariffList) {
        this.tariffList = tariffList;
    }

    /**
     *
     * @return
     */
    public Tariff getSelectedTariff() {
        return selectedTariff;
    }

    /**
     *
     * @param selectedTariff
     */
    public void setSelectedTariff(Tariff selectedTariff) {
        this.selectedTariff = selectedTariff;
    }

    /**
     *
     * @param service
     */
    public void setService(TariffService service) {
        this.service = service;
    }

    /**
     *
     * @return
     */
    public String getTariffInformation() {
        return tariffInformation;
    }

    /**
     *
     * @param tariffInformation
     */
    public void setTariffInformation(String tariffInformation) {
        this.tariffInformation = tariffInformation;
    }

    
    
    public  String getTariffName(){
        
        return tariffName;
       
    }

    public void setTariffName(String tariffName) {
        this.tariffName = tariffName;
    }

    public String getTariffDataAmount() {
        return tariffDataAmount;
    }

    public void setTariffDataAmount(String tariffDataAmount) {
        this.tariffDataAmount = tariffDataAmount;
    }

    public String getTariffVoiceAmount() {
        return tariffVoiceAmount;
    }

    public void setTariffVoiceAmount(String tariffVoiceAmount) {
        this.tariffVoiceAmount = tariffVoiceAmount;
    }

    public String getTariffSmsAmount() {
        return tariffSmsAmount;
    }

    public void setTariffSmsAmount(String tariffSmsAmount) {
        this.tariffSmsAmount = tariffSmsAmount;
    }

    public String getTariffPrice() {
        return tariffPrice;
    }

    public void setTariffPrice(String tariffPrice) {
        this.tariffPrice = tariffPrice;
    }

    

    public void goster() {
        FacesContext fc = FacesContext.getCurrentInstance();
        Map<String,String> params = fc.getExternalContext().getRequestParameterMap();
        String no =  params.get("recipeid");
        int recipeid=Integer.parseInt(no);
        for (int i = 0; i < tariffList.size(); i++) {
            if(recipeid==tariffList.get(i).id){
                tariffName= "TARİFE: "+tariffList.get(i).name;
                tariffInformation= tariffList.get(i).information;
                tariffVoiceAmount=String.valueOf(tariffList.get(i).voiceAmount) + " DAKİKA";
                tariffSmsAmount=String.valueOf(tariffList.get(i).smsAmount) + " SMS";
                tariffDataAmount=String.valueOf(tariffList.get(i).dataAmount) +" INTERNET";
                tariffPrice=String.valueOf(tariffList.get(i).price) + " TL";
                logger.info("TARİFE ÇAĞIRILDI-> TARİFE ADI: "+ tariffName +" TARİFE İÇERİĞİ: "+ tariffInformation +" VOICE: "+ tariffVoiceAmount +" SMS: "+ tariffSmsAmount +" DATA: " + tariffDataAmount);
                break;
            }
            
            
        }
    }

 
   
    
    
    
 

}