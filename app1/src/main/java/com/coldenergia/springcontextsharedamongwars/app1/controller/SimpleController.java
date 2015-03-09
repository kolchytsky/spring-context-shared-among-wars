package com.coldenergia.springcontextsharedamongwars.app1.controller;

import com.coldenergia.springcontextsharedamongwars.app1.App1NothingProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * User: coldenergia
 * Date: 3/8/15
 * Time: 4:33 PM
 */
@Controller
public class SimpleController {

    @Autowired
    private App1NothingProcessor app1NothingProcessor;

    @RequestMapping(value = "/process-nothings")
    public String directToView() {
        app1NothingProcessor.processNothings();
        return "index";
    }
}
