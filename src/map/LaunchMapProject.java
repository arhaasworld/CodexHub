package map;

import java.util.*;

class Passport{

    private String name;
    private String city;

    private String country;

    public Passport(String name, String city, String country) {
        super();
        this.name = name;
        this.city = city;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Passport[" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ']';
    }
}


public class LaunchMapProject {
    public static void main(String[] args){
        System.out.println("Passport information application ");
        Passport p1 = new Passport("Franky", "Dallas", "USA");
        Passport p2 = new Passport("Arhaa", "NewYork", "USA");
        Passport p3 = new Passport("Hamza","Warangal", "India");


        Integer id1 = Integer.valueOf(100);
        Integer id2 = Integer.valueOf(101);
        Integer id3 = Integer.valueOf(103);



        HashMap<Integer, Passport> hash1 = new HashMap<>();
        hash1.put(id1,p1);
        hash1.put(id2,p2);
        hash1.put(id3,p3);


        Scanner scan = new Scanner(System.in);
        System.out.println("Kindly Enter your passport number ");
        Integer userInfo = scan.nextInt();

       Set entry = hash1.entrySet();
       Boolean flag = false;
       Iterator itr = entry.iterator();
       while (itr.hasNext())
        {
            Map.Entry pair = (Map.Entry) itr.next();

            Integer key= (Integer) pair.getValue();
            System.out.println(key);

            if(key.equals(userInfo)){
                System.out.println("Please find your passport details below");
                System.out.println(pair.getValue());
            }
        }if(flag==false){
            System.out.println("unable to fetch your data. Sorry try again ");
        }



    }
}
