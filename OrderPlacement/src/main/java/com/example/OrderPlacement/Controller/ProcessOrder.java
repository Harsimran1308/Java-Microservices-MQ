package com.example.OrderPlacement.Controller;

import com.example.OrderPlacement.Model.Order;
import com.example.OrderPlacement.Repository.OrderRepository;
import com.example.OrderPlacement.Service.OrderShipping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/processOrder")
@EnableJms
public class ProcessOrder {

    private OrderShipping orderShipping = new OrderShipping();
    private Order order = new Order();

    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private JmsTemplate jmsTemplate;

    @PostMapping("/placeOrder")
    public ResponseEntity<String> placeOrder(@RequestBody OrderDetails orderDetail) {
        order = orderShipping.saveOrder(orderDetail);
        System.out.println(order);
        try {
            orderRepository.save(order);
            jmsTemplate.convertAndSend("DEV.QUEUE.1","Order Successfull");
            return new ResponseEntity<>("Order Placed", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("Order Unsuccessful", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
