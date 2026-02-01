import java.util.LinkedList;
import java.util.Queue;

public class CarQueue {

    public static void main(String[] args) {
        Queue<String> carQueue = new LinkedList<>();

        enqueue(carQueue, "Audi");
        enqueue(carQueue, "Honda");
        enqueue(carQueue, "Ford");
        enqueue(carQueue, "Rolls-Royce");

        printQueueContents(carQueue);

        while (!carQueue.isEmpty()) {
            String removedCar = dequeue(carQueue);
            System.out.println(removedCar+" Removed ");
        }

        if (carQueue.isEmpty()) {
            System.out.println("The queue is empty.");
        } else {
            System.out.println("The queue is not empty.");
        }
    }
    public static void enqueue(Queue<String> queue, String car) {
        queue.add(car);
    }
    public static String dequeue(Queue<String> queue) {
        return queue.poll();
    }
    public static void printQueueContents(Queue<String> queue) {
        System.out.println("The queue: " + queue);
    }
}