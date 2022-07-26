package com.melanie.springbootmall.service;

import com.melanie.springbootmall.constant.ProductCategory;
import com.melanie.springbootmall.dto.ProductQueryParams;
import com.melanie.springbootmall.dto.ProductRequest;
import com.melanie.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    Integer countProduct(ProductQueryParams productQueryParams);

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
