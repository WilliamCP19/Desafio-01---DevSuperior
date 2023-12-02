package com.williamcp.desafio01.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.williamcp.desafio01.Entities.Order;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;
    
    public Double total (Order order) {
        double calcDesconto = 1 - (order.getDiscount() / 100.00);
        return order.getBasic() * calcDesconto + shippingService.shipment(order);
    }
}
