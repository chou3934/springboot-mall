package com.melanie.springbootmall.service.implement;

import com.melanie.springbootmall.dao.ProductDao;
import com.melanie.springbootmall.dto.ProductRequest;
import com.melanie.springbootmall.model.Product;
import com.melanie.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }

    @Override
    public Integer createProduct(ProductRequest productRequest) {
        return productDao.createProduct(productRequest);
    }
}
