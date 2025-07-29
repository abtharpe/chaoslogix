package com.chaoslogix.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chaoslogix.model.OrderEntity;
import com.chaoslogix.repository.OrderRepository;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public OrderEntity saveOrder(OrderEntity order) {
        return orderRepository.save(order);
    }

    public List<OrderEntity> orderList() {
        return orderRepository.findAll();
    }
    
}
