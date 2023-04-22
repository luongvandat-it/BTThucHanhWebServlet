package com.luongvandat.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long productId;
    private String productName;
    private String description;
    private String image;
    private String manufacturer;
    private int status;

    public Product(String productName, String description, String image, String manufacturer, int status) {
        this.productName = productName;
        this.description = description;
        this.image = image;
        this.manufacturer = manufacturer;
        this.status = status;
    }
}