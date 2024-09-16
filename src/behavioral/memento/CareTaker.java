package behavioral.memento;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CareTaker {
    private Stack<Memento> states = new Stack<Memento>();
    private Originator o;
    public CareTaker(Originator o ){
        this.o = o;
    }
    public void saveStates(){
        states.push(o.createMemento());
    }
    public void undo(){
        o.setMemento(states.pop());
    }
}
