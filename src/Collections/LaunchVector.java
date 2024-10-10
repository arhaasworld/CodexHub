package Collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class LaunchVector {

    public static void main(String[] args){

        Vector vc = new Vector();
//        we can also use add() or addElement method it will do the same
        vc.addElement(100);
        vc.addElement(200);
        vc.addElement(300);
        System.out.println(vc);

        Iterator itr = vc.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("********************");
//        Both enumeration and vector does the same thing
        Enumeration en = vc.elements();
        while (en.hasMoreElements()) {
            System.out.println(en.nextElement());
        }

    }
}
