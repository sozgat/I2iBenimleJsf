package com.i2i.i2ibenimle.beans;

import com.i2i.i2ibenimle.services.CampaignService;
import com.i2i.i2ibenimle.services.LogFourJService;
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
 * @author said özgat
 */
@ManagedBean
@ViewScoped
public class CampaignListView implements Serializable{
    private List<Campaign> campaignList;
    private Campaign selectedCampaign;

    private String campaignName;
    private String campaignDescription;
    private String campaignRules;
    
    
    @ManagedProperty("#{campaignService}")
    private CampaignService service;
    
    @PostConstruct
    public void init() {
        campaignList = service.createRecipes();
    }

    public List<Campaign> getCampaignList() {
        return campaignList;
    }

    public void setCampaignList(List<Campaign> campaignList) {
        this.campaignList = campaignList;
    }

    public Campaign getSelectedCampaign() {
        return selectedCampaign;
    }

    public void setSelectedCampaign(Campaign selectedCampaign) {
        this.selectedCampaign = selectedCampaign;
    }

    public void setService(CampaignService service) {
        this.service = service;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public String getCampaignDescription() {
        return campaignDescription;
    }

    public void setCampaignDescription(String campaignDescription) {
        this.campaignDescription = campaignDescription;
    }

    public String getCampaignRules() {
        return campaignRules;
    }

    public void setCampaignRules(String campaignRules) {
        this.campaignRules = campaignRules;
    }
    
    
    private Logger logger=LogFourJService.logProperties("Customer.class");
    
    public void goster(){
        FacesContext fc = FacesContext.getCurrentInstance();
        Map<String,String> params = fc.getExternalContext().getRequestParameterMap();
        String no =  params.get("campaignid");
        int campaignid=Integer.parseInt(no);
        for (int i = 0; i < campaignList.size(); i++) {
            if(campaignid==campaignList.get(i).getId()){
                campaignName="KAMPANYA: "+campaignList.get(i).getName();
                campaignDescription=campaignList.get(i).getDescription();
                campaignRules="KAMPANYA KURALLARI: "+campaignList.get(i).getRules();
                logger.info("KAMPANYALAR ÇAĞIRILDI-> KAMPANYA ADI: "+ campaignName +" KAMPANYA İÇERİĞİ: "+ campaignDescription +" KAMPANYA KURALLARI: "+ campaignRules);
            }
            
        }
    }
    
    
}
