package behavioral.stage;

public class TCPEstablished implements TCPStage{
    @Override
    public void open() {
        System.out.println("Não é possível abrir uma conexão que jé está estabelecida");

    }

    @Override
    public void close() {
        System.out.println("Conexão fechada com sucesso");

    }

    @Override
    public void acknowledge() {
        System.out.println("ACK");

    }
}
