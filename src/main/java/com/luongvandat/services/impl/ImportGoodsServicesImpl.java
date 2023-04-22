package com.luongvandat.services.impl;

import com.luongvandat.models.ImportGoods;
import com.luongvandat.repositories.ImportGoodsRepository;
import com.luongvandat.services.ImportGoodsServices;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImportGoodsServicesImpl implements ImportGoodsServices {
    private ImportGoodsRepository importGoodsRepository;

    public ImportGoodsServicesImpl(ImportGoodsRepository importGoodsRepository) {
        this.importGoodsRepository = importGoodsRepository;
    }

    @Override
    public List<ImportGoods> findAll() {
        return importGoodsRepository.findAll();
    }

    @Override
    public ImportGoods save(ImportGoods importGoods) {
        return importGoodsRepository.save(importGoods);
    }
}