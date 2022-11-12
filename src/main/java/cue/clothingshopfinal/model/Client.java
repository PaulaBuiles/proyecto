package cue.clothingshopfinal.model;

public class Client extends Person {
    private String addres;
    public Client(String name, String id, String phone, String mail, String addres) {
        super(name, id, phone, mail);
        this.addres= addres;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }
}
