package com.coldenergia.springcontextsharedamongwars.app2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * User: coldenergia
 * Date: 3/8/15
 * Time: 12:00 PM
 */
public class InitAppListener implements ServletContextListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(InitAppListener.class);

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        LOGGER.info("App2 has been started.");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        LOGGER.info("App2 has been destroyed.");
    }
}
