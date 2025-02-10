import java.util.ArrayList;
import java.util.List;

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

abstract class Product implements Taxable {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public abstract double calculateDiscount();

    public int getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    
    public void setPrice(double price) { this.price = price; }

    public double getFinalPrice() {
        return price + calculateTax() - calculateDiscount();
    }

    public void displayDetails() {
        System.out.println("ID: " + productId + ", Name: " + name + 
                           ", Price: $" + price + 
                           ", Tax: $" + calculateTax() + 
                           ", Discount: $" + calculateDiscount() + 
                           ", Final Price: $" + getFinalPrice());
    }
}

class Electronics extends Product {
    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05; 
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.10; 
    }

    @Override
    public String getTaxDetails() {
        return "Electronics Tax: 10%";
    }
}

class Clothing extends Product {
    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.15; 
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.08; 
    }

    @Override
    public String getTaxDetails() {
        return "Clothing Tax: 8%";
    }
}

class Groceries extends Product {
    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.02; 
    }

    @Override
    public double calculateTax() {
        return 0; 
    }

    @Override
    public String getTaxDetails() {
        return "Groceries Tax: 0%";
    }
}

public class ECommercePlatform {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        Product laptop = new Electronics(101, "Laptop", 1000);
        Product tshirt = new Clothing(102, "T-Shirt", 50);
        Product rice = new Groceries(103, "Rice Bag", 30);

        products.add(laptop);
        products.add(tshirt);
        products.add(rice);

        for (Product product : products) {
            product.displayDetails();
        }
    }
}
