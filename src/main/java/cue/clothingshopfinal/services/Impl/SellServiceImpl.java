package cue.clothingshopfinal.services.Impl;

import cue.clothingshopfinal.exceptions.InputException;
import cue.clothingshopfinal.exceptions.InputValidations;
import cue.clothingshopfinal.model.Sell;
import cue.clothingshopfinal.services.SellService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.*;
import javafx.scene.control.Alert;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Optional;

public class SellServiceImpl implements SellService {

    private final InputValidations inputValidations= new InputValidations();

    private ArrayList<Sell> listSell= new ArrayList<>();
    private final ObservableList<Sell> sellObservableList= FXCollections.observableArrayList();

    public ObservableList<Sell> getSellObservableList() {
        return sellObservableList;
    }

    public SellServiceImpl() {this.listSell = listSell;}

    // De aqui comienzan las funciones de añadir los productos al carrito
    public void addCart(String name, Double price){
        Sell sell = new Sell(name, price);
        listSell.add(sell);
        sellObservableList.add(sell);
    }
    @Override
    public void chargeTable(TableView<Sell> tblSell) {
        tblSell.setItems(sellObservableList);
        tblSell.refresh();
    }
    public void finishShop(TableView<Sell> tblSell) throws InputException, IOException {
        double total = 0d;
        for(int i = 0; i < tblSell.getItems().size(); i++) {
            /*DecimalFormat df = new DecimalFormat("######.000");*/
            Double valor = new Double(tblSell.getItems().get(i).getPrice().toString().replace(",", "."));
            total += valor;
        }
        System.out.println(total);
        finishAlert("Este es el total a pagar: "+total+"00");
        listSell.clear();
        sellObservableList.clear();
    }
    void alertInfo(String header){
        javafx.scene.control.Alert alert = new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.INFORMATION);
        alert.setHeaderText(header);
        alert.setTitle("Compra realizada");
        alert.setContentText("Su compra se ha realizado exitosamente");
        alert.showAndWait();
    }
    void finishAlert(String header) throws InputException, IOException {
        javafx.scene.control.Alert alert = new javafx.scene.control.Alert(Alert.AlertType.CONFIRMATION);
        alert.setHeaderText(header);
        alert.setTitle("Finalizar compra");
        alert.setContentText("Elige para pagar para continuar con tu compra");

        ButtonType tipe1 = new ButtonType("Pagar");
        ButtonType tipeCancel = new ButtonType("cancel", ButtonBar.ButtonData.CANCEL_CLOSE);

        alert.getButtonTypes().setAll(tipe1,tipeCancel);

        Optional<ButtonType> result = alert.showAndWait();
        if (result.isPresent() && result.get() == tipe1) {
            inputTextAlert();
        }
    }
    void inputTextAlert() throws IOException,InputException {
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Pago");
        dialog.setHeaderText("Ingresa el numero de tu tarjeta");
        dialog.setContentText("Mastercard");
        Optional<String> inputText = dialog.showAndWait();
        inputText.ifPresent(this::alertInfo);

/*
        inputValidations.intInput(String.valueOf(inputText));
*/
    }

}
