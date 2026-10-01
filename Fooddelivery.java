import java.util.*;

class User {
    private int id;
    private String name;
    private String phone;

    User(int id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    String getName() {
        return name;
    }

    void display() {
        System.out.println(id + " " + name + " " + phone);
    }
}

class Customer extends User {
    ArrayList<Order> orders = new ArrayList<>();

    Customer(int id, String name, String phone) {
        super(id, name, phone);
    }

    void display() {
        System.out.println("Customer: " + getName());
    }

    void placeOrder(Order o) {
        orders.add(o);
    }
}

class DeliveryPartner extends User {
    DeliveryPartner(int id, String name, String phone) {
        super(id, name, phone);
    }

    void display() {
        System.out.println("Delivery Partner: " + getName());
    }
}

class Restaurant extends User {
    Restaurant(int id, String name, String phone) {
        super(id, name, phone);
    }

    void display() {
        System.out.println("Restaurant: " + getName());
    }
}

class Order {
    double foodCost;
    double distance;

    Order(double foodCost, double distance) {
        this.foodCost = foodCost;
        this.distance = distance;
    }

    double deliveryCharge() {
        if (distance <= 5)
            return 30;
        else
            return 30 + (distance - 5) * 10;
    }

    void bill() {
        double tax = foodCost * 0.05;
        double total = foodCost + deliveryCharge() + tax;

        System.out.println("Food Cost: " + foodCost);
        System.out.println("Delivery Charge: " + deliveryCharge());
        System.out.println("Tax: " + tax);
        System.out.println("Final Amount: " + total);
    }
}

public class fooddelivery {
    public static void main(String[] args) {

        Customer c = new Customer(101, "Arun", "9999999999");

        double foodCost = 200 + 150 + 250;
        double distance = 7;

        Order o1 = new Order(foodCost, distance);
        c.placeOrder(o1);

        c.display();
        o1.bill();
    }
}