module it.progettoforPackage {
    requires javafx.controls;
    requires javafx.fxml;

    opens it.progettoforPackage to javafx.fxml;
    exports it.progettoforPackage;
}