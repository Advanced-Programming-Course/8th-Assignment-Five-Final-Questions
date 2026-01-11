import java.util.Collections;
import java.util.LinkedList;

public class Shuffle {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        System.out.println(linkedList);

        shuffleLinkedList(linkedList);

        System.out.println(linkedList);
    }

    public static void shuffleLinkedList(LinkedList<Integer> linkedList) {
        Collections.shuffle(linkedList);
    }
}