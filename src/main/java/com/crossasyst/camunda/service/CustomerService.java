package com.crossasyst.camunda.service;

import com.crossasyst.camunda.entity.CustomerEntity;
import com.crossasyst.camunda.mapper.CustomerMapper;
import com.crossasyst.camunda.model.Customer;
import com.crossasyst.camunda.repository.CustomerRepository;
import com.crossasyst.camunda.response.CustomerResponse;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Log4j2
@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private CustomerMapper customerMapper;
    public CustomerResponse createCustomer(Customer customer) {
        CustomerResponse customerResponse=new CustomerResponse();
        CustomerEntity customerEntity=customerMapper.modelToEntity(customer);
        customerRepository.save(customerEntity);
        customerResponse.setCustomerId(customerEntity.getCustomerId());
        log.info("The customer has been added successfully");
        return customerResponse;
    }
}