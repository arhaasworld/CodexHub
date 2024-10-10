package generics;

import java.util.ArrayList;

public class LaunchGenerics {

    public static void main(String[] args) {

        int ar[] = new int[3];

        ar[0] = 14;
        ar[1] = 24;
        ar[2] = 34;


       int data = ar[0];

        System.out.println(data);


        String [] str = new String[3];

        str[0] = "Java";
        str[1] ="Microservices";
        str[2] = "Python";

       String info = str[2];

        System.out.println(info);

        System.out.println("******************");


        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Microrservcies");
        list.add("Phyton");

        for(String d: list){
            System.out.println(d);
        }

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Moh", "PA"));
        employees.add(new Employee(2,"Arhaa", "CA"));
        employees.add(new Employee(3, "Din", "Bensalem"));


        for(Employee e: employees){
            System.out.println(e);

        }





    }
}
