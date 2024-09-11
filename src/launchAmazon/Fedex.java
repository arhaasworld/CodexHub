package launchAmazon;

public class Fedex implements IDeleiveryService{
    @Override
    public Boolean deliverProduct(Double amount) {
        System.out.println("product delivered through Fedex and amount paid is " + amount);
        return true;
    }
}
