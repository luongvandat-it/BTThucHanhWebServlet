package com.luongvandat.repositories;

import com.luongvandat.models.ImportGoods;
import com.luongvandat.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImportGoodsRepository extends JpaRepository<ImportGoods, Long> {
}