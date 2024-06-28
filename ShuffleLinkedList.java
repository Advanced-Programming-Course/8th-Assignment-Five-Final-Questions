import java.util.Collections;
import java.util.LinkedList;

public class ShuffleLinkedList {
    public static void main(String[] args) {
        LinkedList<Object> list = new LinkedList<>();
        list.add(45);
        list.add("GFG");
        list.add(2.56f);
        list.add(3.14);
        list.add("Ali");
        list.add(true);
        System.out.println("Before: " + list.toString());
        Collections.shuffle(list);
        System.out.println("After: " + list.toString());
    }
}
