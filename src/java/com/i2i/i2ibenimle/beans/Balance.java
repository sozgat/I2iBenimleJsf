package com.i2i.i2ibenimle.beans;

import com.i2i.i2ibenimle.services.WebServiceConnection;
import i2i_benimle.Dbi2IBenimle;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author said özgat
 */
@ManagedBean
@SessionScoped
public class Balance {
    public static int remainingSms;
    public static int remainingVoice;
    public static int remainingData;
    private static String expirationDate;

   
    
//    private  WebServiceConnection port = new WebServiceConnection();
//      
//    /**
//     *
//     * @param contractId
//     */
//    public void setBalance(int contractId){
//           i2i_benimle.Balance balance = port.getWebServiceData().getBalance(contractId);
//         
//           setRemainingData(balance.getRemainingData());
//           setRemainingSms(balance.getRemainingSms());
//           setRemainingVoice(balance.getRemainingVoice());
//      }
//

    public  int getRemainingSms() {
        return remainingSms;
    }

    public static void setRemainingSms(int remainingSms) {
        Balance.remainingSms = remainingSms;
    }

    public  int getRemainingVoice() {
        return remainingVoice;
    }

    public static void setRemainingVoice(int remainingVoice) {
        Balance.remainingVoice = remainingVoice;
    }

    public  int getRemainingData() {
        return remainingData;
    }

    public static void setRemainingData(int remainingData) {
        Balance.remainingData = remainingData;
    }

    public  String getExpirationDate() {
        return expirationDate;
    }

    public static void setExpirationDate(String expirationDate) {
        Balance.expirationDate = expirationDate;
    }


    
    
    
}
