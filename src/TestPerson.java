
// Test program
public class TestPerson {
    public static void main(String[] args) {
        // Create a Student
        Student student = new Student("Clifford John", 1999, "Computer Science");

        // Create an Instructor
        Instructor instructor = new Instructor("Pheobe Sudaria", 1990, 45000.0);

        // Test methods
        System.out.println("Student: " + student);
        System.out.println("Instructor: " + instructor);

        // Test setter methods
        student.setMajor("Information Technology");
        instructor.setSalary(65000.0);// with december bunos and 13th month pay

        // Test getter methods
        System.out.println("Updated Student: " + student);
        System.out.println("Updated Instructor: " + instructor);
    }
}
