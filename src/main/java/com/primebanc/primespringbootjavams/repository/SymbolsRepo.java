package com.primebanc.primespringbootjavams.repository;


import com.primebanc.primespringbootjavams.entities.Symbols;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SymbolsRepo extends JpaRepository<Symbols,Long > {
    public List<Symbols> findByFullnamesContains(String s);
}
