package cue.clothingshopfinal.model;

public class SellDetail {
    private String products;
    private String amount;

    public SellDetail(String products, String amount) {
        this.products = products;
        this.amount = amount;
    }

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
