package cue.clothingshopfinal.model;

public class Sell {
    private String buyerName;
    private String deliveryAddress;
    private String deliverDate;
    private String clothes;
    private String amount;

    public Sell(String buyerName, String deliveryAddress, String deliverDate, String clothes, String amount) {
        this.buyerName = buyerName;
        this.deliveryAddress = deliveryAddress;
        this.deliverDate = deliverDate;
        this.clothes = clothes;
        this.amount = amount;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getDeliverDate() {
        return deliverDate;
    }

    public void setDeliverDate(String deliverDate) {
        this.deliverDate = deliverDate;
    }

    public String getClothes() {
        return clothes;
    }

    public void setClothes(String clothes) {
        this.clothes = clothes;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
