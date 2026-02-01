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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return studentId.equals(student.studentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId);
    }

    @Override
    public String toString() {
        return "name = " + name +
                ", studentId = " + studentId +
                ", gpa = " + gpa ;

    }
}

public class University {

    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of students:");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter Info for student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Student ID: ");
            String studentId = scanner.nextLine();
            System.out.print("GPA: ");
            double gpa = scanner.nextDouble();
            scanner.nextLine();

            students.add(new Student(name, studentId, gpa));
        }

        System.out.print("Enter the Student ID to search for: ");
        String searchId = scanner.nextLine();


        Student searchStudent = new Student("", searchId, 0);
        Student foundStudent = students.ceiling(searchStudent);

        if (foundStudent != null && foundStudent.getStudentId().equals(searchId)) {
            System.out.println(foundStudent);
        } else {
            System.out.println("Student with ID " + searchId + " not found.");
        }

    }
}