import java.util.Scanner;
import java.util.TreeSet;
class Student implements Comparable<Student> {
    private String name;
    private int id;
    private double moadel;
    public Student(String name , int id , double moadel){
        this.name=name;
        this.id=id;
        this.moadel=moadel;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public double getMoadel(){
        return moadel;
    }
    public int compareTo(Student other) {
        return Integer.compare(this.id, other.id);
    }

    public String toString() {
        return "Name: " + name + ", id: " + id + ", Moadel: " + moadel;
    }
}
public class University{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        TreeSet<Student> studentSet=new TreeSet<>();
        int numberOfStudent = input.nextInt();
        for (int i=0 ; i<numberOfStudent ; i++){
            String name=input.next();
            int id=input.nextInt();
            double moadel=input.nextDouble();
            Student student=new Student(name, id , moadel);
            studentSet.add(student);
        }

        //سرچ از روی id
        int searchId=input.nextInt();
        boolean found=false;
        for(Student i: studentSet){
            if(searchId==i.getId()){
                System.out.println("Student Found");
                System.out.println("name :" + i.getName()+ "\nId : "+ i.getId()+"\nmoadel :" + i.getMoadel());
               found=true;
            }else{
                found=false;
            }

        }
        if(found==false){
            System.out.println("Student not Found");
        }

    }
}