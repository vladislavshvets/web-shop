package com.internet.shop.service;

import com.internet.shop.model.Product;
import java.util.List;
import java.util.Optional;

public interface ProductService {
    Product create(Product product);

    Optional<Product> getById(Long productId);

    Product update(Product product);

    boolean deleteById(Long productId);

    boolean delete(Product product);

    List<Product> getAllProducts();
}
