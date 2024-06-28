import java.util.LinkedList;
import java.util.Queue;

public class CarQueue {
    public static void main(String[] args) {
        Queue<String> carQueue = new LinkedList<>();

        carQueue.add("BMW");
        carQueue.add("Toyota");
        carQueue.add("Honda");

        System.out.println("Queue: " + carQueue);
        String firstCar = carQueue.poll();
        System.out.println("Queue: " + carQueue);
        String secondCar = carQueue.poll();
        System.out.println("Queue: " + carQueue);
        String thirdCar = carQueue.poll();
        System.out.println("Queue: " + carQueue);
        
        if (carQueue.isEmpty()) {
            System.out.println("Empty.");
        } else {
            System.out.println("Not Empty.");
        }
    }
}
