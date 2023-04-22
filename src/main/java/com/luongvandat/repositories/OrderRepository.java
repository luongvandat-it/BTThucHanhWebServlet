package com.luongvandat.repositories;

import com.luongvandat.models.Order_;
import com.luongvandat.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order_, Long> {
}