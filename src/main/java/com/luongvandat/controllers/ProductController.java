package com.luongvandat.controllers;

import com.luongvandat.models.Product;
import com.luongvandat.services.ProductServices;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/products")
public class ProductController {
    private ProductServices productServices;

    public ProductController(ProductServices productServices) {
        this.productServices = productServices;
    }

    @GetMapping("")
    public ModelAndView list() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("products", productServices.findAll());
        modelAndView.setViewName("list_products");
        return modelAndView;
    }

    @GetMapping("/showProductForm")
    public ModelAndView showProductForm() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("product", new Product());
        modelAndView.setViewName("add_product_form");
        return modelAndView;
    }

    @GetMapping("/add")
    public ModelAndView add(Product product) {
        ModelAndView modelAndView = new ModelAndView();
        productServices.save(product);
        modelAndView.setViewName("redirect:/products");
        return modelAndView;
    }
}