package cue.clothingshopfinal.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import cue.clothingshopfinal.HelloApplication;
import cue.clothingshopfinal.model.Sell;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

public class SellController implements Initializable {
    ModelFactoryController mfc= ModelFactoryController.getInstance();
    @FXML
    private TextField buscar;

    @FXML
    private TableColumn<?, ?> colName;

    @FXML
    private TableColumn<?, ?> colPrice;

    @FXML
    private TableColumn<?, ?> colType;
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

    }


    @FXML
    void finishSell(ActionEvent event) {

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
        colType.setCellValueFactory(new PropertyValueFactory<>("type"));

    }
}

