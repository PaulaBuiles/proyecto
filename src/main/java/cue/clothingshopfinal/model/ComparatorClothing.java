package cue.clothingshopfinal.model;

import java.util.Comparator;

public class ComparatorClothing implements Comparator<Clothing> {

    @Override
    public int compare(Clothing o1, Clothing o2) {
        String type1=o1.getType();
        String type2=o2.getType();
        return type1.compareTo(type2);
    }
}
