package com.i2i.i2ibenimle.services;

import i2i_benimle.Dbi2IBenimle;
import i2i_benimle.Dbi2IBenimleService;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.context.FacesContext;

/**
 *
 * @author said özgat
 * 
 * 
 */
public class WebServiceConnection {
    
    public Dbi2IBenimle getWebServiceData(){
        Properties properties = new Properties();
        
        String url = "";
        try {
             properties.load(FacesContext.getCurrentInstance().getExternalContext().getResourceAsStream("/WEB-INF/i2ibenimle.properties"));
             url = properties.getProperty("i2ibenimlews.url");
        } catch (IOException e) {
            System.err.println("i2ibenimle.properties dosyasını yüklemede hata: "+e.toString());
        }
   
        Dbi2IBenimleService service = null;
        try {
            service = new Dbi2IBenimleService(new URL(url));
        } catch (MalformedURLException ex) {
            Logger.getLogger(WebServiceConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        Dbi2IBenimle port = service.getDbi2IBenimlePort();
   
        return port;
    }
    
}
