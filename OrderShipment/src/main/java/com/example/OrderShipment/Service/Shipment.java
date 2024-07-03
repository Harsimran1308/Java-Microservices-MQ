package com.example.OrderShipment.Service;

import com.example.OrderShipment.Controller.OrderDetails;
import com.example.OrderShipment.Model.Orders;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


import java.util.Calendar;
import java.util.Date;

public class Shipment {

    Orders order = new Orders();
    public Orders processShipment(OrderDetails orderDetails) {
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentDateTime = dateFormat.format(currentDate);
        Calendar c = Calendar.getInstance();
        c.setTime(currentDate);
        c.add(Calendar.DATE, 2);
        Date delivery_date = c.getTime();
        order.setOrder_name(orderDetails.getOrder_name());
        order.setOrder_category(orderDetails.getOrder_category());
        order.setShipping_date(currentDateTime);
        order.setOrder_date(currentDate);
        order.setShip_date(currentDate);
        order.setDelivery_date(delivery_date);
        order.setUser_name(orderDetails.getUser_name());
        order.setUser_id(orderDetails.getUser_id());
        order.setVendor_name(orderDetails.getVendor_name());
        order.setVendor_id(orderDetails.getVendor_id());
        return order;

    }
}
