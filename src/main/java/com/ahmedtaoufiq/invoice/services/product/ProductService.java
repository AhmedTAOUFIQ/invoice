package com.ahmedtaoufiq.invoice.services.product;

import com.ahmedtaoufiq.invoice.entities.Product;
import com.ahmedtaoufiq.invoice.repositories.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class ProductService implements ProductServiceInterface{
    private ProductRepository productRepository;
    @Override
    public Product create(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }

    @Override
    public Product getById(Long id) {
        return productRepository
                .findById(id)
                .orElseThrow(() -> new RuntimeException("Cannot find product with Id :" + id));
    }

    @Override
    public void deleteById(Long id) {
        productRepository.deleteById(id);

    }
}
