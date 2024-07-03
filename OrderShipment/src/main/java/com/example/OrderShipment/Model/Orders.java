package com.example.OrderShipment.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@Entity
@Data
@Table(name = "orders")
public class Orders {

    @Id
    @GeneratedValue
    private Long id;
    private String order_name;
    private String order_category;
    private String shipping_date;
    private Date order_date;
    private Date ship_date;
    private Date delivery_date;
    private String user_name;
    private String user_id;
    private String vendor_name;
    private String vendor_id;

}
