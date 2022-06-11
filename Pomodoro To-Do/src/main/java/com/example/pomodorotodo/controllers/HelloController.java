package com.example.pomodorotodo.controllers;

import com.example.pomodorotodo.Vars;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class HelloController {

    @FXML
    protected Button todayBtn;

    @FXML
    protected Button tomorrowBtn;

    @FXML
    protected Button upcomingBtn;

    @FXML
    protected Button somedayBtn;


    @FXML
    protected void onExitButtonClick(ActionEvent evt) {
        Stage stage = (Stage) ((Button)evt.getSource()).getScene().getWindow();
        stage.close();
    }

    @FXML
    protected void onMaxButtonClick(ActionEvent evt) {
        Stage stage = (Stage) ((Button)evt.getSource()).getScene().getWindow();
        if(stage.isMaximized())
            stage.setMaximized(false);
        else
            stage.setMaximized(true);

        switch (Vars.focused){
            case Today:
                todayBtn.requestFocus();
                break;
            case Tomorrow:
                tomorrowBtn.requestFocus();
                break;
            case Upcoming:
                upcomingBtn.requestFocus();
                break;
            case Someday:
                somedayBtn.requestFocus();
                break;
        }
    }

    @FXML
    protected void onMiniButtonClick(ActionEvent evt) {
        Stage stage = (Stage) ((Button)evt.getSource()).getScene().getWindow();
        stage.setIconified(true);
        switch (Vars.focused){
            case Today:
                todayBtn.requestFocus();
                break;
            case Tomorrow:
                tomorrowBtn.requestFocus();
                break;
            case Upcoming:
                upcomingBtn.requestFocus();
                break;
            case Someday:
                somedayBtn.requestFocus();
                break;
        }
    }

    @FXML
    protected void onTodayButtonClick(ActionEvent evt) {
        Vars.focused = Vars.Category.Today;
    }

    @FXML
    protected void onTomorrowButtonClick(ActionEvent evt) {
        Vars.focused = Vars.Category.Tomorrow;
    }

    @FXML
    protected void onUpcomingButtonClick(ActionEvent evt) {
        Vars.focused = Vars.Category.Upcoming;
    }

    @FXML
    protected void onSomedayButtonClick(ActionEvent evt) {
        Vars.focused = Vars.Category.Someday;
    }
}