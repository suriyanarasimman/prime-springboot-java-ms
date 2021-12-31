package com.primebanc.primespringbootjavams.model;

import java.util.List;

public class Datatable {
    private List<List<String>> data;

    public Datatable() {
    }

    public Datatable(List<List<String>> data) {
        this.data = data;
    }

    public List<List<String>> getData() {
        return data;
    }

    public void setData(List<List<String>> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Datatable{" +
                "data=" + data +
                '}';
    }
}
