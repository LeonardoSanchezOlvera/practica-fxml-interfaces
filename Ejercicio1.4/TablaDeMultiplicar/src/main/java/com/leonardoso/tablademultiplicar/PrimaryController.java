package com.leonardoso.tablademultiplicar;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;

public class PrimaryController {

    @FXML private TextField txtNumero;
    @FXML private TextArea txtAreaTabla;

    @FXML
    private void calcularTabla() {
        int numero = Integer.parseInt(txtNumero.getText());
        Tabla tablaObj = new Tabla(numero);

        txtAreaTabla.setText(tablaObj.generarTabla());
    }

    @FXML
    private void limpiarPantalla() {
        txtNumero.setText("");
        txtAreaTabla.setText("");
    }
}