module com.example.pomodorotodo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pomodorotodo to javafx.fxml;
    exports com.example.pomodorotodo;
    exports com.example.pomodorotodo.controllers;
    opens com.example.pomodorotodo.controllers to javafx.fxml;
}