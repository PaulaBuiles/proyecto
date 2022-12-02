package cue.clothingshopfinal.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import cue.clothingshopfinal.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class ClothingMenController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField buscar;

    @FXML
    private Label name1;

    @FXML
    private Label name2;

    @FXML
    private Label name3;

    @FXML
    private Label name4;

    @FXML
    private Label name5;

    @FXML
    private Label name6;

    @FXML
    private Label price1;

    @FXML
    private Label price2;

    @FXML
    private Label price3;

    @FXML
    private Label price4;

    @FXML
    private Label price5;

    @FXML
    private Label price6;

    @FXML
    private ImageView product1;

    @FXML
    void addCart(MouseEvent event) {

    }

    @FXML
    void beginningView(ActionEvent event) throws IOException {
        HelloApplication.beginningView(event);
    }

    @FXML
    void loginView(MouseEvent event)  throws IOException {
        HelloApplication.loginView(event);
    }

    @FXML
    void productsMenView(ActionEvent event) throws IOException {
        HelloApplication.productMenView(event);
    }

    @FXML
    void productsView(ActionEvent event)  throws IOException {
        HelloApplication.productView(event);
    }

    @FXML
    void initialize() {


    }

}

