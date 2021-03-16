package snackApp;

public class Main {

    private static void workWithData() {
        Customer cust1 = new Customer("Jane", 45.25);
        Customer cust2 = new Customer("Bob", 33.14);

        VendingMachine vend1 = new VendingMachine("Food");
        VendingMachine vend2 = new VendingMachine("Drink");
        VendingMachine vend3 = new VendingMachine("Office");

        Snack snack1 = new Snack("Chips", 36, 1.75, vend1.getId());
        Snack snack2 = new Snack("Chocolate Bar", 36, 1.00, vend1.getId());
        Snack snack3 = new Snack("Pretzel", 30, 2.00, vend1.getId());
        Snack snack4 = new Snack("Soda", 24, 2.50, vend2.getId());
        Snack snack5 = new Snack("Water", 20, 2.75, vend2.getId());

        // Jane buys 3 sodas
        cust1.buySnacks(snack4.getCost());
        cust1.buySnacks(snack4.getCost());
        cust1.buySnacks(snack4.getCost());
        snack4.buySnacks(3);
        System.out.println(cust1.getName() + "'s cash on hand is " + cust1.getCashOnHand());
        System.out.println("Quantity of soda is " + snack4.getQuantity());

        // Jane buys 1 pretzal
        cust1.buySnacks(snack3.getCost());
        snack3.buySnacks(1);
        System.out.println(cust1.getName() + "'s cash on hand is " + cust1.getCashOnHand());
        System.out.println("Quantity of pretzle is " + snack3.getQuantity());

        // Bob buys 2 sodas
        cust2.buySnacks(snack4.getCost());
        cust2.buySnacks(snack4.getCost());
        snack4.buySnacks(2);
        System.out.println(cust2.getName() + "'s cash on hand is " + cust2.getCashOnHand());
        System.out.println("Quantity of soda is " + snack4.getQuantity());

        // Jane finds 10 dollars
        cust1.addCash(10.0);
        System.out.println(cust1.getName() + "'s cash on hand is " + cust1.getCashOnHand());

        // Jane buys 1 chocolate bar
        cust1.buySnacks(snack2.getCost());
        snack2.buySnacks(1);
        System.out.println(cust1.getName() + "'s cash on hand is " + cust1.getCashOnHand());
        System.out.println("Quantity of chocolate is " + snack2.getQuantity());

        // add 12 pretzles
        snack3.addToQuantity(12);
        System.out.println("Quantity of pretzle is " + snack3.getQuantity());

        // Bob buys 3 pretzels
        cust2.buySnacks(snack3.getCost());
        cust2.buySnacks(snack3.getCost());
        cust2.buySnacks(snack3.getCost());
        snack3.buySnacks(3);
        System.out.println(cust2.getName() + "'s cash on hand is " + cust2.getCashOnHand());
        System.out.println("Quantity of pretzels is " + snack3.getQuantity());

    }

    public static void main(String[] args) {
        workWithData();

        // Customer cust1 = new Customer("Jane", 45.25);
        // Customer cust2 = new Customer("Bob", 33.14);

        // VendingMachine vend1 = new VendingMachine("Food");
        // VendingMachine vend2 = new VendingMachine("Drink");
        // VendingMachine vend3 = new VendingMachine("Office");

        // Snack snack1 = new Snack("Chips", 36, 1.75, vend1.getId());
        // Snack snack2 = new Snack("Chocolate Bar", 36, 1.00, vend1.getId());
        // Snack snack3 = new Snack("Pretzel", 30, 2.00, vend1.getId());
        // Snack snack4 = new Snack("Soda", 24, 2.50, vend2.getId());
        // Snack snack5 = new Snack("Water", 20, 2.75, vend2.getId());

        // cust1.buySnacks(snack4.getCost());
        // cust1.buySnacks(snack4.getCost());
        // cust1.buySnacks(snack4.getCost());
        // System.out.println(cust1.getCashOnHand());

    }
}