import java.util.ArrayList;
import java.util.List;

interface Discountable {
    void applyDiscount(double discountPercentage);
    String getDiscountDetails();
}

abstract class FoodItem implements Discountable {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public abstract double calculateTotalPrice();

    public void getItemDetails() {
        System.out.println("Item: " + itemName + ", Price: $" + price + 
                ", Quantity: " + quantity + ", Total Price: $" + calculateTotalPrice());
    }

    public String getItemName() { return itemName; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
    
    public void applyDiscount(double discountPercentage) {
        price -= price * (discountPercentage / 100);
    }

    public String getDiscountDetails() {
        return "Discount applied to " + itemName;
    }
}

class VegItem extends FoodItem {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }
}

class NonVegItem extends FoodItem {
    private static final double NON_VEG_SURCHARGE = 1.10;

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity() * NON_VEG_SURCHARGE;
    }
}

public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        List<FoodItem> order = new ArrayList<>();
        order.add(new VegItem("Paneer Butter Masala", 12, 2));
        order.add(new NonVegItem("Chicken Biryani", 15, 1));

        for (FoodItem item : order) {
            item.applyDiscount(10);
            item.getItemDetails();
            System.out.println(item.getDiscountDetails());
        }
    }
}
