package com.example.OrderPlacement.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/processOrder")
public class ProcessOrder {

    @PostMapping("/placeOrder")
    public ResponseEntity<String> placeOrder() {
        return new ResponseEntity<>("Order Placed", HttpStatus.OK);
    }

}
