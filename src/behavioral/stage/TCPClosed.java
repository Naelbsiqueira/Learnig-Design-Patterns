package behavioral.stage;

public class TCPClosed implements TCPStage{
    @Override
    public void open() {
        System.out.println("Não é possível abrir uma conexão que jé está fechada");

    }

    @Override
    public void close() {
        System.out.println("Não é possível fechar uma conexão que jé está fechada");

    }

    @Override
    public void acknowledge() {
        System.out.println("Não é possível ACK uma conexão que jé está fechada");

    }
}
