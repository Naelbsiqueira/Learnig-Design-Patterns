package behavioral.command;
/*Padrão Command: Encapsula uma solicitação como um objeto, permitindo
parametrizar métodos com diferentes solicitações, filas ou logs de operações.
Ele desacopla o objeto que emite a solicitação daquele que a executa,
facilitando a operação de desfazer(undo) ou refazer (redo), repetição ou agendamento de ações.
Isso promove a flexibilidade e a extensão dos comandos.*/

public class CommandMain {
    public static void main(String[] args) {
        Invoker.invoke("A");
        Invoker.invoke("B");
    }
}
