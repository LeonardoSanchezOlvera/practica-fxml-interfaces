package com.leonardoso.edaddeunapersona;

import java.util.Scanner;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

public class PrimaryController {

   
    @FXML private TextField txtFechaNacimiento;
    @FXML private Label lblResultado;

    @FXML
    private void calcularEdad() {
        
        Scanner scanner = new Scanner(txtFechaNacimiento.getText());
        int diaNac = scanner.nextInt();
        int mesNac = scanner.nextInt();
        int anioNac = scanner.nextInt();
  
        CalcularEdad e = new CalcularEdad(diaNac, mesNac, anioNac);

        int totalAnios = e.calcularAnio();
        int totalMeses = e.calcularMeses();
 
        lblResultado.setText("Tiene " + totalAnios + " años con " + totalMeses + " meses");
    }

    @FXML
    private void limpiarPantalla() {
        lblResultado.setText("");
    }
}