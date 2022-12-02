package cue.clothingshopfinal.services.Impl;

import cue.clothingshopfinal.model.Clothing;
import cue.clothingshopfinal.services.ClothingService;
import javafx.scene.image.ImageView;

import java.util.ArrayList;

public class ClothingServiceImpl implements ClothingService {
    ArrayList<Clothing> clothingArrayList = new ArrayList<Clothing>();


    public ArrayList<Clothing> getClothingArrayList() {
        return clothingArrayList;
    }

    public void setClothingArrayList(ArrayList<Clothing> clothingArrayList) {
        this.clothingArrayList = clothingArrayList;
    }

    public void addClothing(){
          /*clothingArrayList.add(new Clothing("Enterizo con escote", 200.000));*/

    }

    public void addCartElement(){

    }


}
