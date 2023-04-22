package com.luongvandat.services;

import com.luongvandat.models.Product;

import java.util.List;

public interface ProductServices {
    List<Product> findAll();

    Product save(Product product);
}