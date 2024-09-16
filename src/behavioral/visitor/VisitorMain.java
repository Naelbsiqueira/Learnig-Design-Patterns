package behavioral.visitor;
/*Padrão Visitor: Permite adicionar operações a uma estrutura de objetos
sem alterar suas classes. Define uma interface Visitor para operações e uma
interface Element com o método accept que chama o método correspondente do Visitor.
Isso permite estender funcionalidades sem modificar as classes dos elementos.*/

public class VisitorMain {
    public static void main(String[] args) {
        AssignmentNode n1 = new AssignmentNode();
        n1.setTypeLeftHandVar("String");
        n1.setTypeRightHandExp("String");

        VariableRefNode n2 = new VariableRefNode();
        n2.setNameVar("Minha variável");

        NodeVisitor v1 = new TypeChekingVisitor();
        NodeVisitor v2 = new CodeGeneratingVisitor();
        n1.accept(v1);
        n2.accept(v1);

        n1.accept(v2);
        n2.accept(v2);

    }
}
