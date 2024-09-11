package launchAmazon;

public class Amazon {

    private IDeleiveryService service;

    public void setService(IDeleiveryService service) {
        this.service = service;
    }

    public Boolean deliverTheProduct(Double amount){

        return service.deliverProduct(amount);
    }
}
