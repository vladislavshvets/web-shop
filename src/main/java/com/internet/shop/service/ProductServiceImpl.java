package com.internet.shop.service;

import com.internet.shop.dao.ProductDao;
import com.internet.shop.lib.Inject;
import com.internet.shop.lib.Service;
import com.internet.shop.model.Product;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    @Inject
    private ProductDao productDao;

    @Override
    public Product create(Product product) {
        product.setName(product.getName().toUpperCase());
        return productDao.create(product);
    }

    @Override
    public Optional<Product> getById(Long productId) {
        return Optional.empty();
    }

    @Override
    public Product update(Product product) {
        return null;
    }

    @Override
    public boolean deleteById(Long productId) {
        return false;
    }

    @Override
    public boolean delete(Product product) {
        return false;
    }

    @Override
    public List<Product> getAllProducts() {
        return null;
    }
}
