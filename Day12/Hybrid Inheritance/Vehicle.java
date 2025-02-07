class Vehicle {
    protected int maxSpeed;
    protected String model;

    public Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    public void displayDetails() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

interface Refuelable {
    void refuel();
}

class ElectricVehicle extends Vehicle {
    private int batteryCapacity;

    public ElectricVehicle(int maxSpeed, String model, int batteryCapacity) {
        super(maxSpeed, model);
        this.batteryCapacity = batteryCapacity;
    }

    public void charge() {
        System.out.println(model + " is charging with a battery capacity of " + batteryCapacity + " kWh.");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {
    private double fuelTankCapacity;

    public PetrolVehicle(int maxSpeed, String model, double fuelTankCapacity) {
        super(maxSpeed, model);
        this.fuelTankCapacity = fuelTankCapacity;
    }

    @Override
    public void refuel() {
        System.out.println(model + " is refueling with a tank capacity of " + fuelTankCapacity + " liters.");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Fuel Tank Capacity: " + fuelTankCapacity + " liters");
    }
}

public class VehicleManagementSystem {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle(150, "Tesla Model S", 100);
        PetrolVehicle pv = new PetrolVehicle(180, "Ford Mustang", 60);

        System.out.println("\nElectric Vehicle Details:");
        ev.displayDetails();
        ev.charge();

        System.out.println("\nPetrol Vehicle Details:");
        pv.displayDetails();
        pv.refuel();
    }
}
