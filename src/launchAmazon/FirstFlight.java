package launchAmazon;

public class FirstFlight implements IDeleiveryService{
    @Override
    public Boolean deliverProduct(Double amount) {
        System.out.println("product delivered through first flight and amount paid is " + amount);
        return true;
    }
}
