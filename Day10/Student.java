class Student {
    private static String universityName = "Global University";
    private static int totalStudents = 0;

    private final int rollNumber;
    private String name;
    private char grade;

    public Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    public void updateGrade(char newGrade) {
        if (this instanceof Student) {
            this.grade = newGrade;
            System.out.println(name + "'s grade updated to: " + grade);
        }
    }

    public void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("University: " + universityName);
            System.out.println("Student Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Student stud1 = new Student("Alice Johnson", 101, 'A');
        Student stud2 = new Student("Bob Smith", 102, 'B');

        stud1.displayStudentDetails();
        System.out.println("-------------------");
        stud2.displayStudentDetails();

        Student.displayTotalStudents();

        System.out.println("\nUpdating Grades:");
        stud2.updateGrade('A');
    }
}
