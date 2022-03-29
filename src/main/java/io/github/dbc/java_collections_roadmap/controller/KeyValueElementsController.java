package io.github.dbc.java_collections_roadmap.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

public class KeyValueElementsController {

    @FXML
    public Button keyValueYesButton;

    @FXML
    public Button keyValueNoButton;

    @FXML
    public void onKeyValueYesButtonClicked() {
        // ask the user to use java.util.Map
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Key-Value Elements");
        alert.setHeaderText("use java.util.Map");
        alert.setContentText("Use java.util.Map to store key-value pairs.");
        alert.showAndWait();
    }

    @FXML
    public void onKeyValueNoButtonClicked() {
        // ask the user to use java.util.List
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Key-Value Elements");
        alert.setHeaderText("use java.util.List");
        alert.setContentText("Use java.util.List if you don't want to store key-value pairs, and allow duplicates.");
        alert.showAndWait();
    }
}
