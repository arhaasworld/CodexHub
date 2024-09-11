package methodOverloading;

//method overlaoding with constructor
public class MethodOlThis {

   private int id;
    private String name;
   private String city;

   MethodOlThis(int id, String name, String city){
       this.id=id;
       this.name=name;
       this.city =city;
   }

   MethodOlThis(){
       this.id = 2;
       this.name= "moh";
       this.city = "bensalem";
   }

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

    public static void main(String args[]){

       MethodOlThis mlt = new MethodOlThis(1, "arhaa", "PA");
        System.out.println(mlt.getId());
        System.out.println(mlt.getName());
        System.out.println(mlt.getCity());

        System.out.println("********method overloading with zero params *********");
        MethodOlThis mlts = new MethodOlThis();
        System.out.println(mlts.getId());
        System.out.println(mlts.getCity());
        System.out.println(mlts.getName());

    }
}
