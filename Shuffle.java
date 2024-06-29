import java.util.LinkedList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        Collections.shuffle(linkedList);
        System.out.println(linkedList);
    }
}
