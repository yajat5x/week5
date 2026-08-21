import java.util.Scanner;

interface Payment {
    void makePayment(double amount);
}

class UPI implements Payment {
    public void makePayment(double amount) {
        System.out.println("Payment of ₹" + amount + " made using UPI.");
    }
}

class CreditCard implements Payment {
    public void makePayment(double amount) {
        System.out.println("Payment of ₹" + amount + " made using Credit Card.");
    }
}

class NetBanking implements Payment {
    public void makePayment(double amount) {
        System.out.println("Payment of ₹" + amount + " made using Net Banking.");
    }
}

public class PaymentSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select Payment Method:");
        System.out.println("1. UPI");
        System.out.println("2. Credit Card");
        System.out.println("3. Net Banking");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter amount: ₹");
        double amount = sc.nextDouble();

        Payment payment;

        if (choice == 1) {
            payment = new UPI();
        } else if (choice == 2) {
            payment = new CreditCard();
        } else if (choice == 3) {
            payment = new NetBanking();
        } else {
            System.out.println("Invalid choice.");
            sc.close();
            return;
        }

        payment.makePayment(amount);

        sc.close();
    }
}