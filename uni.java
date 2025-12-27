import java.util.Scanner;
import java.util.*;

public class uni {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int studentsCount = scn.nextInt();
        TreeSet<student> studentsTreeSet = new TreeSet<>();

        for (int i=0 ; i < studentsCount ; i++){
            String name = scn.next();
            int id = scn.nextInt();
            double gpa = scn.nextDouble();
            student student=new student(name, id , gpa);
            studentsTreeSet.add(student);
        }
    }
    public static student searchId(int Id, TreeSet<student> studentsTreeSet){
        student st = new student("john", 00, 0.00);
        for (student i : studentsTreeSet){
            if (i.id == Id){
                st = i;
            }
        }
        return st;
    }

    public static void printInfo(student st){
        System.out.println("name :" + st.name+ "Id : "+ st.id+"gpa :" + st.gpa);
    }
}

class student {
    String name;
    int id;
    double gpa;
    public student(String name , int id , double gpa){
        this.name=name;
        this.id=id;
        this.gpa = gpa;
    }
}
