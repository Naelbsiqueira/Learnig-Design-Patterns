package structure.decorator;

class AddresserBorder implements Addresser{
    Addresser addresser;
    public AddresserBorder(Addresser addresser){
        super();
        this.addresser = addresser;
    }
    @Override
    public String prepareAddress(Address address) {
        String prepareAddress = addresser.prepareAddress(address);
        StringBuilder sb = new StringBuilder();
        sb.append("-------------------------\n");
        prepareAddress.lines().forEach(l -> sb.append("|" + l +"\n"));
        sb.append("-------------------------\n");
        return sb.toString();
    }
}
