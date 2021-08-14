package com.primebanc.primespringbootjavams.controller;

import com.primebanc.primespringbootjavams.entities.MutualFund;
import com.primebanc.primespringbootjavams.model.CommonResponse;
import com.primebanc.primespringbootjavams.service.MutualFundService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/api/v1/mutual-fund")
public class MutualFundController {
    private MutualFundService mutualFundService;

    public MutualFundController(MutualFundService mutualFundService) {
        this.mutualFundService = mutualFundService;
    }

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public CommonResponse registerMutualFund(@RequestBody MutualFund mutualFund){
        return mutualFundService.registerMutualFund(mutualFund);
    }

    @RequestMapping(value = "/{userName}",method = RequestMethod.GET)
    public List<MutualFund> fetchUserMutualFunds(@PathVariable String userName){
        return mutualFundService.fetchMutualFundsOwnedByUser(userName);
    }
}
