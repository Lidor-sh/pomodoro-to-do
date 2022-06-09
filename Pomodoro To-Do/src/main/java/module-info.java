module com.example.pomodorotodo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pomodorotodo to javafx.fxml;
    exports com.example.pomodorotodo;
}