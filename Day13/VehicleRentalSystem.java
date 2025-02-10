import java.util.ArrayList;
import java.util.List;

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

abstract class Vehicle implements Insurable {
    private String vehicleNumber;
    private String type;
    private double rentalRate;
    private String insurancePolicyNumber; 

    public Vehicle(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    public abstract double calculateRentalCost(int days);

    public String getVehicleNumber() { return vehicleNumber; }
    public String getType() { return type; }
    public double getRentalRate() { return rentalRate; }

    protected String getInsurancePolicyNumber() { return insurancePolicyNumber; } 

    public void displayDetails(int days) {
        System.out.println("Vehicle No: " + vehicleNumber + 
                           ", Type: " + type + 
                           ", Rental Cost for " + days + " days: $" + calculateRentalCost(days) + 
                           ", Insurance: $" + calculateInsurance());
    }
}

class Car extends Vehicle {
    public Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Car", rentalRate, insurancePolicyNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return 0.05 * getRentalRate(); 
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance Policy: " + getInsurancePolicyNumber();
    }
}

class Bike extends Vehicle {
    public Bike(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Bike", rentalRate, insurancePolicyNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return 0.02 * getRentalRate(); 
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance Policy: " + getInsurancePolicyNumber();
    }
}

class Truck extends Vehicle {
    public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate, insurancePolicyNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days + 50; 
    }

    @Override
    public double calculateInsurance() {
        return 0.08 * getRentalRate(); 
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance Policy: " + getInsurancePolicyNumber();
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();

        Vehicle car = new Car("CAR123", 40, "CAR-INS-456");
        Vehicle bike = new Bike("BIKE456", 15, "BIKE-INS-789");
        Vehicle truck = new Truck("TRUCK789", 70, "TRUCK-INS-012");

        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(truck);

        int rentalDays = 5;
        for (Vehicle vehicle : vehicles) {
            vehicle.displayDetails(rentalDays);
        }
    }
}
