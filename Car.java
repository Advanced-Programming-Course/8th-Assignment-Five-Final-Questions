import java.util.*;

public class Car {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Queue<String> cars = new LinkedList<>();

        String car;
        System.out.println("Type the car you want! if you are finished typing the cars, type \"Finish\".");
        do {
            car = scan.next();
            if (car.equals("Finish")) {
                break;
            }
            cars.add(car);
        } while (!car.equals("Finish"));

        Iterator<String> carIterator = cars.iterator();

        System.out.print("Cars: ");
        while (carIterator.hasNext()) {
            System.out.print(carIterator.next() + ", ");
        }
        System.out.println();

        while (!cars.isEmpty()) { // polling cars from the queue
            String removedCar = dequeue(cars);
            System.out.println(removedCar+ " is removed!");
        }

        if (cars.isEmpty()) {
            System.out.println("All of the cars have left!");
        } else {
            System.out.println(cars);
        }
    }

    public static void enqueue(Queue<String> cars,String car) {
        cars.add(car);
    }
    public static String dequeue(Queue<String> cars) {
        return cars.poll();
    }
}
