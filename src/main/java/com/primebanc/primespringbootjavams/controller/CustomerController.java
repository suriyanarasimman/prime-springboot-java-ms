package com.primebanc.primespringbootjavams.controller;

import com.primebanc.primespringbootjavams.entities.Customer;
import com.primebanc.primespringbootjavams.model.AuthenticatedUser;
import com.primebanc.primespringbootjavams.model.AuthenticationRequest;
import com.primebanc.primespringbootjavams.model.CommonResponse;
import com.primebanc.primespringbootjavams.service.CustomerService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping(value = "/api/v1")
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public CommonResponse registerCustomer(@RequestBody Customer customer){
        return customerService.registerCustomer(customer);
    }

    @RequestMapping(value = "/authenticate",method = RequestMethod.POST)
    public AuthenticatedUser authenticateUser(@RequestBody AuthenticationRequest authenticationRequest){
        return customerService.authenticateUser(authenticationRequest);
    }
}
