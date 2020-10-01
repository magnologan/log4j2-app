package com.example.app;

import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author longgt
 */
public class ExampleApp implements Runnable {
    private static final  Logger log4j = LogManager.getLogger(ExampleApp.class);
    
    @Override
    public void run() {
        while (true) {
            Date d = new Date();
            log4j.debug("ExampleApp.debug " + d);
            log4j.warn("ExampleApp.warn " + d);
            log4j.info("ExampleApp.info " + d);
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
