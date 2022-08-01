package com.kodilla.currencies.calculate;

public class Calculator {

    private static final double euro = 4.74;
    private static final double dolar = 4.64;

    public double eurToPln(double amount){
        return amount * euro;
    }

    public double dolToPln(double amount){
        return amount * dolar;
    }

    public double plnToEur(double amount){
        return amount/euro;
    }

    public double plnToDol(double amount){
        return amount/dolar;
    }
}
