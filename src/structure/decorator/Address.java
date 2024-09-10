package structure.decorator;

class Address {
    final String avenue;
    final String zone;
    final String city;
    final   String uf;
    final String cep;

    public Address(String avenue, String zone, String city, String uf, String cep) {
        super();
        this.avenue = avenue;
        this.zone = zone;
        this.city = city;
        this.uf = uf;
        this.cep = cep;
    }
}
