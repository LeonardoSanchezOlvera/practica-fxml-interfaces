module com.leonardoso.tablademultiplicar {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.leonardoso.tablademultiplicar to javafx.fxml;
    exports com.leonardoso.tablademultiplicar;
}
