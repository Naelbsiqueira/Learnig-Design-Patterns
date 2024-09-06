package creational.factorymethod;

public class MainFactoryMethod {
    public static void main(String[] args) {
            Currency currency = CurrencyFactory.newCurreny(Country.USA);
        System.out.println(currency.getSymbl());
    }
}
