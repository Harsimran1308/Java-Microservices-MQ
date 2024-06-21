package com.example.OrderShipment.Service;

import com.example.OrderShipment.Controller.OrderDetails;
import com.example.OrderShipment.Model.Orders;
import org.springframework.beans.factory.annotation.Autowired;

public class Shipment {

    @Autowired
    Orders order;
    public Orders processShipment(OrderDetails orderDetails) {
        order.setOrder_name(orderDetails.getOrder_name());
        return order;

    }
}
