package com.primebanc.primespringbootjavams.controller;


import com.primebanc.primespringbootjavams.entities.Symbols;
import com.primebanc.primespringbootjavams.model.FullObj;
import com.primebanc.primespringbootjavams.model.Stocks;
import com.primebanc.primespringbootjavams.service.SymbolService;
import com.primebanc.primespringbootjavams.service.stockservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/sh/")
public class StockControler {

    private String base = "https://data.nasdaq.com/api/v3/datatables/WIKI/PRICES?" ;
    private String api123 = "&api_key=HVzBpk-hcybrydMKFxMS" ;
    private static int test = 0;

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

    @GetMapping("{param}")
    public List<Symbols> getSymbol(@PathVariable("param") String param){
        return s.getFullName(param);
    }
    
    @GetMapping("create")
    public ResponseEntity<String> getUpdate(){
        if(test == 0) {
            test = 1;
            s.setSymbols();
            return ResponseEntity.status(HttpStatus.CREATED).build();
        }

        return ResponseEntity.status(HttpStatus.CONFLICT).build();
    }

}
