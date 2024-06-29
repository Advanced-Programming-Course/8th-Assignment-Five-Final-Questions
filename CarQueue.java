import java.util.*;

public class CarQueue {
    public static void main(String[] args) {
        Queue<String> carQueue = new LinkedList<>();
        for (int i = 10; i >= 0; i--) {
            carQueue.add("Car " + String.valueOf(i));
        }
        while (!carQueue.isEmpty()) {
            String car = carQueue.poll();
            System.out.println("item " + car + " removed");
        }
        if (carQueue.isEmpty()) {
            System.out.println("The queue is empty now!");
        } else {
            System.out.println("The queue is not empty.");
        }
    }
}
