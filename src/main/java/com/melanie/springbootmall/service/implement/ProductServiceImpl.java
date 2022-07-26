package com.melanie.springbootmall.service.implement;

import com.melanie.springbootmall.constant.ProductCategory;
import com.melanie.springbootmall.dao.ProductDao;
import com.melanie.springbootmall.dto.ProductRequest;
import com.melanie.springbootmall.model.Product;
import com.melanie.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductServiceImpl implements ProductService {

    @Override
    public List<Product> getProducts(ProductCategory category,String search) {
        return productDao.getProducts(category,search);
    }

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

    @Override
    public void updateProduct(Integer productId, ProductRequest productRequest) {
        productDao.updateProduct(productId,productRequest);
    }

    @Override
    public void deleteProductById(Integer productId) {
        productDao.deleteProductById(productId);
    }
}
