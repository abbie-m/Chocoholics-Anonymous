package com.example.chocoan;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homeController {
    @RequestMapping("/")
    public String mainMenuTerminal(){
        return "mainMenu.html";
    }

    @RequestMapping("/provider")
    public String providerTerminal(){
        return "provider.html";
    }

    @RequestMapping("/manager")
    public String managerTerminal(){
        return "manager.html";
    }
}
