import java.util.*;
public class shuffle {
    public static void main(String[] args){
        LinkedList<Integer> myLL = new LinkedList<>();
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i = 0; i < n; i++){
            myLL.add(scn.nextInt());
        }
        Collections.shuffle(myLL);
    }

}
