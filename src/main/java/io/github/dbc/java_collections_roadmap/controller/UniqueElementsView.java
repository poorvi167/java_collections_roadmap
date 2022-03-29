package io.github.dbc.java_collections_roadmap.controller;

import io.github.dbc.java_collections_roadmap.HelloApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
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
    public void onUniqueYesButtonClicked() {
        // ask the user to user java.util.Set
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Unique Elements");
        alert.setHeaderText("Use java.util.Set!");
        alert.setContentText("Since you want to store a unique elements only, you should use java.util.Set.");
        alert.setResizable(false);
        alert.showAndWait();
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
