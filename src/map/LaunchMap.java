package map;

import java.util.*;

interface Animal{
    interface Dog{
        static void eat(){
            System.out.println("static method of inner interface");
        }
    }
}
public class LaunchMap {
    public static void main(String[] args) {
//        Animal.Dog.eat();

        HashMap<Integer, String> hash = new HashMap<>();
        hash.put(1, "Java");
        hash.put(2, "SpringBoot");
        hash.put(3, "Python");

        System.out.println(hash);

        String data = hash.get(3);

        System.out.println(data);

        System.out.println("*********************");

        // i am accessing all the values of my collection in below code. By using Collections
        //when using collection we can use Iterator concept

        Collection<String> values = hash.values();
        Iterator<String> itr = values.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("*************");

        Set<Integer> keys = hash.keySet();
        Iterator<Integer> itr1 = keys.iterator();
        while (itr1.hasNext()) {
            System.out.println(itr1.next());
        }

        //to get both key and value

        Set entry = hash.entrySet();
        Iterator itr2 = entry.iterator();
        while (itr2.hasNext()) {
            Map.Entry pair = (Map.Entry) itr2.next();
            System.out.println("key : " + pair.getKey() + " value : " + pair.getValue());
        }

    }

}
