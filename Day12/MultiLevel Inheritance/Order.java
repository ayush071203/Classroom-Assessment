class Order {
    protected String orderId;
    protected String orderDate;

    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return "Order placed on " + orderDate;
    }

    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Status: " + getOrderStatus());
    }
}

class ShippedOrder extends Order {
    protected String trackingNumber;

    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Order shipped with Tracking Number: " + trackingNumber;
    }

    @Override
    public void displayOrderDetails() {
        super.displayOrderDetails();
        System.out.println("Tracking Number: " + trackingNumber);
    }
}

class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;

    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return "Order delivered on " + deliveryDate;
    }

    @Override
    public void displayOrderDetails() {
        super.displayOrderDetails();
        System.out.println("Delivery Date: " + deliveryDate);
    }
}

public class OrderManagement {
    public static void main(String[] args) {
        Order order = new Order("ORD123", "2025-02-01");
        ShippedOrder shippedOrder = new ShippedOrder("ORD124", "2025-02-02", "TRK56789");
        DeliveredOrder deliveredOrder = new DeliveredOrder("ORD125", "2025-02-03", "TRK67890", "2025-02-05");

        System.out.println("\nOrder Details:");
        order.displayOrderDetails();

        System.out.println("\nShipped Order Details:");
        shippedOrder.displayOrderDetails();

        System.out.println("\nDelivered Order Details:");
        deliveredOrder.displayOrderDetails();
    }
}
