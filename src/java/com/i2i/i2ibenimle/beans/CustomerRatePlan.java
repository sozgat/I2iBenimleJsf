
package com.i2i.i2ibenimle.beans;

import com.i2i.i2ibenimle.services.WebServiceConnection;
import i2i_benimle.Tariff;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author said özgat
 */
@ManagedBean
@SessionScoped
public class CustomerRatePlan {
    private static String tariffName;
    private static int dataAmount;
    private static int smsAmount;
    private static int voiceAmount;
   

    public  String getTariffName() {
        return tariffName;
    }

    public static void setTariffName(String tariffName) {
        CustomerRatePlan.tariffName = tariffName;
    }

    

    public  int getDataAmount() {
        return dataAmount;
    }

    public static void setDataAmount(int dataAmount) {
        CustomerRatePlan.dataAmount = dataAmount;
    }

    public  int getSmsAmount() {
        return smsAmount;
    }

    public static void setSmsAmount(int smsAmount) {
        CustomerRatePlan.smsAmount = smsAmount;
    }

    public  int getVoiceAmount() {
        return voiceAmount;
    }

    public static void setVoiceAmount(int voiceAmount) {
        CustomerRatePlan.voiceAmount = voiceAmount;
    }

 
    
    


}
