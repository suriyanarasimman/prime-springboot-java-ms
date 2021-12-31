package com.primebanc.primespringbootjavams.service;


import com.primebanc.primespringbootjavams.entities.Symbols;
import com.primebanc.primespringbootjavams.repository.SymbolsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

@Service
public class SymbolService {

    @Autowired
    private SymbolsRepo sr;

    public void setSymbols(){
        try{
            BufferedReader br = new BufferedReader(new FileReader("src/main/resources/static/nyse-listed.csv"));
            String line;
            while((line = br.readLine())!= null){
                String [] data = line.split(",");
                Symbols s = new Symbols();
                s.setSymbo(data[0]);
                s.setFullnames(data[1]);
                sr.save(s);
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
