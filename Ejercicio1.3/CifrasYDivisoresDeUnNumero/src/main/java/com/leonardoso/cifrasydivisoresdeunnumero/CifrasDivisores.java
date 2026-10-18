package com.leonardoso.cifrasydivisoresdeunnumero;

public class CifrasDivisores {
    private int numero;

    public CifrasDivisores(int numero) {
        this.numero = Math.abs(numero); 
    }

    public int getCantidadCifras() {
        if (numero == 0) return 1;
        int temp = numero;
        int contador = 0;
        while (temp > 0) {
            contador++;
            temp /= 10;
        }
        return contador;
    }

    public int getSumaTotal() {
        int temp = numero;
        int suma = 0;
        while (temp > 0) {
            suma += temp % 10;
            temp /= 10;
        }
        return suma;
    }

    public int getSumaImpares() {
        int temp = numero;
        int suma = 0;
        while (temp > 0) {
            int digito = temp % 10;
            if (digito % 2 != 0) {
                suma += digito;
            }
            temp /= 10;
        }
        return suma;
    }

    public int getSumaPares() {
        int temp = numero;
        int suma = 0;
        while (temp > 0) {
            int digito = temp % 10;
            if (digito % 2 == 0) {
                suma += digito;
            }
            temp /= 10;
        }
        return suma;
    }

    public int getCifraMayor() {
        if (numero == 0) return 0;
        int temp = numero;
        int mayor = 0;
        while (temp > 0) {
            int digito = temp % 10;
            if (digito > mayor) {
                mayor = digito;
            }
            temp /= 10;
        }
        return mayor;
    }

    public int getCifraMenor() {
        if (numero == 0) return 0;
        int temp = numero;
        int menor = 9;
        while (temp > 0) {
            int digito = temp % 10;
            if (digito < menor) {
                menor = digito;
            }
            temp /= 10;
        }
        return menor;
    }

    public String getDivisores() {
        StringBuilder sb = new StringBuilder();
        int n = (numero == 0) ? 1 : numero;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sb.append(i).append("\n");
            }
        }
        return sb.toString().trim();
    }
}