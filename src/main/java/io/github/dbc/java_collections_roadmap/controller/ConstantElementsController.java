package io.github.dbc.java_collections_roadmap.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class ConstantElementsController {
    @FXML
    public Button constantsYesButton;

    @FXML
    public Button constantsNoButton;

    @FXML
    private void onConstantsYesButtonClicked() {
        // declare the result
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Constant Elements");
        alert.setHeaderText("Use Array!");
        alert.setContentText("Since you want to store a constant number of elements, you should use Arrays");
        alert.setResizable(false);
        alert.showAndWait();
        // close the current scene
    }

    @FXML
    private void onConstantsNoButtonClicked() throws IOException {
        // open the next stage
        Stage stage = new Stage();
        // close the current stage
    }
}
