import java.util.*;

public class Cars {
    public static void main(String[] args){
        Queue<String> cars = new LinkedList<>();
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        for (int i = 0; i < n; i++) {
            cars.add(scn.next());
        }

        for (int i = 0; i < n; i++) {
            System.out.println(cars.poll());
        }

        if (cars.isEmpty()){
            System.out.println("is empty");
        }
        else {
            System.out.println("is not empty");
        }
    }
}
