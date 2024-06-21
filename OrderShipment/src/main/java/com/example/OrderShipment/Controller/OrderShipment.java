package com.example.OrderShipment.Controller;

import com.example.OrderShipment.Model.Orders;
import com.example.OrderShipment.Service.Shipment;
import org.hibernate.query.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orderShipment")
public class OrderShipment {

    @Autowired
    Orders order;
    @Autowired
    Shipment shipment;

    @GetMapping("/generateShippingLabel")
    public String generateShippingLabel(OrderDetails orderDetails) {
        order = shipment.processShipment(orderDetails);
        return "Generating Label";
    }
}
