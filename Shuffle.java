import java.util.*;

public class Shuffle {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 15; i++) {
            list.add(i);
        }
        System.out.println("Original: " + list);
        Collections.shuffle(list);
        System.out.println("Final: " + list);
    }
}
