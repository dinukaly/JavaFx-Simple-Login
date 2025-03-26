module lk.logintasks {
    requires javafx.controls;
    requires javafx.fxml;


    opens lk.logintasks to javafx.fxml;
    exports lk.logintasks;
}