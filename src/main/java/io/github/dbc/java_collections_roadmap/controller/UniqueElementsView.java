package io.github.dbc.java_collections_roadmap.controller;

import io.github.dbc.java_collections_roadmap.HelloApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;

public class UniqueElementsView {

    @FXML
    public Button uniqueYesButton;

    @FXML
    public Button uniqueNoButton;

    @FXML
    public void onUniqueYesButtonClicked() throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("sort-elements-view.fxml"));
        Scene scene = new Scene(
                fxmlLoader.load(),
                Screen.getPrimary().getBounds().getMinX(),
                Screen.getPrimary().getBounds().getMinY()
        );
        stage.setTitle("Unique Elements in java.util.Set");
        stage.setScene(scene);
        stage.show();
        // close the current stage
        closeCurrentStage();
    }

    private void closeCurrentStage() {
        Stage stage = (Stage) uniqueYesButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    public void onUniqueNoButtonClicked() throws IOException {
        // open a new stage
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("key-value-elements-view.fxml"));
        Scene scene = new Scene(
                fxmlLoader.load(),
                Screen.getPrimary().getBounds().getMinX(),
                Screen.getPrimary().getBounds().getMinY()
        );
        stage.setTitle("Key-Value Pairs");
        stage.setScene(scene);
        stage.show();
        // close the current stage
        closeCurrentStage();
    }
}
