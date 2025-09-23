package com.example.hexagonal.product.domain.ports.in;

import com.example.hexagonal.product.domain.model.Product;

public interface CreateProductUseCase {

    Product createProduct(Product product);
}