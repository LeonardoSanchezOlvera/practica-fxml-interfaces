package com.leonardoso.edaddeunapersona;

import java.time.LocalDate;

public class CalcularEdad {
    private int dia;
    private int mes;
    private int anio;

    public CalcularEdad(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    
    
    public int calcularAnio(){
        
        // Obtener Fecha Actual con la clase LocalDate();
        LocalDate fechaActual = LocalDate.now();
        int anioActual = fechaActual.getYear();
        int mesActual = fechaActual.getMonthValue();
        int diaActual = fechaActual.getDayOfMonth();
        
        // Calcular edad en años.
        int anioNacimiento = anioActual - anio;
        if (mesActual < mes || mesActual == mes && diaActual < dia){
          anioNacimiento = anioNacimiento - 1;
        
        }
       
        return anioNacimiento;
    }
    
    public int calcularMeses(){
        LocalDate fechaActual = LocalDate.now();
        int anioActual = fechaActual.getYear();
        int mesActual = fechaActual.getMonthValue();
        int diaActual = fechaActual.getDayOfMonth();
        
        // Calcular Meses de nacido.
        int mesesNacido = mesActual - mes;
        if (mesActual < mes || (mesActual == mes && diaActual < dia)) {
        mesesNacido = mesesNacido + 12;
        }
        if (diaActual < dia) {
        mesesNacido = mesesNacido - 1;
        }
    
        return mesesNacido;
        
    
    }

}
