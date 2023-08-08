package com.crossasyst.camunda.mapper;

/*import com.crossasyst.camunda.camundaorderfulfillment.entity.CustomerEntity;
import com.crossasyst.camunda.camundaorderfulfillment.model.Customer;*/
import com.crossasyst.camunda.entity.CustomerEntity;
import com.crossasyst.camunda.model.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    CustomerEntity modelToEntity(Customer customer);

    Customer entityToModel(CustomerEntity customerEntity);
}
