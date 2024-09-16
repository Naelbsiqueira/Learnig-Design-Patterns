package behavioral.visitor;

public abstract class Node {
    public abstract void accept(NodeVisitor v);
}
