import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;
public class SafEMashin{
    public static void main(String[] args){
        Queue<Object> carqueue= new LinkedList<>();
        // برای صف ماشین ها میتوانیم از کاربر هم تعداد و نام ماشین ها را بگیریم
        carqueue.add("Mazda");
        carqueue.add("BMW");
        carqueue.add("Benz");
        carqueue.add("Ford");
        carqueue.add("Land Cruise");
        //چاپ محتویات راه اول:
        System.out.println(carqueue);
        //چاپ محتویات راه دوم :
        Iterator<Object> iter=carqueue.iterator();
        while(iter.hasNext()){
            Object itervalue =iter.next();
            System.out.println(itervalue + "\n");
        }

        //خارج کردن ماشین ها به ترتیب و چک کردن خالی بودن یا نبودن صف

    while(! carqueue.isEmpty()){
        Object car=carqueue.poll();
        System.out.println(car);
        System.out.println(carqueue);
        if(carqueue.isEmpty()){
            System.out.println("Queue is Empty\n");
        }
        else{
            System.out.println("Queue is not Empty\n");
        }

    }



    }
}