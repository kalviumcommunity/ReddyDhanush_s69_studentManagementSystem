

public class Main {
    public static void main(String[] args) {
        // Create array of Students
        Student[] students = new Student[2];
        students[0] = new Student();
        students[0].setDetails(1, "Reddy Dhanush");
        students[1] = new Student();
        students[1].setDetails(2, "John Doe");

        // Create array of Courses
        Course[] courses = new Course[2];
        courses[0] = new Course();
        courses[0].setDetails(101, "Java Programming");
        courses[1] = new Course();
        courses[1].setDetails(102, "Database Systems");

        // Display all Students
        System.out.println("Students:");
        for (Student s : students) {
            s.displayDetails();
        }

        // Display all Courses
        System.out.println("\nCourses:");
        for (Course c : courses) {
            c.displayDetails();
        }
    }
}
