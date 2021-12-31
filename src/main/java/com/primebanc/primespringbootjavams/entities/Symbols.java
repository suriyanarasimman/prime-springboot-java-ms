package com.primebanc.primespringbootjavams.entities;

import javax.persistence.*;

@Entity
@Table(name = "Symbols")
public class Symbols {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(name = "Symbo")
    private String symbo;
    @Column(name="FullName")
    private String fullnames;

    public Symbols() {
    }

    public Symbols(Long id, String symbo, String fullnames) {
        Id = id;
        this.symbo = symbo;
        this.fullnames = fullnames;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getSymbo() {
        return symbo;
    }

    public void setSymbo(String symbo) {
        this.symbo = symbo;
    }

    public String getFullnames() {
        return fullnames;
    }

    public void setFullnames(String fullnames) {
        this.fullnames = fullnames;
    }
}
