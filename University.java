import java.util.Scanner;
import java.util.TreeSet;

class Student {
    String name;
    String id;
    double average;

    public Student(String name, String id, double average) {
        this.name = name;
        this.id = id;
        this.average = average;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", ID: " + id + ", Average: " + average;
    }
}

public class University {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<Student> students = new TreeSet<>();

        while (true) {
            System.out.println("Enter student details (name, ID, average). Type 'quit' to stop:");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("quit"))
                break;

            String[] parts = input.split(", ");
            if (parts.length != 3)
                continue;

            String name = parts[0];
            String id = parts[1];
            double average = Double.parseDouble(parts[2]);

            students.add(new Student(name, id, average));
        }

        System.out.println("\nEnter the ID of the student you want to find:");
        String searchId = scanner.nextLine();

        boolean found = false;
        for (Student student : students) {
            if (student.id.equals(searchId)) {
                System.out.println(student);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No student found with ID: " + searchId);
        }

        scanner.close();
    }
}
