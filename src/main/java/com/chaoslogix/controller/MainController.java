package com.chaoslogix.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.chaoslogix.model.OrderEntity;
import com.chaoslogix.service.OrderService;


@Controller
public class MainController {

    @Autowired
    private OrderService orderService;

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
    public String viewActiveOrders(Model model) {
        List<OrderEntity> activeOrders = orderService.getAllOrders(); // Add filtering later
        model.addAttribute("orders", activeOrders);
        return "order-active";
    }

    @GetMapping("/view-loads")
    public String viewLoads() {
    return "view-loads";
    }
    
    
}
