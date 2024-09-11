package behavioral.chainofresponsibility;
/*Padrão Chain of Responsibility: Permite que uma requisição (ação) seja enviado ao longo de uma
cadeia de objetos, onde cada um pode processá-lo ou passá-lo adiante.
Evitando acoplamento direto entre o solicitante e os objetos que
podem tratar o pedido, mas apenas ao objeto para o qual ele envia
a requisição e promovendo uma estrutura mais flexível e extensível.*/

public class ChainOfResponsibilityMain {
    public static void main(String[] args) {
        Widget w = new Widget(null);
        Dialog d = new Dialog(w);

        Button b1 = new Button(d,true);
        Button b2 = new Button(d,false);
        b1.handlerHelp();
        b2.handlerHelp();


    }
}
