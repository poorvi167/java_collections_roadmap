package io.github.dbc.java_collections_roadmap.controller;

import io.github.dbc.java_collections_roadmap.HelloApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {

    @FXML
    public Button mainButton;

    @FXML
    private Label welcomeText;

    @FXML
    protected void onMainButtonClick() throws IOException {
        // open the next stage here!
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("constant-elements-view.fxml"));
        Scene scene = new Scene(
                fxmlLoader.load(),
                Screen.getPrimary().getBounds().getMinX(),
                Screen.getPrimary().getBounds().getMinY()
        );
        stage.setTitle("Number of Elements");
        stage.setScene(scene);
        stage.show();
    }
}