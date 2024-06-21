package com.example.OrderShipment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class OrderShipmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderShipmentApplication.class, args);
	}

}
