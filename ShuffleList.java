import java.util.LinkedList;
import java.util.Collections;

public class ShuffleList {
    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList<>();

        // Adding items to the list
        myList.add("Alice");
        myList.add("Bob");
        myList.add("Charlie");
        myList.add("Diana");
        myList.add("Eva");

        System.out.println("Original List:");
        System.out.println(myList);

        // Shuffling the list
        Collections.shuffle(myList);

        System.out.println("Shuffled List:");
        System.out.println(myList);
    }
}
