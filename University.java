import java.util.TreeSet;

class Student implements Comparable<Student> {
    private int id;
    private String name;
    private double moadel;

    public Student(int id, String name, double moadel) {
        this.id = id;
        this.name = name;
        this.moadel = moadel;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getMoadel() {
        return moadel;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.id, other.id);
    }
}

public class University {
    private TreeSet<Student> students;

    public University() {
        students = new TreeSet<>();
    }

    public void addStudent(int id, String name, double moadel) {
        students.add(new Student(id, name, moadel));
    }

    public String searchStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return "Name: " + student.getName() + ", Moadel: " + student.getMoadel();
            }
        }
        return "Student not found.";
    }

    public static void main(String[] args) {
        University university = new University();
        university.addStudent(1, "Hasan", 3.5);
        university.addStudent(2, "Shima", 3.8);
        university.addStudent(3, "Amir", 3.9);

        System.out.println(university.searchStudentById(2));
        System.out.println(university.searchStudentById(4));
    }
}
