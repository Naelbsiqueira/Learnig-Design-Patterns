package structure.decorator;

class AddresserSimple implements Addresser{
    public String prepareAddress(Address address){
        StringBuilder sb = new StringBuilder();
        sb.append(address.avenue);
        sb.append("\n");
        sb.append(address.zone);
        sb.append("\n");
        sb.append(address.city);
        sb.append("\n");
        sb.append(address.uf);
        sb.append("\n");
        sb.append(address.cep);
        return sb.toString();

    }
}
