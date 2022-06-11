package com.example.pomodorotodo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class HelloApplication extends Application {

    private double x, y = 0;
    private boolean resizebottom = false;
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("fxml/Home.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Pomodoro To-Do");
        stage.initStyle(StageStyle.UNDECORATED);

        Vars.focused = Vars.Category.Today;

        scene.setOnMouseMoved(evt -> {
            if (evt.getX() > stage.getWidth() - 10
                    && evt.getX() < stage.getWidth() + 10
                    && evt.getY() > stage.getHeight() - 10
                    && evt.getY() < stage.getHeight() + 10) {
                scene.setCursor(Cursor.SE_RESIZE);
            }else{
                scene.setCursor(Cursor.DEFAULT);
            }
        });

        scene.setOnMousePressed(evt -> {
            if (evt.getX() > stage.getWidth() - 10
                    && evt.getX() < stage.getWidth() + 10
                    && evt.getY() > stage.getHeight() - 10
                    && evt.getY() < stage.getHeight() + 10) {
                resizebottom = true;
                x = stage.getWidth() - evt.getX();
                y = stage.getHeight() - evt.getY();
            } else {
                resizebottom = false;
                x = evt.getSceneX();
                y = evt.getSceneY();
            }
        });

        scene.setOnMouseDragged(evt -> {
            if(resizebottom){
                stage.setWidth(Math.max(evt.getX() + x, 931));
                stage.setHeight(Math.max(evt.getY() + y, 549));
            }else {
                stage.setX(evt.getScreenX() - x);
                stage.setY(evt.getScreenY() - y);
            }
        });

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}