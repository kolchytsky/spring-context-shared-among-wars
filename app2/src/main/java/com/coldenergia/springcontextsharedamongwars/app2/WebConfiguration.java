package com.coldenergia.springcontextsharedamongwars.app2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * User: coldenergia
 * Date: 3/8/15
 * Time: 7:42 PM
 */
@Configuration
@ComponentScan(basePackages = "com.coldenergia.springcontextsharedamongwars.app2.controller")
@EnableWebMvc
public class WebConfiguration {
}
