package com.primebanc.primespringbootjavams.repository;

import com.primebanc.primespringbootjavams.entities.ProductInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<ProductInformation, Long> {
    List<ProductInformation> findProductInformationByUserName(String userName);
    ProductInformation findProductInformationByUserNameAndProductID(String userName, String productId);
}
