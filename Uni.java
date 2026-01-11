import java.util.*;

class Student implements Comparable<Student> {
    private String name;
    private String studentId;
    private double gpa;

    public Student(String name, String studentId, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public int compareTo(Student other) {
        return this.studentId.compareTo(other.studentId);
    }

    @Override
    public String toString() {
        return "Name: " + name + ", ID: " + studentId + ", GPA: " + gpa;
    }
}

public class Uni {

    private static TreeSet<Student> studentSet = new TreeSet<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Student");
            System.out.println("2. Search Student by ID");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter student's name:");
                    String name = scanner.nextLine();
                    System.out.println("Enter student's ID:");
                    String studentId = scanner.nextLine();
                    System.out.println("Enter student's GPA:");
                    double gpa = scanner.nextDouble();
                    Student student = new Student(name, studentId, gpa);
                    studentSet.add(student);
                    System.out.println("Student added successfully.");
                    break;
                case 2:
                    System.out.println("Enter student's ID to search:");
                    String idToSearch = scanner.nextLine();
                    boolean found = false;
                    for (Student s : studentSet) {
                        if (s.getStudentId().equals(idToSearch)) {
                            System.out.println("Student found: " + s);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Student not found.");
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        }
    }
}