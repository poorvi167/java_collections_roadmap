package io.github.dbc.java_collections_roadmap.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.stage.Stage;

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
    public void onUniqueNoButtonClicked() {
        // open a new stage
    }
}
