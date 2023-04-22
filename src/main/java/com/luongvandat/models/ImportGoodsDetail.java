package com.luongvandat.models;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ImportGoodsDetail {
    @EmbeddedId
    private ImportGoodsDetailID importGoodsDetailID;
    private long productId;
    private int quantity;
    private double price;
    private String note;
    @ManyToOne
    @MapsId("importGoodsId")
    private ImportGoods importGoods;
    @ManyToOne
    @MapsId("orderId")
    private Order_ order;
}