package com.melanie.springbootmall.dao;

import com.melanie.springbootmall.dto.CreateOrderRequest;
import com.melanie.springbootmall.model.Order;
import com.melanie.springbootmall.model.OrderItem;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

public interface OrderDao {

    Order getOrderById(Integer orderId);

    List<OrderItem> getOrderItemsByOrderId(Integer orderId);

    Integer createOrder(Integer userId, Integer totalAmount);

    void createOrderItems(Integer orderId, List<OrderItem> orderItemList);
}
