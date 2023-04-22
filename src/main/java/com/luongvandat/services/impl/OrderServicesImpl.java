package com.luongvandat.services.impl;

import com.luongvandat.models.Order_;
import com.luongvandat.repositories.OrderRepository;
import com.luongvandat.services.OrderServices;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServicesImpl implements OrderServices {
    private OrderRepository orderRepository;

    public OrderServicesImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public List<Order_> findAll() {
        return orderRepository.findAll();
    }

    @Override
    public Order_ save(Order_ order) {
        return orderRepository.save(order);
    }
}