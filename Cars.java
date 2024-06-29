import java.util.*;
public class Main {
    public static void main(String[] args) {
        Queue<String> Cars = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            Cars.add(sc.next());
        }

        for (int i = 0; i < n; i++){
            System.out.println(Cars.poll());
        }

        if (Cars.isEmpty()) {
            System.out.println("is empty");
        }
        else {
            System.out.println("is not empty");
        }
    }
}
