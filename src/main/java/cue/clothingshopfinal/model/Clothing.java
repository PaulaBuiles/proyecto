package cue.clothingshopfinal.model;

public class Clothing {
    private String name;
    private String type;
    private int amount;
    private Double price;

    public Clothing(String name, String type, int amount, Double price) {
        this.name = name;
        this.type = type;
        this.amount = amount;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
