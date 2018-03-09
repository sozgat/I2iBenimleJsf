package com.i2i.i2ibenimle.beans;

import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;


/**
 *
 * @author said özgat
 */

public class Tariff {
    
    public int id;
    public String name;
    public String information;
    public int dataAmount;
    public int voiceAmount;
    public int smsAmount;
    public int price;

    
    public Tariff(int id, String name, String information, int dataAmount, int voiceAmount, int smsAmount, int price) {
        this.id = id;
        this.name = name;
        this.information = information;
        this.dataAmount = dataAmount;
        this.voiceAmount = voiceAmount;
        this.smsAmount = smsAmount;
        this.price = price;
    }

    public Tariff(int id, String recipesName, String recipesInformation) {
        this.id = id;
        this.name = recipesName;
        this.information = recipesInformation;
    }

  
    
    

    public int getId() {
        return id;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public String getInformation() {
        return information;
    }

    /**
     *
     * @param information
     */
    public void setInformation(String information) {
        this.information = information;
    }

    public int getDataAmount() {
        return dataAmount;
    }

    public void setDataAmount(int dataAmount) {
        this.dataAmount = dataAmount;
    }

    public int getVoiceAmount() {
        return voiceAmount;
    }

    public void setVoiceAmount(int voiceAmount) {
        this.voiceAmount = voiceAmount;
    }

    public int getSmsAmount() {
        return smsAmount;
    }

    public void setSmsAmount(int smsAmount) {
        this.smsAmount = smsAmount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    

    
}
