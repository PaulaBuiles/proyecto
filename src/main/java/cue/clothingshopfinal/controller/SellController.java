package cue.clothingshopfinal.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import cue.clothingshopfinal.HelloApplication;
import cue.clothingshopfinal.exceptions.InputException;
import cue.clothingshopfinal.model.Sell;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

public class SellController implements Initializable {
    ModelFactoryController mfc= ModelFactoryController.getInstance();
    /*Alert alert= new Alert();*/

    @FXML
    private TextField buscar;

    @FXML
    private TableColumn<?, ?> colName;

    @FXML
    private TableColumn<?, ?> colPrice;

    @FXML
    private TableView<Sell> tblSell;

    @FXML
    void chargeTable() {
        mfc.clothing.getSellService().chargeTable(tblSell);
    }

    @FXML
    void beginningView(ActionEvent event) throws IOException {
        HelloApplication.beginningView(event);
    }

    @FXML
    void delete(ActionEvent event) {
        tblSell.getItems().remove(tblSell.getSelectionModel().getSelectedItem());
        alertInfo();
    }
    @FXML
    void finishSell(ActionEvent event) throws InputException, IOException {
        mfc.clothing.getSellService().finishShop(tblSell);
    }

    @FXML
    void loginView(MouseEvent event)throws IOException {
        HelloApplication.loginView(event);
    }

    @FXML
    void productWomenView(ActionEvent event)throws IOException {
        HelloApplication.productView(event);
    }

    @FXML
    void productsMenView(ActionEvent event)throws IOException {
        HelloApplication.productMenView(event);
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colPrice.setCellValueFactory(new PropertyValueFactory<>("price"));
        mfc.clothing.getSellService().chargeTable(tblSell);
    }

    //Haremos las funciones de alertas
    void alertInfo(){
        javafx.scene.control.Alert alert = new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setTitle("!Delete¡");
        alert.setContentText("Su producto se ha elimiando");
        alert.showAndWait();
    }
}

