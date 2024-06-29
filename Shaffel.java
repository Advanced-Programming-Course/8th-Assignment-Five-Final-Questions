import java.util.*;
public class Shaffel {
    public static void main(String[] args){
        LinkedList<Object> linkedList = new LinkedList<>();
        Scanner input=new Scanner(System.in);
        int number=input.nextInt();
        for (int i = 0; i < number; i++) {
            String in = input.next();
            linkedList.add(in);
        }
        System.out.println( linkedList);
        Collections.shuffle(linkedList);
        System.out.println( linkedList);

    }
}

