package com.luongvandat.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ImportGoods {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long importGoodsId;
    private Date importDate;
    private String employeeName;
    private String manufacturerName;

    public ImportGoods(Date importDate, String employeeName, String manufacturerName) {
        this.importDate = importDate;
        this.employeeName = employeeName;
        this.manufacturerName = manufacturerName;
    }
}