import java.util.LinkedList;
import java.util.Queue;

public class CarQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("Car 1");
        queue.add("Car 2");
        queue.add("Car 3");
        queue.add("Car 4");

        System.out.println(queue);

        while (!queue.isEmpty()) {
            String removedCar = queue.poll();
            System.out.println("delete: " + removedCar);
        }

        if (queue.isEmpty()) {
            System.out.println("queue is empty.");
        } else {
            System.out.println("queue isn't empty.");
        }
    }
}