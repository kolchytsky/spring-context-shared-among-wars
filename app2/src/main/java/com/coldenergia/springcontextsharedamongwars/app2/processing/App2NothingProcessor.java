package com.coldenergia.springcontextsharedamongwars.app2.processing;

import com.coldenergia.springcontextsharedamongwars.common.Nothing;
import com.coldenergia.springcontextsharedamongwars.common.NothingRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import java.util.Set;

/**
 * User: coldenergia
 * Date: 3/8/15
 * Time: 10:59 AM
 */
@Component
public class App2NothingProcessor {

    private static final Logger LOGGER = LoggerFactory.getLogger(App2NothingProcessor.class);

    // It is defined in the parent (ear.context) context
    @Autowired
    private NothingRepository nothingRepository;

    public void processNothings() {
        Assert.notNull(nothingRepository);
        Set<Nothing> nothings = nothingRepository.findAll();
        for (Nothing n : nothings) {
            LOGGER.info("App2 has processed " + n);
        }
    }
}
