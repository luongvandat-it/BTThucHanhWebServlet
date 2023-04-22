package com.luongvandat.controllers;

import com.luongvandat.models.Order_;
import com.luongvandat.services.OrderServices;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

@Controller
@RequestMapping("/orders")
public class OrderController {
    private OrderServices orderServices;

    public OrderController(OrderServices orderServices) {
        this.orderServices = orderServices;
    }

    @GetMapping("")
    public ModelAndView list() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("orders", orderServices.findAll());
        modelAndView.setViewName("list_orders");
        return modelAndView;
    }

    @GetMapping("/showOrderForm")
    public ModelAndView showOrderForm() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("order", new Order_());
        modelAndView.setViewName("add_order_form");
        return modelAndView;
    }

    @GetMapping("/add")
    public ModelAndView add(Order_ order) {
        ModelAndView modelAndView = new ModelAndView();
        order.setOrderDate(new Date());
        orderServices.save(order);
        modelAndView.setViewName("redirect:/orders");
        return modelAndView;
    }
}