package cue.clothingshopfinal.controller;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import cue.clothingshopfinal.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class BeginningController {
        private Stage stage;
        private Scene scene;
        private Parent root;

        @FXML
        private ResourceBundle resources;

        @FXML
        private URL location;

        @FXML
        void buttonMen(ActionEvent event) throws IOException {
                HelloApplication.productMenView(event);
        }

        @FXML
        void buttonWoman(ActionEvent event) throws IOException {
                HelloApplication.productView(event);
        }

        @FXML
        void initialize() {

        }
        public void setStage(Stage stage) {this.stage=stage;}

    }


