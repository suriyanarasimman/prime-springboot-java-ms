package com.primebanc.primespringbootjavams.repository;


import com.primebanc.primespringbootjavams.entities.Symbols;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SymbolsRepo extends JpaRepository<Symbols,Long > {
}
