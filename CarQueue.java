import java.util.LinkedList;
import java.util.Queue;

public class CarQueue {
    public static void main(String[] args) {
        Queue<String> carQueue = new LinkedList<>();

        // Adding cars to the queue
        carQueue.add("Car 1");
        carQueue.add("Car 2");
        carQueue.add("Car 3");
        carQueue.add("Car 4");

        System.out.println("Cars in the queue:");
        System.out.println(carQueue);

        // Removing cars from the queue
        while (!carQueue.isEmpty()) {
            System.out.println("Removing: " + carQueue.remove());
        }

        // Checking if the queue is empty
        if (carQueue.isEmpty()) {
            System.out.println("The queue is now empty.");
        } else {
            System.out.println("The queue is not empty.");
        }
    }
}
