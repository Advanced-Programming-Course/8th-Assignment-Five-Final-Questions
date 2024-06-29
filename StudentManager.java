import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

class Student {
    private final String name;
    private final int studentNumber;
    private final double gpa;

    public Student(String name, int studentNumber, double gpa) {
        this.name = name;
        this.studentNumber = studentNumber;
        this.gpa = gpa;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Student Number: " + studentNumber + ", GPA: " + gpa;
    }
}

class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.getStudentNumber(), s2.getStudentNumber());
    }
}

public class StudentManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<Student> students = new TreeSet<>(new StudentComparator());

        // Receiving student details from user
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Student Number: ");
            int studentNumber = scanner.nextInt();

            System.out.print("GPA: ");
            double gpa = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            students.add(new Student(name, studentNumber, gpa));
        }

        // Searching for a student by student number
        System.out.print("Enter student number to search: ");
        int searchStudentNumber = scanner.nextInt();

        Student searchStudent = null;
        for (Student student : students) {
            if (student.getStudentNumber() == searchStudentNumber) {
                searchStudent = student;
                break;
            }
        }

        if (searchStudent != null) {
            System.out.println("Student found: " + searchStudent);
        } else {
            System.out.println("Student with student number " + searchStudentNumber + " not found.");
        }

        scanner.close();
    }
}



