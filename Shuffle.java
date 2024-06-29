import java.util.LinkedList;
import java.util.Random;

class Main {
    public static void main(String[] args) {
        LinkedList<Integer> set = new LinkedList<>();

        set.add(0);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(9);
        set.add(10);

        Random rand = new Random();
        for (int i = 0; i < set.size(); i++) {
            int s = rand.nextInt(set.size());
            int tmp = set.get(i);
            set.set(i, set.get(s));
            set.set(s, tmp);
        }

        for (int el : set) {
            System.out.println(el);
        }
    }
} 
