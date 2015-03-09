package com.coldenergia.springcontextsharedamongwars.app2.controller;

import com.coldenergia.springcontextsharedamongwars.app2.processing.App2NothingProcessor;
import com.coldenergia.springcontextsharedamongwars.common.Nothing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: coldenergia
 * Date: 3/8/15
 * Time: 7:45 PM
 */
@RestController
public class SimpleController {

    @Autowired
    private App2NothingProcessor app2NothingProcessor;

    @RequestMapping(value = "nothing", method = RequestMethod.GET)
    public Nothing processedNothings() {
        app2NothingProcessor.processNothings();
        return new Nothing(4, "nothing");
    }
}
