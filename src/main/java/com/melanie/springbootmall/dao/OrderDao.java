package com.melanie.springbootmall.dao;

import com.melanie.springbootmall.dto.CreateOrderRequest;
import com.melanie.springbootmall.model.OrderItem;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

public interface OrderDao {
    Integer createOrder(Integer userId, Integer totalAmount);

    void createOrderItems(Integer orderId, List<OrderItem> orderItemList);
}
