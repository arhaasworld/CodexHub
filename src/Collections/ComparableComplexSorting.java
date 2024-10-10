package Collections;


import java.util.ArrayList;
import java.util.Collections;

class Cricketer1 implements Comparable<Cricketer1> {
    int age;
    String name;
    double avg;

    public Cricketer1(int age, String name, double avg) {
        super();
        this.age = age;
        this.name = name;
        this.avg = avg;
    }

    @Override
    public String toString() {
        return "Cricketer1[" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", avg=" + avg +
                ']';
    }

    @Override
    public int compareTo(Cricketer1 o) {
        if (this.avg > o.avg)
            return 1;
        else {
            return -1;
        }
    }
}
public class ComparableComplexSorting {
    public static void main(String[] args) {

        Cricketer1 c1 = new Cricketer1(25, "Virat", 84.8);
        Cricketer1 c2 = new Cricketer1(35, "Dhoni", 75.8);
        Cricketer1 c3 = new Cricketer1(36, "tendulkar", 66.9);


        ArrayList<Cricketer1> list = new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

    }

}
