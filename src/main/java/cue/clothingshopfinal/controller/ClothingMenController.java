package cue.clothingshopfinal.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import cue.clothingshopfinal.HelloApplication;
import cue.clothingshopfinal.model.Client;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class ClothingMenController implements Initializable {
    ModelFactoryController mfc=ModelFactoryController.getInstance();

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
    void addCart1(MouseEvent event) {
        System.out.println(price1.getText());
        String str= price1.getText();
        Double d= Double.valueOf(str);
        mfc.clothing.getSellService().addCart(name1.getText(),d);
        alertInfo();
    }
    @FXML
    void addCart2(MouseEvent event) {
        String str2= price2.getText();
        Double d2= Double.valueOf(str2);
        mfc.clothing.getSellService().addCart(name2.getText(),d2);
        alertInfo();
    }

    @FXML
    void addCart3(MouseEvent event) {
        String str= price3.getText();
        Double d= Double.valueOf(str);
        mfc.clothing.getSellService().addCart(name3.getText(),d);
        alertInfo();
    }

    @FXML
    void addCart4(MouseEvent event) {
        String str= price4.getText();
        Double d= Double.valueOf(str);
        mfc.clothing.getSellService().addCart(name4.getText(),d);
        alertInfo();
    }

    @FXML
    void addCart5(MouseEvent event) {
        String str= price5.getText();
        Double d= Double.valueOf(str);
        mfc.clothing.getSellService().addCart(name5.getText(),d);
        alertInfo();
    }

    @FXML
    void addCart6(MouseEvent event) {
        String str = price6.getText();
        Double d = Double.valueOf(str);
        mfc.clothing.getSellService().addCart(name6.getText(), d);
        alertInfo();
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
    void sellView(MouseEvent event)throws IOException {
        Client client= mfc.clothing.getClientService().getClientOn();
        if (client!= null && client.isCondition()){
            HelloApplication.sellView(event);
        }else {
            HelloApplication.loginView(event);
        }
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
    void alertInfo(){
        javafx.scene.control.Alert alert = new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setTitle("¡Exito!");
        alert.setContentText("Su producto se ha añadido al carrito");
        alert.showAndWait();
    }
}

