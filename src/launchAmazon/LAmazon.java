package launchAmazon;

public class LAmazon {
    public static void main(String args){
        Amazon az = new Amazon();

        Fedex fedex = new Fedex();
        az.setService(fedex);

        Ups up = new Ups();
        az.setService(up);

        FirstFlight ff = new FirstFlight();
        az.setService(ff);

        Boolean status = az.deliverTheProduct(555.00);

        if(status){
            System.out.println("product delivery is successful");
        }
        else {
            System.out.println("product did not deliverd sorry!");
        }
    }
}
