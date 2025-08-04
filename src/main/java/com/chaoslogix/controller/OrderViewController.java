package com.chaoslogix.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.chaoslogix.model.OrderEntity;
import com.chaoslogix.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class OrderViewController {
    
    @Autowired
    private OrderService orderService;

    @GetMapping
    public String viewActiveOrders(Model model) {
        List<OrderEntity> activeOrders = orderService.getAllOrders(); // Add filtering later
        model.addAttribute("orders", activeOrders);
        return "order-active";
    }
    

}
