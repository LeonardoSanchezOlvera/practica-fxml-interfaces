package com.leonardoso.desglosededinero;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;

public class PrimaryController {

    @FXML private TextField txtDinero;
    @FXML private TextArea txtAreaResultado;

    @FXML
    private void desglosarDinero() {
        int cantidadDinero = Integer.parseInt(txtDinero.getText());

        Desglose desglose = new Desglose(cantidadDinero);
        
        int b500 = desglose.getB500();
        int b200 = desglose.getB200();
        int b100 = desglose.getB100();
        int b50  = desglose.getB50();
        int b20  = desglose.getB20();
        int m10  = desglose.getM10();
        int m5   = desglose.getM5();
        int m2   = desglose.getM2();
        int m1   = desglose.getM1();
        String resultado =  b500 + "\n" + b200 + "\n" + b100 + "\n" + b50  + "\n" + b20  + "\n" + m10  + "\n" + m5   + "\n" + m2   + "\n"+ m1;

        txtAreaResultado.setText(resultado);
    }

    @FXML
    private void limpiarPantalla() {
        txtDinero.setText("");
        txtAreaResultado.setText("");
    }
}