package com.kmercab.bnb.greenDoor.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloGreenDoorController {

    @RequestMapping("/bnb")
    public String helloMsg() {
        String msg = "Hello BNB Green Door";
        return msg;
    }
}