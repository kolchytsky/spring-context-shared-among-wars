package com.coldenergia.springcontextsharedamongwars.app1;

import com.coldenergia.springcontextsharedamongwars.common.Nothing;
import com.coldenergia.springcontextsharedamongwars.common.NothingRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Set;

/**
 * User: coldenergia
 * Date: 3/8/15
 * Time: 11:06 AM
 */
@Component
public class App1NothingProcessor {

    private static final Logger LOGGER = LoggerFactory.getLogger(App1NothingProcessor.class);

    // It is defined in the parent (ear.context) context
    @Autowired
    private NothingRepository nothingRepository;

    /*
    public App1NothingProcessor(NothingRepository nothingRepository) {
        this.nothingRepository = nothingRepository;
    }*/

    public void processNothings() {
        LOGGER.info("App1 nothing processor started processing nothings...");
        Set<Nothing> nothings = nothingRepository.findAll();
        for (Nothing n : nothings) {
            LOGGER.info("App1 has processed " + n);
        }
    }
}
