package behavioral.stage;

public class TCPConnection {
    TCPStage stage = new TCPListen();
    public void open(){
        stage.open();
    };

    public void close(){
        stage.close();
    };
    public void acknowledge(){
        stage.acknowledge();
    };

    public TCPStage getStage() {
        return stage;
    }

    public void setStage(TCPStage stage) {
        this.stage = stage;
    }
}
