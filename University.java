import java.util.*;

class Student {
    private String name;
    private int studentId;
    private double gpa;

    Student (String name, int studentId, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.gpa = gpa;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public int getStudentId() {
        return studentId;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public double getGpa() {
        return gpa;
    }
    public String showDetails(int studentId) {
        return "\nname: "+ this.name +"\nID: "+ this.studentId + "\nGPA: "+ this.gpa;
    }
}
class CompareStudents implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return Integer.compare(student1.getStudentId(),student2.getStudentId());
    }
}


public class University {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>(new CompareStudents());
        Scanner scan = new Scanner(System.in);

        System.out.print("Type the number of students you want to add: ");
        int studentNum = scan.nextInt();
        for (int i = 0; studentNum > i; i++) {
            System.out.print("Enter student's name: ");
            String studentName = scan.next();

            System.out.print("Enter student's ID: ");
            int studentId = scan.nextInt();

            System.out.print("Enter student's GPA: ");
            double studentGpa = scan.nextDouble();

            students.add(new Student(studentName, studentId, studentGpa));
            System.out.println("---------------------------");

        }

        System.out.print("Enter the student ID you want to search: ");
        int search = scan.nextInt();

        List<Student> studentList = new ArrayList<>(students);
        for (int i = 0; studentNum > i; i++) {
            int searchedStudentID = studentList.get(i).getStudentId();
            if (search == searchedStudentID) {
                System.out.println(studentList.get(i).showDetails(searchedStudentID));
            }
        }
    }
}
