package Collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class LaunchListIterator {

    public static void main(String[] ags){

        ArrayList arl = new ArrayList<>();

        arl.add(100);
        arl.add(200);
        arl.add(300);
        arl.add(400);
        arl.add(500);
        arl.add(600);

//
//        ListIterator litr = arl.listIterator();
//
//        while (litr.hasNext()){
//            System.out.println(litr.next());
//        }



        ListIterator litr = arl.listIterator(arl.size());

        while (litr.hasPrevious()){
            System.out.println(litr.previous());
        }
    }
}
