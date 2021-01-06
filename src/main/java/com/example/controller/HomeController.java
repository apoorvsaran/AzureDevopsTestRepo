package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.AppService;

@RestController
public class HomeController {
    
    @Autowired
    AppService appService;
    
    @RequestMapping(path = "/first", method = RequestMethod.GET)
    public String firstController() {
        return appService.firstMethod();
    }

}
