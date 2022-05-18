package io.github.dbc.java_collections_roadmap.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

public class SortElementsController {
    @FXML
    public Button setSortingYesButton;

    @FXML
    public Button setSortingNoButton;


    @FXML
    public void sortingYesButtonPressed() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Sort");
        alert.setHeaderText("Methods for sorting Sets");
        alert.setContentText("Use List and the method java.util.Collections.sort() for sorting, \nOr use TreeSet to sort the elements,\nOr use ObjectReference.stream().sorted() to sort the elements ");
        alert.showAndWait();
    }

    @FXML
    public void sortingNoButtonPressed() {

    }
}
