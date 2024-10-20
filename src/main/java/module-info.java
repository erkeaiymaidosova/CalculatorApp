module com.example.calculatorapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.calculatorapp to javafx.fxml;
    exports com.example.calculatorapp;
}