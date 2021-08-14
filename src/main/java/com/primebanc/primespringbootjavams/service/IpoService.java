package com.primebanc.primespringbootjavams.service;

import com.primebanc.primespringbootjavams.entities.IpoInformation;
import com.primebanc.primespringbootjavams.model.CommonResponse;
import com.primebanc.primespringbootjavams.repository.IpoRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Service
public class IpoService {
    private IpoRepository ipoRepo;

    public IpoService(IpoRepository ipoRepo) {
        this.ipoRepo = ipoRepo;
    }

    public CommonResponse addIpoDetails(IpoInformation ipoInfo){
        ipoInfo.setDescription(ipoInfo.getCompanyName() + " is a market leader in its corresponding industry, with high industry standards."
        + "with a total market cap of " + Math.round(ipoInfo.getMarketCap()) + ". We are currently seeking an investment for expanding our industry presence in" +
                "different geographies.");
        ipoInfo.setIssueSize((Math.round(Math.random()* 10000)) + 100);
        ipoInfo.setIssuePrice(((ipoInfo.getMarketCap() * ipoInfo.getSalePercentage())/100)/ipoInfo.getIssueSize());
        ipoInfo.setLotSize(10);
        ipoInfo.setIssueDate(LocalDate.now());
        ipoInfo.setClosingDate(LocalDate.now().plusDays(5));
        ipoRepo.save(ipoInfo);
        return new CommonResponse("ADDED","IPO initiation Successful");
    }

    public List<IpoInformation> fetchIpoInitiatedByUser(String userName){
        return ipoRepo.findIpoInformationByUserName(userName);
    }
}
