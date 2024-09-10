package structure.facade;
/*Padrão Facade: Oferecer uma interface (Facade) de alto nível que simplifica
a interação com subsistemas complexos, permitindo que os clientes
usem os serviços de forma mais fácil e sem se preocupar com a
complexidade interna ou mudanças na estrutura.*/

public class FacadeMain {
    public static void main(String[] args) {
      EcommerceFacade ecommerceFacade = new EcommerceFacade();
      ecommerceFacade.orderProcess("Iphone", "Nael Bernardo ");
    }
}
