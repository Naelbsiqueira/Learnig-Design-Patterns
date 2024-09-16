package behavioral.visitor;

public class VariableRefNode extends Node{
    private String nameVar;
    @Override
    public void accept(NodeVisitor v) {
        v.visitVariableRef(this);

    }

    public String getNameVar() {
        return nameVar;
    }

    public void setNameVar(String nameVar) {
        this.nameVar = nameVar;
    }
}
