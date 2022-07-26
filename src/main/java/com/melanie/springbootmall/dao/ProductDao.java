package com.melanie.springbootmall.dao;

import com.melanie.springbootmall.constant.ProductCategory;
import com.melanie.springbootmall.dto.ProductRequest;
import com.melanie.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts(ProductCategory category,String search);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
