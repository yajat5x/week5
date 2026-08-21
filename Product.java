public abstract class Product {
    protected String productId;
    protected String name;
    protected double price;

    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public abstract double calculateDiscount();

    public double calculateFinalPrice() {
        return price - calculateDiscount();
    }

    public void display() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Original Price: ₹" + price);
        System.out.println("Discount: ₹" + calculateDiscount());
        System.out.println("Final Price: ₹" + calculateFinalPrice());
        System.out.println();
    }

    public static void main(String[] args) {
        Product electronics = new Electronics("E101", "Laptop", 60000);
        Product clothing = new Clothing("C102", "Jacket", 5000);
        Product books = new Books("B103", "Java Programming", 1000);

        electronics.display();
        clothing.display();
        books.display();
    }
}

class Electronics extends Product {
    public Electronics(String productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return price * 0.10;
    }
}

class Clothing extends Product {
    public Clothing(String productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return price * 0.20;
    }
}

class Books extends Product {
    public Books(String productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return price * 0.15;
    }
}