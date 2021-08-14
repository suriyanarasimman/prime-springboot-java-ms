package com.primebanc.primespringbootjavams.repository;

import com.primebanc.primespringbootjavams.entities.MutualFund;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MutualFundRepository extends JpaRepository<MutualFund, Long> {
    List<MutualFund> findMutualFundByUserName(String userName);
}
