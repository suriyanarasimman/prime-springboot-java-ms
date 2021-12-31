package com.primebanc.primespringbootjavams.repository;


import com.primebanc.primespringbootjavams.entities.StockSymbols;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockSymbolsRepo extends JpaRepository<StockSymbols, Long> {

}
