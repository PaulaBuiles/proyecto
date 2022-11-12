package cue.clothingshopfinal.model;

public class Person {
    private String name;
    private String id;
    private String phone;
    private String mail;

    public Person(String name, String id, String phone, String mail) {
        this.name = name;
        this.id = id;
        this.phone = phone;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
