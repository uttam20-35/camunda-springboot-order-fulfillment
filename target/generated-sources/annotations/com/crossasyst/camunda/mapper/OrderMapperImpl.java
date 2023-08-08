package com.crossasyst.camunda.mapper;

import com.crossasyst.camunda.entity.OrderEntity;
import com.crossasyst.camunda.model.Order;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-08T12:46:02+0530",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.17 (Oracle Corporation)"
)
@Component
public class OrderMapperImpl implements OrderMapper {

    @Override
    public OrderEntity modelToEntity(Order order) {
        if ( order == null ) {
            return null;
        }

        OrderEntity orderEntity = new OrderEntity();

        orderEntity.setOrderDate( order.getOrderDate() );

        return orderEntity;
    }

    @Override
    public Order entityToModel(OrderEntity orderEntity) {
        if ( orderEntity == null ) {
            return null;
        }

        Order order = new Order();

        order.setOrderDate( orderEntity.getOrderDate() );

        return order;
    }
}
