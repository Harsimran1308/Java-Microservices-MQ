package com.example.OrderShipment.Controller;

import com.example.OrderShipment.Model.Orders;
import com.example.OrderShipment.Repository.OrdersRepository;
import com.example.OrderShipment.Service.Shipment;
import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orderShipment")
public class OrderShipment {

    private Orders order = new Orders();
    private Shipment shipment = new Shipment();

    @Autowired
    private OrdersRepository ordersRepository;

    @PostMapping("/generateShippingLabel")
    public ResponseEntity<String> generateShippingLabel(@RequestBody OrderDetails orderDetails) {
        order = shipment.processShipment(orderDetails);
        System.out.println(order);
        try {
            ordersRepository.save(order);
            return new ResponseEntity<>("Shipment Added", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("Shipment Unsuccessful", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
