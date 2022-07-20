package com.melanie.springbootmall.dao;

import com.melanie.springbootmall.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);
}
