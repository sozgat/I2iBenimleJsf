
package com.i2i.i2ibenimle.services;

import com.i2i.i2ibenimle.beans.LoginControl;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.xml.DOMConfigurator;

/**
 *
 * @author said özgat
 */
public class LogFourJService {
    public static Logger logProperties(String className){
        // creates pattern layout
        PatternLayout layout = new PatternLayout();
        String conversionPattern = "%-7p %d [%t] %c %x - %m%n";
        layout.setConversionPattern(conversionPattern);
 
 
        // creates file appender
        FileAppender fileAppender = new FileAppender();
        // fileAppender.setFile("C:/Users/7141/i2ilog.txt");
         fileAppender.setFile("../META-INF/i2ilog.txt");
        fileAppender.setLayout(layout);
        fileAppender.activateOptions();
 
        // configures the root logger
        Logger logger = Logger.getLogger(className);
        logger.addAppender(fileAppender);
        return  logger;
    }
    
}
