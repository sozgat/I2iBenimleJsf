package com.i2i.i2ibenimle.services;

/**
 *
 * @author said özgat
 */
import com.i2i.i2ibenimle.beans.Campaign;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

 
@ManagedBean(name = "campaignService")
@ApplicationScoped
public class CampaignService {

    List< i2i_benimle.Campaign> campaignList;
    
    private  WebServiceConnection port = new WebServiceConnection();

    public List<Campaign> createRecipes() {
       campaignList = port.getWebServiceData().getCampaign();
       List<Campaign> list = new ArrayList<Campaign>();
        for (int i = 0; i < campaignList.size(); i++) {
         Campaign campaign= new Campaign(campaignList.get(i).getId(), campaignList.get(i).getName(), campaignList.get(i).getDescription(),campaignList.get(i).getRules() );
            list.add(campaign);
        }
        return list;
    }
    
}
