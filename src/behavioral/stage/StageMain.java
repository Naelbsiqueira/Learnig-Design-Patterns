package behavioral.stage;
/*Padrão State: Permite que um objeto altere seu comportamento quando seu
estado interno muda. Ele encapsula os estados em classes separadas, e o
objeto delega as responsabilidades ao estado atual. Isso facilita a adição
de novos estados sem modificar o código existente.*/

public class StageMain {
    public static void main(String[] args) {
        TCPConnection tc = new TCPConnection();
        tc.open();
        tc.setStage(new TCPEstablished());
        tc.open();
    }
}
