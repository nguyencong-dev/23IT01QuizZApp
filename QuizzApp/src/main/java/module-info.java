module com.nvc.quizzapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.nvc.quizzapp to javafx.fxml;
    exports com.nvc.quizzapp;
}
