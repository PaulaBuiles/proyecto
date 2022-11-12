package cue.clothingshopfinal.model;

public class Admin extends Person{
    private Double salary;
    public Admin(String name, String id, String phone, String mail,Double salary) {
        super(name, id, phone, mail);
        this.salary=salary;
    }
    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
