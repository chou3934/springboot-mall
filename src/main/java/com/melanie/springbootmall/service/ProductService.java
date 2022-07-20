package com.melanie.springbootmall.service;

import com.melanie.springbootmall.dto.ProductRequest;
import com.melanie.springbootmall.model.Product;

public interface ProductService {
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
