package com.detention.detentioncenter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class maincontroller {

    @GetMapping("")

    public String showHomepage(){
        System.out.println("main controller");
        return"index";
    }
}
