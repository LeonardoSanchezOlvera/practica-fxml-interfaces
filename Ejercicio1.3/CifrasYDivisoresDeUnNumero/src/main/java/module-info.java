module com.leonardoso.cifrasydivisoresdeunnumero {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.leonardoso.cifrasydivisoresdeunnumero to javafx.fxml;
    exports com.leonardoso.cifrasydivisoresdeunnumero;
}
