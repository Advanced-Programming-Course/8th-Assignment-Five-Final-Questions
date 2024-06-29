import java.util.*;

class Main {
    public static void main(String[] args) {
        Queue<String> cars = new LinkedList<>();

        cars.add("forghoon");
        cars.add("batmobile");
        cars.add("khare charkhdar");

        while (!cars.isEmpty()) {
            System.out.println("Car: " + cars.poll());
        }
    }
}
