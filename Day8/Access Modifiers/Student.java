public class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    public void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}
class PostgraduateStudent extends Student {

    public PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }

    public void displayPostgraduateDetails() {
        System.out.println("Postgraduate Student Details:");
        System.out.println("Roll Number: " + rollNumber); 
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + getCGPA());         
    }

    public static void main(String[] args) {
        PostgraduateStudent pgStudent = new PostgraduateStudent(101, "John Doe", 8.75);
        
        pgStudent.displayPostgraduateDetails();
        
        pgStudent.setCGPA(9.2);
        System.out.println("\nUpdated CGPA: " + pgStudent.getCGPA());
    }
}
