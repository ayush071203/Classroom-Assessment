public class Course {
    private String courseName;
    private int duration; 
    private double fee;
    private static String instituteName = "Global Academy";

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Institute: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: $" + fee);
    }

    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    public static void main(String[] args) {
        Course course1 = new Course("Java Programming", 10, 500.0);
        Course course2 = new Course("Data Science", 12, 750.0);

        System.out.println("Before Updating Institute Name:");
        course1.displayCourseDetails();
        System.out.println();
        course2.displayCourseDetails();
        System.out.println();

        Course.updateInstituteName("Tech Institute");

        System.out.println("After Updating Institute Name:");
        course1.displayCourseDetails();
        System.out.println();
        course2.displayCourseDetails();
    }
}
