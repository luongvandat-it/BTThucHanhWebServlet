package com.luongvandat.services;

import com.luongvandat.models.ImportGoods;
import com.luongvandat.models.Product;

import java.util.List;

public interface ImportGoodsServices {
    List<ImportGoods> findAll();

    ImportGoods save(ImportGoods importGoods);
}