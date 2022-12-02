package cue.clothingshopfinal.services;

import cue.clothingshopfinal.model.Sell;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;

public interface SellService {
    void addCart(String name, Double price);

    void chargeTable(TableView<Sell> tblSell);
}
