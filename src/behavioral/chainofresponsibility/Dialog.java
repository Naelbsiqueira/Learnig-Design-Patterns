package behavioral.chainofresponsibility;

public class Dialog extends HelpHandler{
    public Dialog(HelpHandler handler) {
        super(handler);
    }
}
