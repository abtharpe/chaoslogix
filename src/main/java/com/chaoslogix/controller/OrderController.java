package com.chaoslogix.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chaoslogix.model.OrderEntity;
import com.chaoslogix.service.OrderService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/orders")
public class OrderController {
    
    @Autowired
    private OrderService orderService;

    @PostMapping
    public ResponseEntity<OrderEntity> createOrder(@RequestBody OrderEntity order) {
        OrderEntity savedOrder = orderService.saveOrder(order);
        return ResponseEntity.ok(savedOrder);
    }

    @GetMapping
    public ResponseEntity<List<OrderEntity>> getOrders() {
        List<OrderEntity> orders = orderService.orderList();
        return ResponseEntity.ok(orders);
    }
    

}
