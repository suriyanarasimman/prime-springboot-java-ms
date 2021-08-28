package com.primebanc.primespringbootjavams.controller;

import com.primebanc.primespringbootjavams.entities.IpoInformation;
import com.primebanc.primespringbootjavams.model.CommonResponse;
import com.primebanc.primespringbootjavams.service.IpoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/api/v1/ipo")
public class IpoController {

    private IpoService ipoService;

    public IpoController(IpoService ipoService) {
        this.ipoService = ipoService;
    }

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public CommonResponse registerIpo(@RequestBody IpoInformation ipoInfo){
        return ipoService.addIpoDetails(ipoInfo);
    }

    @RequestMapping(value = "/{userName}",method = RequestMethod.GET)
    public List<IpoInformation> fetchIposByUserName(@PathVariable String userName){
        return ipoService.fetchIpoInitiatedByUser(userName);
    }

    @RequestMapping(value = "/open",method = RequestMethod.GET)
    public List<IpoInformation> fetchOpenIpoDetails(){
        return ipoService.fetchAllOpenIpos();
    }
}
