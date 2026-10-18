module com.leonardoso.desglosededinero {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.leonardoso.desglosededinero to javafx.fxml;
    exports com.leonardoso.desglosededinero;
}
