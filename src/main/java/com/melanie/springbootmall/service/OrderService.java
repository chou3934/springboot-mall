package com.melanie.springbootmall.service;

import com.melanie.springbootmall.dto.CreateOrderRequest;
import com.melanie.springbootmall.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
