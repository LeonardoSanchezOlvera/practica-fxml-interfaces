module com.leonardoso.controldegastospersonales {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.leonardoso.controldegastospersonales to javafx.fxml;
    exports com.leonardoso.controldegastospersonales;
}
