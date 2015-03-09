package com.coldenergia.springcontextsharedamongwars.app1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * User: coldenergia
 * Date: 3/8/15
 * Time: 11:57 AM
 */
public class InitAppListener implements ServletContextListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(InitAppListener.class);

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        LOGGER.info("App1 has been started.");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        LOGGER.info("App1 has been destroyed.");
    }
}
