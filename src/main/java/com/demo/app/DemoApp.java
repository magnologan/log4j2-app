package com.demo.app;

import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author longgt
 */
public class DemoApp implements Runnable {
    private static final  Logger log4j = LogManager.getLogger(DemoApp.class);
    
    @Override
    public void run() {
        while (true) {
            Date d = new Date();
            log4j.debug("DemoApp.debug " + d);
            log4j.warn("DemoApp.warn " + d);
            log4j.info("DemoApp.info " + d);
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
