package com.crossasyst.camunda.service;

/*import com.crossasyst.camunda.camundaorderfulfillment.entity.OrderEntity;
import com.crossasyst.camunda.camundaorderfulfillment.mapper.OrderMapper;
import com.crossasyst.camunda.camundaorderfulfillment.model.Order;
import com.crossasyst.camunda.camundaorderfulfillment.repository.OrderRepository;
import com.crossasyst.camunda.camundaorderfulfillment.response.OrderResponse;*/

import com.crossasyst.camunda.entity.OrderEntity;
import com.crossasyst.camunda.mapper.OrderMapper;
import com.crossasyst.camunda.model.Order;
import com.crossasyst.camunda.repository.OrderRepository;
import com.crossasyst.camunda.response.OrderResponse;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Log4j2
@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private OrderMapper orderMapper;
    public OrderResponse createOrder(Order order) {
        OrderResponse orderResponse = new OrderResponse();
        OrderEntity orderEntity = orderMapper.modelToEntity(order);
        orderRepository.save(orderEntity);
        log.info("Order has been placed successfully");
        orderResponse.setOrderId(orderEntity.getOrderId());
        return orderResponse;
    }
}