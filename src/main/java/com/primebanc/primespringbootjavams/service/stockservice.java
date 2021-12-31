package com.primebanc.primespringbootjavams.service;


import com.primebanc.primespringbootjavams.model.FullObj;
import com.primebanc.primespringbootjavams.model.Stocks;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class stockservice {


    private Stocks s = new Stocks();

    public stockservice() {
    }

    public Stocks getStocks(FullObj ob){
         ob.getDatatable()
                .getData()
                .forEach((st) -> {
                        setStocks(st);
                });
         System.out.println(s);
        return s;
    }

    public Stocks setStocks(List<String> ob){
        s.setName(ob.get(0));
        s.setDate(ob.get(1));
        s.setOpen(Double.parseDouble(ob.get(2)));
        s.setHigh(Double.parseDouble(ob.get(3)));
        s.setLow(Double.parseDouble(ob.get(4)));
        s.setClose(Double.parseDouble(ob.get(5)));
        s.setVolume(Double.parseDouble(ob.get(6)));
        s.setEx_dividend(Double.parseDouble(ob.get(7)));
        s.setSplit_ratio(Double.parseDouble(ob.get(8)));
        s.setAdj_open(Double.parseDouble(ob.get(9)));
        s.setAdj_high(Double.parseDouble(ob.get(10)));
        s.setAdj_low(Double.parseDouble(ob.get(11)));
        s.setAdj_close(Double.parseDouble(ob.get(12)));
        s.setAdj_volume(Double.parseDouble(ob.get(13)));
        return s;
    }

}
