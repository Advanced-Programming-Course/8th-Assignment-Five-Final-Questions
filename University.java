import java.util.TreeSet;

class Student implements Comparable<Student> {
    private String name;
    private int number;
    private double score;

    public Student(String name, int number, double score){
        this.name=name;
        this.number=number;
        this.score=score;
    }

    public String getName(){
        return name;
    }

    public int getNumber(){
        return number;
    }

    public double getScore(){
        return score;
    }

    public int compareTo(Student other) {
        return Integer.compare(number, other.getNumber());
    }

    public String toString() {
        return "name: " + name + "\n"+ "number: " + number + "\n" + "score: " + score;
    }
}

class Main {
    private static Student find(TreeSet<Student> students, int number) {
        for (Student student : students) {
            if (student.getNumber() == number) {
                return student;
            } 
        }
        return new Student("", 0, 0);
    }

    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>();

        students.add(new Student("jafar", 1, 10));
        students.add(new Student("javad", 2, 13));
        students.add(new Student("janis", 3, 11.5));

        System.out.println(find(students, 2).toString());
    }
} 
