package behavioral.chainofresponsibility;

public abstract class HelpHandler {
    private HelpHandler handler;

    public HelpHandler(HelpHandler handler) {
        this.handler = handler;
    }
    public void handlerHelp(){
        if (this.handler != null) {
            System.out.println("Repassou chamada do help");
            this.handler.handlerHelp();
        }else{
            System.out.println("Não foi possivel tratar o evendo de help");
        }
    }
}
