package com.crossasyst.camunda.controller;

/*import com.crossasyst.camunda.camundaorderfulfillment.model.Order;
import com.crossasyst.camunda.camundaorderfulfillment.response.OrderResponse;
import com.crossasyst.camunda.camundaorderfulfillment.service.OrderService;*/
import com.crossasyst.camunda.model.Order;
import com.crossasyst.camunda.response.OrderResponse;
import com.crossasyst.camunda.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;
    @PostMapping(value = "/orders",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<OrderResponse> createOrder(@RequestBody Order order) {
        OrderResponse createdOrder = orderService.createOrder(order);
        return new ResponseEntity<>(createdOrder, HttpStatus.OK);
    }
}