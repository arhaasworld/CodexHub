package methodOverloading;

// method overlaoding with this keyword

public class MethodOL {

    private int id;
    private String name;
    private String city;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public static void main (String args[]){

       MethodOL ml= new MethodOL();

       ml.setId(1);
       ml.setCity("PA");
       ml.setName("arhaa");

        System.out.println(ml.getId());
        System.out.println(ml.getName());
        System.out.println(ml.getCity());



    }

}
