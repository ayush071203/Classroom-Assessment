public class Vehicle {
    private String ownerName;
    private String vehicleType;
    private static double registrationFee = 500.0; // Fixed registration fee for all vehicles

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: $" + registrationFee);
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Alice Johnson", "Car");
        Vehicle vehicle2 = new Vehicle("Bob Smith", "Motorcycle");

        System.out.println("Before Updating Registration Fee:");
        vehicle1.displayVehicleDetails();
        System.out.println();
        vehicle2.displayVehicleDetails();
        System.out.println();

        Vehicle.updateRegistrationFee(600.0);

        System.out.println("After Updating Registration Fee:");
        vehicle1.displayVehicleDetails();
        System.out.println();
        vehicle2.displayVehicleDetails();
    }
}
