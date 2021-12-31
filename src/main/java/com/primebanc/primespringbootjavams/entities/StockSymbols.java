package com.primebanc.primespringbootjavams.entities;

import javax.persistence.*;

@Entity
@Table( name = "SymbolToName")
public class StockSymbols {
    @Id
    @GeneratedValue()
    private Long id;

    @Column(name ="Symbol")
    private String symbol;

    @Column(name = "FullForm")
    private String fullform;

    public StockSymbols() {
    }

    public StockSymbols(Long id, String symbol, String fullform) {
        this.id = id;
        this.symbol = symbol;
        this.fullform = fullform;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getFullform() {
        return fullform;
    }

    public void setFullform(String fullform) {
        this.fullform = fullform;
    }
}
