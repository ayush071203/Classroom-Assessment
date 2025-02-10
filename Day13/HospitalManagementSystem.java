import java.util.ArrayList;
import java.util.List;

interface MedicalRecord {
    void addRecord(String record);
    List<String> viewRecords();
}

abstract class Patient implements MedicalRecord {
    private String patientId;
    private String name;
    private int age;
    private List<String> medicalHistory;

    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.medicalHistory = new ArrayList<>();
    }

    public abstract double calculateBill();

    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId + ", Name: " + name + 
                ", Age: " + age + ", Total Bill: $" + calculateBill());
    }

    public void addRecord(String record) {
        medicalHistory.add(record);
    }

    public List<String> viewRecords() {
        return new ArrayList<>(medicalHistory);
    }

    public String getPatientId() { return patientId; }
    public String getName() { return name; }
    public int getAge() { return age; }
}

class InPatient extends Patient {
    private int daysAdmitted;
    private double dailyCharge;

    public InPatient(String patientId, String name, int age, int daysAdmitted, double dailyCharge) {
        super(patientId, name, age);
        this.daysAdmitted = daysAdmitted;
        this.dailyCharge = dailyCharge;
    }

    @Override
    public double calculateBill() {
        return daysAdmitted * dailyCharge;
    }
}

class OutPatient extends Patient {
    private double consultationFee;

    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }
}

public class HospitalManagementSystem {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();
        InPatient inPatient = new InPatient("P001", "John Doe", 45, 5, 300);
        OutPatient outPatient = new OutPatient("P002", "Jane Smith", 30, 100);

        inPatient.addRecord("Diagnosed with pneumonia");
        outPatient.addRecord("Routine checkup");

        patients.add(inPatient);
        patients.add(outPatient);

        for (Patient patient : patients) {
            patient.getPatientDetails();
            System.out.println("Medical Records: " + patient.viewRecords());
        }
    }
}
