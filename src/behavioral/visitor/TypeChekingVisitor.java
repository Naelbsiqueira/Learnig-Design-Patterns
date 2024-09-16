package behavioral.visitor;

public class TypeChekingVisitor extends NodeVisitor{
    @Override
    public void visitAssignment(AssignmentNode n) {
        if(n.getTypeLeftHandVar().equals(n.getTypeRightHandExp())){
            System.out.println("Tipos compatíveis");
        }else{
            System.out.println("Tipo incompatíveis");
        }
    }

    @Override
    public void visitVariableRef(VariableRefNode n) {
        //Não faz nada;
        System.out.println("type checking da variável não faz nada");
    }
}
