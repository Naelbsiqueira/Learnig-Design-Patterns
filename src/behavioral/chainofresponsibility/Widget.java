package behavioral.chainofresponsibility;

public class Widget extends HelpHandler{
    public Widget(HelpHandler handler) {
        super(handler);
    }

}
