package com.crossasyst.camunda.mapper;

/*import com.crossasyst.camunda.camundaorderfulfillment.entity.OrderEntity;
import com.crossasyst.camunda.camundaorderfulfillment.model.Order;*/
import com.crossasyst.camunda.entity.OrderEntity;
import com.crossasyst.camunda.model.Order;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderMapper {
    OrderEntity modelToEntity(Order order);
    Order entityToModel(OrderEntity orderEntity);
}