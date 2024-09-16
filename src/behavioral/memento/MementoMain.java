package behavioral.memento;
/*Padrão Memento: Permite salvar e restaurar o estado interno de um objeto
sem violar seu encapsulamento. Ele é composto por três elementos:
Originador (o objeto que terá seu estado salvo), Memento (que armazena o estado)
e Cuidador (responsável por gerenciar e restaurar os Mementos).
Esse padrão é útil para implementar funcionalidades como "desfazer/refazer".*/

public class MementoMain {
    public static void main(String[] args) {
        Originator o = new Originator();
        CareTaker ct = new CareTaker(o);
        ct.saveStates();
        o.moveLeft();
        o.moveLeft();

        o.moveRight();
        ct.saveStates();
        o.moveLeft();
        o.moveRight();
        ct.saveStates();
        o.moveRight();
        ct.undo();
        ct.undo();
        ct.undo();
    }
}
