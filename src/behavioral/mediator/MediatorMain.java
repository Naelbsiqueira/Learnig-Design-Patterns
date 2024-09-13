package behavioral.mediator;
/*Padrão Mediator: Centraliza a comunicação entre objetos em um sistema,
evitando que eles interajam diretamente. Isso promove um baixo acoplamento,
delegando a um objeto mediador a responsabilidade de coordenar essas interações,
facilitando a manutenção e a flexibilidade.*/

public class MediatorMain {
    public static void main(String[] args) {
        FontDialogDirector d = new FontDialogDirector();
        d.createWidget();
        d.getEf().setText();//Isto aqui quem faz é o usuário na interação com a tela
    }
}
