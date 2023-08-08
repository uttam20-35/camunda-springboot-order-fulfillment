package com.crossasyst.camunda.controller;

import com.crossasyst.camunda.model.Customer;
import com.crossasyst.camunda.response.CustomerResponse;
import com.crossasyst.camunda.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @PostMapping(value = "/customers",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CustomerResponse> createCustomer(@RequestBody Customer customer){
        CustomerResponse createdCustomer=customerService.createCustomer(customer);
        return new ResponseEntity<>(createdCustomer, HttpStatus.OK);
    }
}
