class Patient {
    private static String hospitalName = "City General Hospital";
    private static int totalPatients = 0;

    private final int patientID;
    private String name;
    private int age;
    private String ailment;

    public Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    public static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }

    public void displayPatientDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Patient p1 = new Patient(101, "Alice Johnson", 30, "Flu");
        Patient p2 = new Patient(102, "Bob Smith", 45, "Diabetes");

        p1.displayPatientDetails();
        System.out.println("-------------------");
        p2.displayPatientDetails();

        Patient.getTotalPatients();
    }
}
