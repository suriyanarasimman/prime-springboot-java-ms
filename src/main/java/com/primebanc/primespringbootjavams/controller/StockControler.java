package com.primebanc.primespringbootjavams.controller;


import com.primebanc.primespringbootjavams.model.FullObj;
import com.primebanc.primespringbootjavams.model.Stocks;
import com.primebanc.primespringbootjavams.service.SymbolService;
import com.primebanc.primespringbootjavams.service.stockservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/v1/sh/")
public class StockControler {

    private String base = "https://data.nasdaq.com/api/v3/datatables/WIKI/PRICES?" ;
    private String api123 = "&api_key=HVzBpk-hcybrydMKFxMS" ;

    @Autowired
    private RestTemplate rt;

    @Autowired
    private stockservice ss;

    @Autowired
    private SymbolService s;

    @GetMapping("{param1}/{param2}")
    public Stocks getTest(@PathVariable("param1") String param1, @PathVariable("param2") String param2){
        FullObj ob = rt.getForObject(base + "ticker=" + param1 + "&date=" + param2 + api123, FullObj.class );
        Stocks s = ss.getStocks(ob);
        return s;
    }
    
    @GetMapping("update")
    public void getUpdate(){
        s.setSymbols();
    }

}
