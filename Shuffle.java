import java.util.Collections;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Scanner;
public class Shuffle{
    public static void main(String[] args){
        LinkedList<Object> linkedList = new LinkedList<>();
        Scanner input=new Scanner(System.in);
        int number=input.nextInt();
        for (int i = 0; i < number; i++) {
            String in = input.next();
            linkedList.add(in);
        }
        System.out.println("Linked list before : " + linkedList);
        Collections.shuffle(linkedList);
        System.out.println("Linked List after : " + linkedList);

    }
}