package com.crossasyst.camunda.mapper;

import com.crossasyst.camunda.entity.CustomerEntity;
import com.crossasyst.camunda.model.Customer;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-08T12:46:02+0530",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.17 (Oracle Corporation)"
)
@Component
public class CustomerMapperImpl implements CustomerMapper {

    @Override
    public CustomerEntity modelToEntity(Customer customer) {
        if ( customer == null ) {
            return null;
        }

        CustomerEntity customerEntity = new CustomerEntity();

        customerEntity.setCustomerName( customer.getCustomerName() );
        customerEntity.setPhoneNumber( customer.getPhoneNumber() );

        return customerEntity;
    }

    @Override
    public Customer entityToModel(CustomerEntity customerEntity) {
        if ( customerEntity == null ) {
            return null;
        }

        Customer customer = new Customer();

        customer.setCustomerName( customerEntity.getCustomerName() );
        customer.setPhoneNumber( customerEntity.getPhoneNumber() );

        return customer;
    }
}
