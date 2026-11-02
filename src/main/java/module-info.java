module com.mycompany.bmicalculator {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.bmicalculator to javafx.fxml;
    exports com.mycompany.bmicalculator;
}
