import java.util.*;

class Patient {
    String name;
    int severity;

    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }

    @Override
    public String toString() {
        return name + " (Severity: " + severity + ")";
    }
}

public class HospitalTriageSystem {
    public static void main(String[] args) {
        PriorityQueue<Patient> pq = new PriorityQueue<>(new Comparator<Patient>() {
            @Override
            public int compare(Patient p1, Patient p2) 
                return Integer.compare(p2.severity, p1.severity);
            }
        });

        // Add patients to the queue
        pq.add(new Patient("John", 3));
        pq.add(new Patient("Alice", 5));
        pq.add(new Patient("Bob", 2));

        System.out.println("Order of treatment based on severity:");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll().name); 
        }
    }