package com.thoughtworks.retail_api_gateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MockContoller {

    @RequestMapping(value = "/mock", method = RequestMethod.GET)
    public String mock() {

        return "index";
    }
    
}
