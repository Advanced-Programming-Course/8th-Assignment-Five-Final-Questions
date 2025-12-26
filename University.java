public class Student implements Comparable<Student> {
    private String Name;
    private int ID;
    private Double GPA;
    public Student (String Name, int ID, Double GPA){
        this.Name = Name;
        this.ID = ID;
        this.GPA = GPA;
    }
    public String getName() {
        return Name;
    }
    public void setName(String Name){
        this.Name = Name;
    }
    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public Double getGPA() {
        return GPA;
    }
    public void setGPA(Double GPA) {
        this.GPA = GPA;
    }

    public int compareTo(Student other) {
        return Integer.compare(this.ID, other.ID);
    }
    public String toString() {
        return "Name: " + Name + ", Student ID: " + ID + ", GPA: " + GPA;
    }
}

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Student> students = new TreeSet<>();

        System.out.println("Enter number of students:");
        int numberOfStudents = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.print("Name: ");
            String Name = sc.nextLine();
            System.out.print("Student ID: ");
            int ID = sc.nextInt();
            System.out.print("GPA: ");
            double GPA = sc.nextDouble();
            sc.nextLine();

            students.add(new Student(Name, ID, GPA));
        }

        System.out.print("Enter student ID to search: ");
        int searchID = sc.nextInt();
        Student searchStudent = new Student("", searchID, 0.0);

        Student result = students.ceiling(searchStudent);

        if (result != null && result.getID() == searchID) {
            System.out.println("Student found: " + result);
        } else {
            System.out.println("Student not found.");
        }
    }
}
