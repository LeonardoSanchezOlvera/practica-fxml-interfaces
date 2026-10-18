package com.leonardoso.desglosededinero;

public class Desglose {
    private int dinero;

    public Desglose(int dinero) {
        this.dinero = dinero;
    }

    public int getB500() {
        int cantidad = dinero / 500;
        dinero = dinero % 500;
        return cantidad;
    }

    public int getB200() {
        int cantidad = dinero / 200;
        dinero = dinero % 200;
        return cantidad;
    }

    public int getB100() {
        int cantidad = dinero / 100;
        dinero = dinero % 100;
        return cantidad;
    }

    public int getB50() {
        int cantidad = dinero / 50;
        dinero = dinero % 50;
        return cantidad;
    }

    public int getB20() {
        int cantidad = dinero / 20;
        dinero = dinero % 20;
        return cantidad;
    }

    public int getM10() {
        int cantidad = dinero / 10;
        dinero = dinero % 10;
        return cantidad;
    }

    public int getM5() {
        int cantidad = dinero / 5;
        dinero = dinero % 5;
        return cantidad;
    }

    public int getM2() {
        int cantidad = dinero / 2;
        dinero = dinero % 2;
        return cantidad;
    }

    public int getM1() {
        int cantidad = dinero / 1;
        dinero = dinero % 1;
        return cantidad;
    }
}