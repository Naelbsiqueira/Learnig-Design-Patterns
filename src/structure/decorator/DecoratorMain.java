package structure.decorator;
/*Padrão Decorator: Permite adicionar comportamentos a objetos dinamicamente,
sem alterar sua estrutura original. Ele envolve a composição de classes,
onde decoradores encapsulam o objeto original, estendendo suas funcionalidades.
Isso proporciona maior flexibilidade e reutilização de código.*/

public class DecoratorMain {
        public static void main(String[] args) {
            Address address = new Address("Avenida Central", "Zona 1", "São Paulo",
                    "SP", "12345-678");
            Addresser addresser = new AddresserSimple();
            addresser = new AddresserToUpperCase(addresser);

            String addressupcase =addresser.prepareAddress(address);
            System.out.println(addressupcase);
        }

}
