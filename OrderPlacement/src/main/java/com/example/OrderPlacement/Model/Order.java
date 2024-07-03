package com.example.OrderPlacement.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name="orders")
public class Order {

    @Id
    private Long id;
    private String order_name;
    private String order_id;
    private String user_name;
    private String user_id;
    private String vendor_id;
    private String vendor_name;
    private Date order_date;

}
