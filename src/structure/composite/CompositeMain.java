package structure.composite;
/*Padrão Composite: É um padrão de design estrutural que permite
tratar objetos individuais e composições de objetos de forma uniforme.
Ele organiza objetos em uma estrutura de árvore, onde cada nó pode ser
um objeto simples ou uma composição de objetos, facilitando a manipulação
e a interação entre eles. Ideal para representar hierarquias e relações
"parte-todo" de forma recursiva.*/

public class CompositeMain {
    public static void main(String[] args) {
        Employee gerente = new Manager("Nael Bernardo");
        Employee atendente = new Attendant("Sabrina Leal");
        Employee caixa = new Boxe("Marlene Costa");
        gerente.add(atendente);
        gerente.printNameEmployee();
        gerente.add(caixa);
        gerente.printNameEmployee();
        gerente.remove(atendente);

    }
}
