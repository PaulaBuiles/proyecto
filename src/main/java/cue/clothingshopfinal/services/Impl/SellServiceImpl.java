package cue.clothingshopfinal.services.Impl;

import cue.clothingshopfinal.model.Sell;
import cue.clothingshopfinal.services.SellService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableView;

import java.util.ArrayList;

public class SellServiceImpl implements SellService {
    private ArrayList<Sell> listSell= new ArrayList<>();
    private ObservableList<Sell> sellObservableList= FXCollections.observableArrayList();

    public ArrayList<Sell> getListSell() {
        return listSell;
    }

    public void setListSell(ArrayList<Sell> listSell) {
        this.listSell = listSell;
    }

    public ObservableList<Sell> getSellObservableList() {
        return sellObservableList;
    }

    public void setSellObservableList(ObservableList<Sell> sellObservableList) {
        this.sellObservableList = sellObservableList;
    }

    public SellServiceImpl() {this.listSell = listSell;}
    public void addCart(String name, Double price){
        Sell sell = new Sell(name, price);
        listSell.add(sell);
        System.out.println(sell);
        sellObservableList.add(sell);

    }

    @Override
    public void chargeTable(TableView<Sell> tblSell) {
        tblSell.setItems(sellObservableList);
    }

    /*public void finishShop(String name, String price, String type, TableView<listSell>){
        Sell sell = new Sell(name, price, type,listSell);
        listSell.add(sell);
        sellObservableList.add(sell);

    }*/
}
