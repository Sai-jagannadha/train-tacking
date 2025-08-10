package com.train_tracking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/train")
public class TrainController {
    @GetMapping("/test")
    public String Test() {
        return "Welcome to the train tracking application";
    }
    //build all the crud operationsc


}
