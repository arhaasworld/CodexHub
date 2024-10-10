package generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Human{
    int age;

    public void disp(){
        System.out.println("Humans are Gods awesome creatures");
    }

}

class Students extends Human{

}

class Employee1{


}



public class LaunchGenerics3 {
    public static void main(String[] args){

        Human h = new Human();

        Students s = new Students();

        h =  s;

        Employee1 e = new Employee1();

//        ArrayList<Human> hlist =new ArrayList<>();
//
//        ArrayList<Students> slist = new ArrayList<>();


       // hlist = slist; //ce not allowed


//        ArrayList<?> hlist = new ArrayList<>(); //unknown wildcard(?) it will allow all the child classes
//        ArrayList<Students> slist = new ArrayList<>();
//        ArrayList<Employee1> elist = new ArrayList<>();
//        hlist = slist;
//        hlist = elist;


//        ArrayList<? extends Human> hlist = new ArrayList<>(); // upperbound it will allow Human type or child classes of Human
//        ArrayList<Students> slist = new ArrayList<>();
//        ArrayList<Employee1> elist = new ArrayList<>();
//        ArrayList<Object> objlist = new ArrayList<>();
//        hlist = slist; // allowed because Student is child of Human
    //    hlist = elist; // it will not allow because employee1 is not child type of human or it is not a human type
    //    hlist = objlist; // not allowed because object is parent of human


//        ArrayList<? super Human> hlist1 = new ArrayList<>(); //lowerbound will allow human type or parent of human type
//        ArrayList<Students> slist1 = new ArrayList<>();
//        ArrayList<Employee1> emp1 = new ArrayList<>();
//        ArrayList<Object> obj1 = new ArrayList<>();

 //       hlist1 = slist1;// it will not allow because student is child of human
        // hlist1 = emp1; // it will not allow because employee is neither a human type or it's a parent of human
//        hlist1 = obj1; // object is parent of human so it is allowed

//        ArrayList<Human> hlist = new ArrayList<>();
//        hlist.add(new Human());
//        hlist.add(new Human());
//        hlist.add(new Human());
//        invokeDisp(hlist);
//
//        ArrayList<Students> slist = new ArrayList<>();
//        slist.add(new Students());
//        slist.add(new Students());
//        slist.add(new Students());
//        invokeDisp(slist);

//        ArrayList<Employee1> elist = new ArrayList<>();
//        elist.add(new Employee1());
//        elist.add(new Employee1());
//        elist.add(new Employee1());
//        invokeDisp(elist); // it will get error because this method is expecting only human type or child of human

    }

    public static void invokeDisp(List<? extends Human> list){
        for (Human h : list){
            System.out.println(h);
        }

    }
}
