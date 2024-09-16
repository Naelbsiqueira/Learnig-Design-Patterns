package behavioral.observer;
/*Padrão Observer: Permite que um objeto (sujeito) notifique automaticamente
uma lista de objetos dependentes (observadores) sobre mudanças em seu estado.
Os observadores se registram no sujeito para receber atualizações.
Quando o estado do sujeito muda, todos os observadores são atualizados de forma automática.
Isso desacopla o sujeito e os observadores, facilitando a comunicação e a manutenção.*/

public class ObserverMain {
    public static void main(String[] args) {
        ConcreteSubject s = new ConcreteSubject();
        Observer o1 = new ConcreteObserver();
        Observer o2 = new ConcreteObserver();
        s.attatch(o1);
        s.attatch(o2);

        s.setState("Novo Estado 1 ");
        s.setState("Novo Estado 2 ");
    }
}
