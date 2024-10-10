package Collections;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Cricketer{
    int age;
    String name;
    double avg;

    public Cricketer(Integer age, String name, double avg) {
        super();
        this.age = age;
        this.name = name;
        this.avg = avg;
    }

    @Override
    public String toString() {
        return "Cricketer[" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", avg=" + avg +
                ']';
    }
}


class Alpha implements Comparator<Cricketer>{

    @Override
    public int compare(Cricketer o1, Cricketer o2) {

        if(o1.avg>o2.avg){
            return 1;

        } else {
            return -1;
        }
    }
}


public class ComplexSorting {

    public static void main(String[] args) {

        Cricketer c1 = new Cricketer(25, "Virat", 84.8);
        Cricketer c2 = new Cricketer(35, "Dhoni", 75.8);
        Cricketer c3 = new Cricketer(36, "tendulkar", 66.9);


        ArrayList<Cricketer> list = new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        System.out.println(list);

//        Alpha a = new Alpha();
//        Collections.sort(list,a);
//
//        System.out.println(list);
//        Comparator<Cricketer> c = new Comparator<Cricketer>()
////        {
////            @Override
////            public int compare(Cricketer o1, Cricketer o2) {
////
////                if(o1.avg>o2.avg){
////                    return 1;
////
////                } else {
////                    return -1;
////                }
////            }
////        };
////
////        Collections.sort(list,c);
////        System.out.println(list);

        // using lambda expression

                Comparator<Cricketer> c = (Cricketer o1, Cricketer o2)-> {

                    if (o1.avg > o2.avg) {
                        return 1;

                    } else {
                        return -1;
                    }
                };

        Collections.sort(list,c);
        System.out.println(list);

    }

}
