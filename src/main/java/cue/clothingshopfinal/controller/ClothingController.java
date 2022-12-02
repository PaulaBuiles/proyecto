package cue.clothingshopfinal.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import cue.clothingshopfinal.HelloApplication;
import cue.clothingshopfinal.model.Clothing;
import cue.clothingshopfinal.model.ClothingDTO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class ClothingController implements Initializable {
    ModelFactoryController mfc=ModelFactoryController.getInstance();
    public Clothing clothing;
    String name;
    Double price;

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
    private ImageView product2;

    @FXML
    private ImageView product3;

    @FXML
    private ImageView product4;

    @FXML
    private ImageView product5;

    @FXML
    private ImageView product6;

    @FXML
    void addCart(MouseEvent event) {
        String str= price1.getText();
        Double d= Double.valueOf(str);
        mfc.clothing.getSellService().addCart(name1.getText(),d);

    }

    @FXML
    void beginningView(ActionEvent event)throws IOException {
        HelloApplication.beginningView(event);
    }
    @FXML
    void loginView(MouseEvent event) throws IOException{
        HelloApplication.loginView(event);
    }

    @FXML
    void productsMenView(ActionEvent event) throws IOException {
        HelloApplication.productMenView(event);
    }

    @FXML
    void sellView(MouseEvent event)throws IOException {
        HelloApplication.sellView(event);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
    void getData(){

    }
}
