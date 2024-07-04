package com.example.OrderPlacement.Service;

import com.example.OrderPlacement.Controller.OrderDetails;
import com.example.OrderPlacement.Model.Order;

import java.text.SimpleDateFormat;
import java.util.Date;

public class OrderShipping {

    private Order order = new Order();
    private OrderDetails orderDetails = new OrderDetails();

    public Order saveOrder(OrderDetails orderDetails) {
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentDateTime = dateFormat.format(currentDate);
        order.setOrder_name(orderDetails.getOrder_name());
        order.setUser_id(orderDetails.getUser_id());
        order.setUser_name(orderDetails.getUser_name());
        order.setVendor_id(orderDetails.getVendor_id());
        order.setVendor_name(orderDetails.getVendor_name());
        order.setOrder_date(currentDate);
        return order;
    }
}
