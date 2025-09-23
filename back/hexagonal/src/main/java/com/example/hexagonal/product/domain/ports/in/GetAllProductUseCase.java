package com.example.hexagonal.product.domain.ports.in;



import com.example.hexagonal.product.domain.model.Product;

import java.util.List;

public interface GetAllProductUseCase {

    List<Product> getAllProducts();

}