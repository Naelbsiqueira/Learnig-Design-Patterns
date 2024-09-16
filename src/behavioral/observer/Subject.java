package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public interface Subject {
    List <Observer> observers = new ArrayList<>();
    default void attatch (Observer o){
        this.observers.add(o);
    }
    default void detatch (Observer o ){
        this.observers.remove(o);
    }
    default void notifyObservers(){
        for (Observer observer: observers){
            observer.update();
        }

    }
}
