package behavioral.visitor;

public abstract class NodeVisitor {
    public abstract void visitAssignment(AssignmentNode n);
    public abstract void visitVariableRef(VariableRefNode n);
}
