module com.leonardoso.edaddeunapersona {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.leonardoso.edaddeunapersona to javafx.fxml;
    exports com.leonardoso.edaddeunapersona;
}
