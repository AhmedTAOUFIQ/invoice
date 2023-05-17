package com.ahmedtaoufiq.invoice.repositories;

import com.ahmedtaoufiq.invoice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
