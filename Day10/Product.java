class Product {
    private static double discount = 10.0;  

    private final int productID;  
    private String productName;
    private double price;
    private int quantity;

    public Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    public void displayProductDetails() {
        if (this instanceof Product) {
            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Price: $" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Product prod1 = new Product(101, "Laptop", 1200.0, 1);
        Product prod2 = new Product(102, "Smartphone", 800.0, 2);

        System.out.println("Before Discount Update:");
        prod1.displayProductDetails();
        System.out.println("-------------------");
        prod2.displayProductDetails();

        Product.updateDiscount(15.0);

        System.out.println("\nAfter Discount Update:");
        prod1.displayProductDetails();
        System.out.println("-------------------");
        prod2.displayProductDetails();
    }
}
