package structure.decorator;

public class AddresserToUpperCase implements Addresser {
    Addresser addresser;
    public AddresserToUpperCase(Addresser addresser){
        super();
        this.addresser = addresser;
    }
    @Override
    public String prepareAddress(Address address){
        return addresser.prepareAddress(address).toUpperCase();

    }
}
