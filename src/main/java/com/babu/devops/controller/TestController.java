package com.babu.devops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class TestController {

    @GetMapping()
    @RequestMapping("/")
    String getWelcomeMsg(){
        return "Welcome to SpringBoot";
    }

    @GetMapping()
    @RequestMapping("DevOps")
    String getWishMsg(){
        return "Welcome to DevOps";
    }

    @GetMapping()
    @RequestMapping("newImage")
    String getChangeMsg(){
        return "Changes have been done successfully for New Image.";
    }

    @GetMapping()
    @RequestMapping("newImage")
    String getMsgFromAzureWebApp(){
        return "Changes have been deployed successfully in Azure webapp for container service.";
    }
}
