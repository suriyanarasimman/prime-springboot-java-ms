package com.primebanc.primespringbootjavams.repository;

import com.primebanc.primespringbootjavams.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer findCustomerByUserNameOrEmail(String userName, String email);
    Customer findCustomerByUserNameAndPassword(String userName, String password);
    Boolean existsCustomerByEmail(String email);
}
