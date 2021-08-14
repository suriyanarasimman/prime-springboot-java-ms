package com.primebanc.primespringbootjavams.repository;

import com.primebanc.primespringbootjavams.entities.IpoInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IpoRepository extends JpaRepository<IpoInformation, Long> {
    List<IpoInformation> findIpoInformationByUserName(String userName);
}
