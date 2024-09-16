package behavioral.memento;

public class Originator {
    private String state = "";
    public Memento createMemento(){
        System.out.println("Salvo estado = " + state);
        return new Memento(state);
    }

    public void setMemento(Memento m) {
        this.state = m.getState();
        System.out.println("Recuperou estado = " + state);
    }
    public void moveLeft() {
        this.state += "<-";
    }
    public void moveRight() {
        this.state += "->";
    }
}
