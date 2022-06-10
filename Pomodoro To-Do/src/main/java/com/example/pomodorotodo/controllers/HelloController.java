package com.example.pomodorotodo.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class HelloController {

    @FXML
    protected void onExitButtonClick(ActionEvent evt) {
        Stage stage = (Stage) ((Button)evt.getSource()).getScene().getWindow();
        stage.close();
    }
}