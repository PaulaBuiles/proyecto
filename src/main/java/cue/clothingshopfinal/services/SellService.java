package cue.clothingshopfinal.services;

import cue.clothingshopfinal.exceptions.InputException;
import cue.clothingshopfinal.model.Sell;
import javafx.collections.ObservableList;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;

import java.io.IOException;

public interface SellService {
    void addCart(String name, Double price);
    void chargeTable(TableView<Sell> tblSell);
    void finishShop(TableView<Sell> tblSell) throws InputException, IOException;
    /*void selected(TableView<Sell>tblSell,String name, Double price);*/
    ObservableList<Sell> getSellObservableList();
}
