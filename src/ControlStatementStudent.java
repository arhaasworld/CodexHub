public class ControlStatementStudent {
    public static void main(String args[]){
        String address = "Hyderabad,India";
        if(address.endsWith("India")){
            if(address.endsWith("calcutta")){
                System.out.println("your city is calcutta");
            } else if (address.endsWith("Hyderabad")) {
                System.out.println("your city is hyderabad");

            } else{
                System.out.println(address.split(",")[0]);
            }
        } else {
            System.out.println("you don't live in India");
        }
    }
}
