package com.chaoslogix.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MainController {

    @GetMapping("/login")
    public String loginPage() {
        return "index";
    }

    @GetMapping("/dashboard")
    public String dashboardPage() {
        return "dashboard";
    }

    @GetMapping("/order-entry")
    public String orderEntryPage() {
    return "order-entry";
    }

    @GetMapping("/order-active")
    public String orderActivePage() {
        return "order-active";
    }

    @GetMapping("/view-loads")
    public String viewLoads() {
    return "view-loads";
    }
    
    
}
