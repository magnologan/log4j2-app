package com.example.web;

import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author longgt
 */
public class ExampleWeb implements Runnable {
    private static final  Logger log4j = LogManager.getLogger(ExampleWeb.class);
    
    @Override
    public void run() {
        while (true) {
            Date d = new Date();
            log4j.debug("ExampleWeb.debug " + d);
            log4j.warn("ExampleWeb.warn " + d);
            log4j.info("ExampleWeb.info " + d);
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
