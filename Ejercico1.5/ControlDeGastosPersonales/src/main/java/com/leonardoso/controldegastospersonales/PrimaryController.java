package com.leonardoso.controldegastospersonales;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML private TextField txtAlimentacion;
    @FXML private TextField txtRefrigerios;
    @FXML private TextField txtTransporte;
    @FXML private TextField txtTelefonia;
    @FXML private TextField txtOtros;
    @FXML private TextField txtTotalSemanal;
    @FXML private TextField txtGastoMasAlto;

    @FXML
    private void calcularEstadisticas() {
        int alimentacion = Integer.parseInt(txtAlimentacion.getText());
        int refrigerios = Integer.parseInt(txtRefrigerios.getText());
        int transporte = Integer.parseInt(txtTransporte.getText());
        int telefonia = Integer.parseInt(txtTelefonia.getText());
        int otros = Integer.parseInt(txtOtros.getText());
        ControlGastos control = new ControlGastos(alimentacion, refrigerios, transporte, telefonia, otros);

        txtTotalSemanal.setText(String.valueOf(control.getTotalSemanal()));
        txtGastoMasAlto.setText(control.getGastoMasAlto());
    }

    @FXML
    private void limpiarPantalla() {
        txtAlimentacion.setText("");
        txtRefrigerios.setText("");
        txtTransporte.setText("");
        txtTelefonia.setText("");
        txtOtros.setText("");
        txtTotalSemanal.setText("");
        txtGastoMasAlto.setText("");
    }
}