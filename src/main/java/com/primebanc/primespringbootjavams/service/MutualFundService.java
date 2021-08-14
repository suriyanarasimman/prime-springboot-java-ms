package com.primebanc.primespringbootjavams.service;

import com.primebanc.primespringbootjavams.entities.MutualFund;
import com.primebanc.primespringbootjavams.model.CommonResponse;
import com.primebanc.primespringbootjavams.repository.MutualFundRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class MutualFundService {
    private MutualFundRepository mutualFundRepository;

    public MutualFundService(MutualFundRepository mutualFundRepository) {
        this.mutualFundRepository = mutualFundRepository;
    }

    public CommonResponse registerMutualFund(MutualFund mutualFund){
        mutualFund.setRegistrationDate(LocalDate.now());
        mutualFundRepository.save(mutualFund);
        return new CommonResponse("ADDED","Mutual Fund registration successful.");
    }

    public List<MutualFund> fetchMutualFundsOwnedByUser(String userName){
        return mutualFundRepository.findMutualFundByUserName(userName);
    }
}
