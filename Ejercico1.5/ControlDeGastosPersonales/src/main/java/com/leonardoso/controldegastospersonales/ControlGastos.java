package com.leonardoso.controldegastospersonales;

public class ControlGastos {
    private int alimentacion;
    private int refrigerios;
    private int transporte;
    private int telefonia;
    private int otros;

    public ControlGastos(int alimentacion, int refrigerios, int transporte, int telefonia, int otros) {
        this.alimentacion = alimentacion;
        this.refrigerios = refrigerios;
        this.transporte = transporte;
        this.telefonia = telefonia;
        this.otros = otros;
    }

    public int getTotalSemanal() {
        return alimentacion + refrigerios + transporte + telefonia + otros;
    }

    public String getGastoMasAlto() {
        if (alimentacion >= refrigerios && alimentacion >= transporte && alimentacion >= telefonia && alimentacion >= otros) {
            return "Alimentación";
        } else if (refrigerios >= transporte && refrigerios >= telefonia && refrigerios >= otros) {
            return "Refrigerios";
        } else if (transporte >= telefonia && transporte >= otros) {
            return "Transporte";
        } else if (telefonia >= otros) {
            return "Telefonía";
        } else {
            return "Otros";
        }
    }
}