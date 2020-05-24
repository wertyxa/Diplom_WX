package com.wetyxa.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;

public class RootLayoutController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    void initialize() {

    }

    @FXML
    public void aboutApp() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("BTs");
        alert.setHeaderText("BTs -> Busritet Tests");
        alert.setContentText("Author: Marian Lukach\nWebsite: http://vpu21.if.ua");

        alert.showAndWait();
    }
    @FXML
    private void handleExit() {
        System.exit(0);
    }

}
