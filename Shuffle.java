import java.util.*;

public class Shuffle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedList<Object> myLinkedList = new LinkedList<>();

        Object value;
        System.out.println("Add your elements! if you don't want to add more, type \"Finish\".");
        do {
            value = scan.next();
            if (value.equals("Finish")) {
                break;
            }
            myLinkedList.add(value);
        } while (!value.equals("Finish"));

        System.out.println("Main LinkedList: "+myLinkedList);

        Collections.shuffle(myLinkedList);
        System.out.println("Shuffled LinkedList: "+myLinkedList);
    }
}
