package com.leonardoso.cifrasydivisoresdeunnumero;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;

public class PrimaryController {

    @FXML private TextField txtNumero;
    @FXML private TextField txtCantidadCifras;
    @FXML private TextField txtSumaImpares;
    @FXML private TextField txtSumaPares;
    @FXML private TextField txtSumaTotal;
    @FXML private TextField txtCifraMayor;
    @FXML private TextField txtCifraMenor;
    @FXML private TextArea txtAreaDivisores;

    @FXML
    private void analizarNumero() {
        int num = Integer.parseInt(txtNumero.getText());
        CifrasDivisores analizador = new CifrasDivisores(num);

        txtCantidadCifras.setText(String.valueOf(analizador.getCantidadCifras()));
        txtSumaImpares.setText(String.valueOf(analizador.getSumaImpares()));
        txtSumaPares.setText(String.valueOf(analizador.getSumaPares()));
        txtSumaTotal.setText(String.valueOf(analizador.getSumaTotal()));
        txtCifraMayor.setText(String.valueOf(analizador.getCifraMayor()));
        txtCifraMenor.setText(String.valueOf(analizador.getCifraMenor()));
        txtAreaDivisores.setText(analizador.getDivisores());
    }

    @FXML
    private void limpiarPantalla() {
        txtNumero.setText("");
        txtCantidadCifras.setText("");
        txtSumaImpares.setText("");
        txtSumaPares.setText("");
        txtSumaTotal.setText("");
        txtCifraMayor.setText("");
        txtCifraMenor.setText("");
        txtAreaDivisores.setText("");
    }
}