package com.ahmedtaoufiq.invoice.services.product;

import com.ahmedtaoufiq.invoice.entities.Product;

import java.util.List;

public interface ProductServiceInterface {
    Product create(Product product);
    List<Product> getAll();
    Product getById(Long id);
    void deleteById(Long id);
}
