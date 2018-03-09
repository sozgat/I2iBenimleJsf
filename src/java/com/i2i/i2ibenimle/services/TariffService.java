package com.i2i.i2ibenimle.services;


/**
 *
 * @author said özgat
 */
import com.i2i.i2ibenimle.beans.Tariff;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

 
@ManagedBean(name = "tariffService")
@ApplicationScoped
public class TariffService {

       List< i2i_benimle.Tariff> tariffList;
      
        private  WebServiceConnection port = new WebServiceConnection();

    
     
    public List<Tariff> createRecipes() {
       tariffList   = port.getWebServiceData().getRateplanList();
       
    List<Tariff> list = new ArrayList<Tariff>();
        for(int i = 0 ; i < tariffList.size() ; i++) {
            Tariff rec = new Tariff(tariffList.get(i).getId(), tariffList.get(i).getName(), tariffList.get(i).getDescription(), tariffList.get(i).getDataAmount(), tariffList.get(i).getVoiceAmount(), tariffList.get(i).getSmsAmount(), tariffList.get(i).getPrice());
            
            list.add(rec);
        }
         
        return list;
    }
     
    
}