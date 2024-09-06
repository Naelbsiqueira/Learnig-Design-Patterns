package creational.factorymethod;
/*Padrão Factary Method: Define uma interface para criar objetos,
mas deixa as subclasses decidirem que classe instanciar. Esse padrão
permite adiar a instaciação para subclasses. Os objetos recem criados utilizam
 uma interface em comum. Neste padrão cria-se objetos sem expor a lógica
 de programação.*/

public class CurrencyFactory {
    public static Currency newCurreny(Country country){
        switch (country) {
            case BRAZIL:
                return new Real();
            case USA:
                return new Dollar();
            default:
                throw new IllegalArgumentException("No currency found for this country");
        }
    }
}
