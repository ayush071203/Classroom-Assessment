class Person {
    protected String name;
    protected int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

interface Worker {
    void performDuties(); 
}

class Chef extends Person implements Worker {
    private String specialty;

    public Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is preparing " + specialty + " dishes.");
    }

    public void displaySpecialty() {
        System.out.println("Specialty: " + specialty);
    }
}


class Waiter extends Person implements Worker {
    private int tablesAssigned;

    public Waiter(String name, int id, int tablesAssigned) {
        super(name, id);
        this.tablesAssigned = tablesAssigned;
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is serving customers at " + tablesAssigned + " tables.");
    }

    public void displayAssignedTables() {
        System.out.println("Tables Assigned: " + tablesAssigned);
    }
}

public class RestaurantManagement {
    public static void main(String[] args) {
        Chef chef = new Chef("Gordon Ramsay", 101, "Italian Cuisine");
        Waiter waiter = new Waiter("John Doe", 201, 5);

        System.out.println("\nChef Details:");
        chef.displayDetails();
        chef.displaySpecialty();
        chef.performDuties();

        System.out.println("\nWaiter Details:");
        waiter.displayDetails();
        waiter.displayAssignedTables();
        waiter.performDuties();
    }
}
