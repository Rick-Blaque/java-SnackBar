package snackApp;

public class Customer {
    public static int maxId = 0;
    public int id;
    public String name;
    public double cashOnHand;

    public Customer(String name, double cashOnHand) {
        maxId++;
        id = maxId;
        this.name = name;
        this.cashOnHand = cashOnHand;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addCash(double cash) {
        this.cashOnHand += cash;
    }

    public double getCashOnHand() {
        return cashOnHand;
    }

    public void buySnacks(double cost) {
        this.cashOnHand -= cost;
    }
}
