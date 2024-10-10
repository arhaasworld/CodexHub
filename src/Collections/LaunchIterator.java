package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class LaunchIterator {
    public static void main(String[] args){

        ArrayList al1 = new ArrayList();

        al1.add(100);
        al1.add(200);
        al1.add(300);
        al1.add(400);

     Iterator itr =  al1.iterator();

     while (itr.hasNext()){
         System.out.println(itr.next());
         al1.add(44);
     }
    }
}
