package behavioral.stage;

public class TCPListen implements TCPStage{
    @Override
    public void open() {
        System.out.println("Conexão aberta com sucesso");

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
