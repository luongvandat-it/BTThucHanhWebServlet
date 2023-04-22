package com.luongvandat.services;

import com.luongvandat.models.Order_;

import java.util.List;

public interface OrderServices {
    List<Order_> findAll();

    Order_ save(Order_ order);
}