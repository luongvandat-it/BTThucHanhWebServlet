package com.luongvandat.models;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class ImportGoodsDetailID implements Serializable {
    private long importGoodsId;
    private long orderId;
}