package com.demo.model;

public class Units {

    private double value;
    private String unit;

    public Units(double value, String unit){
        this.value = value;
        this.unit = unit;
    }

    public void setValue(double value){
        this.value = value;
    }

    public void setUnit(String unit){
        this.unit = unit;
    }

    public double getValue(){
        return this.value;
    }

    public String getUnit(){
        return  this.unit;
    }
}
