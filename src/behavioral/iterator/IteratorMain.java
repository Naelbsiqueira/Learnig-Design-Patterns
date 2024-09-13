package behavioral.iterator;

/*Padrão Iterator: Permite percorrer sequencialmente os elementos de uma coleção,
sem expor sua estrutura interna. Ele define uma interface para acessar itens de
forma controlada, garantindo flexibilidade no modo como a coleção é navegada.
Isso facilita a separação entre a lógica de iteração e a estrutura da coleção.
 */
public class IteratorMain {
    public static void main(String[] args) {
        InterfaceList list = new ReverseList();
        list.appent(10);
        list.appent(20);
        list.appent(30);
        for (Object object : list){
            System.out.println(object);
        }

    }
}
