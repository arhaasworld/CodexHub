package Collections;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class LaunchInteratorFailSafe {

    public static void main(String[] args){

        CopyOnWriteArrayList cwr = new CopyOnWriteArrayList<>();

        cwr.add(100);
        cwr.add(200);
        cwr.add(300);
        cwr.add(400);
        cwr.add(500);

        System.out.println(cwr);

       Iterator itr = cwr.iterator();

       while (itr.hasNext()){
           System.out.println(itr.next());
           cwr.add(45);
       }
    }
}
