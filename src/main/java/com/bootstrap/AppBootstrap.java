package com.bootstrap;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.demo.app.DemoApp;
import com.example.app.ExampleApp;
import com.example.web.ExampleWeb;

/**
 * @author longgt
 */
public class AppBootstrap {
    private static final  Logger log4j = LogManager.getLogger(AppBootstrap.class);
    
    public static void main(String[] args) {
        log4j.debug("AppBootstrap.debug ");
        log4j.warn("AppBootstrap.warn ");
        log4j.info("AppBootstrap.info ");
        
        DemoApp demoApp = new DemoApp();
        ExampleApp exampleApp = new ExampleApp();
        ExampleWeb exampleWeb = new ExampleWeb();
        
        Thread demoAppThread = new Thread(demoApp);
        Thread examplAppThread = new Thread(exampleApp);
        Thread exampleWebThread = new Thread(exampleWeb);
        
        demoAppThread.start();
        examplAppThread.start();
        exampleWebThread.start();
    }
}
