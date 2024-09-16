package behavioral.visitor;

public class AssignmentNode extends Node {
    private String typeLeftHandVar;
    private String typeRightHandExp;
    @Override
    public void accept(NodeVisitor v) {
        v.visitAssignment(this);
    }

    public String getTypeLeftHandVar() {
        return typeLeftHandVar;
    }

    public String getTypeRightHandExp() {
        return typeRightHandExp;
    }

    public void setTypeLeftHandVar(String typeLeftHandVar) {
        this.typeLeftHandVar = typeLeftHandVar;
    }

    public void setTypeRightHandExp(String typeRightHandExp) {
        this.typeRightHandExp = typeRightHandExp;
    }
}
