package com.luongvandat.services.impl;

import com.luongvandat.models.Product;
import com.luongvandat.repositories.ProductRepository;
import com.luongvandat.services.ProductServices;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServicesImpl implements ProductServices {
    private ProductRepository productRepository;

    public ProductServicesImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }
}