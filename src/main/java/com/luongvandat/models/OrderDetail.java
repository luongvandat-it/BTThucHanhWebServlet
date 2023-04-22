package com.luongvandat.models;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import lombok.*;
import org.springframework.beans.factory.annotation.Value;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class OrderDetail {
    @EmbeddedId
    private OrderDetailID orderDetailID;
    @ManyToOne
    @MapsId("orderId")
    private Order_ order;
    @ManyToOne
    @MapsId("productId")
    private Product product;
    private long orderDetailId;
    private long productId;
    private int quantity;
    @Value("${qlsp.all}")
    @Setter(AccessLevel.NONE)
    private double priceSell;
}