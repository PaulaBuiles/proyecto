package cue.clothingshopfinal.services.Impl;

import cue.clothingshopfinal.model.Clothing;
import cue.clothingshopfinal.model.ClothingDTO;
import cue.clothingshopfinal.model.ComparatorClothing;
import cue.clothingshopfinal.services.ClothingService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ClothingServiceImpl implements ClothingService {
    ArrayList<Clothing> clothingArrayList = new ArrayList<>();
    HashMap<String,Clothing> clothingHashMap = new HashMap<String,Clothing>();
    public void create(String name,String type,int amount,Double price,String code){
        clothingHashMap.put(code,new Clothing(name, type, amount, price));
    }
    //Eliminar el producto por medio del codigo asignado
    public void remove(String code){
        clothingHashMap.remove(code);
    }
    //Recorrer:
    public void over(){
        for (Map.Entry<String, Clothing>entry: clothingHashMap.entrySet()) {
            String key= entry.getKey();
            Clothing clothing=entry.getValue();
        }
    }
    //recorrer los valores
    public void overValue() {
        for (Clothing c : clothingHashMap.values()) {
            System.out.println(c);
        }
    }
    //recorrer los identificadores
        public void overKeyset(){
            for (String c : clothingHashMap.keySet()) {
            System.out.println(c);
        }
    }
    public void over2(){
        for(String c : clothingHashMap.keySet()){
            System.out.println("key: "+c+" value "+ clothingHashMap.get(c).getName());
        }
    }
    public  void organize(){
       clothingArrayList.sort(new ComparatorClothing());
    }
    public Stream<Clothing> search (String name){
        return clothingArrayList.stream()
                .filter(clothing -> name.equalsIgnoreCase(clothing.getName()))
                .limit(1);
    }
    public List<ClothingDTO> createListDto(){
        return clothingArrayList.stream()
                .map(clothing -> new ClothingDTO(clothing.getName(),clothing.getPrice()))
                .collect(Collectors.toList());
    }
}
