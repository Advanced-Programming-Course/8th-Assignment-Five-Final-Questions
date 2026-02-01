import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class ShuffleLinkedList {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the list:");
        int numberOfElements = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the elements :");
        for (int i = 0; i < numberOfElements; i++) {
            String element = scanner.nextLine();
            list.add(element);
        }

        System.out.println("Original list: " + list);
        Collections.shuffle(list);
        System.out.println("Shuffled list: " + list);
    }
}