package launchAmazon;

public class Ups implements IDeleiveryService{
    @Override
    public Boolean deliverProduct(Double amount) {
        System.out.println("product delivered through Ups and amount paid is " + amount);
        return true;
    }
}
