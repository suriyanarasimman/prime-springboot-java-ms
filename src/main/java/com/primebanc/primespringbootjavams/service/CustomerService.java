package com.primebanc.primespringbootjavams.service;

import com.primebanc.primespringbootjavams.entities.Customer;
import com.primebanc.primespringbootjavams.model.AuthenticatedUser;
import com.primebanc.primespringbootjavams.model.AuthenticationRequest;
import com.primebanc.primespringbootjavams.model.CommonResponse;
import com.primebanc.primespringbootjavams.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class CustomerService {
    private final CustomerRepository customerRepo;

    public CustomerService(CustomerRepository customerRepo) {
        this.customerRepo = customerRepo;
    }

    public CommonResponse registerCustomer(Customer customer){
        CommonResponse regRes = new CommonResponse();
        Customer existingCustomer = customerRepo.findCustomerByUserNameOrEmail(customer.getUserName(),customer.getEmail());
        if(null != existingCustomer){
            regRes.setStatus("UserExists");
            regRes.setMessage("Username or Email is already taken try with other details");
            return regRes;
        }
        customer.setRegisteredDate(LocalDate.now());
        Customer addedCustomer = customerRepo.save(customer);

        if(null != addedCustomer.getUserName()){
            regRes.setStatus("ADDED");
            regRes.setMessage("Customer added successfully");
        }
        return regRes;
    }

    public boolean checkMail(String mail){
        return customerRepo.existsCustomerByEmail(mail);
    }

    public AuthenticatedUser authenticateUser(AuthenticationRequest req){
        Customer loggedInCustomer = customerRepo.findCustomerByUserNameAndPassword(req.getUserName(), req.getPassword());
        AuthenticatedUser loginUser = new AuthenticatedUser();
        if(null != loggedInCustomer){
            loginUser.setUserName(loggedInCustomer.getUserName());
            loginUser.setUserType(loggedInCustomer.getUserType());
            loginUser.setUserFrom(loggedInCustomer.getRegisteredDate());
            loginUser.setLastLoginDate(loggedInCustomer.getLastLogInDate());
            loginUser.setAuthenticated(true);
            loggedInCustomer.setLastLogInDate(LocalDate.now());
            customerRepo.save(loggedInCustomer);
            return loginUser;
        } else {
            return new AuthenticatedUser(null,null,false,null, null);
        }
    }
}
