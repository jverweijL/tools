package com.liferay.tools.tools.controller;

import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class StaticController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
    
 
    @RequestMapping(value = {"/rest/test/", "/rest/test"}, method = {RequestMethod.GET, RequestMethod.POST})
    public String test(@RequestParam Map<String,String> allRequestParams) {
    	// just a blank end-point to test with ./trace from actuator
        return "This is a test";
    }

}