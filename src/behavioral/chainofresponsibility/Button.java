package behavioral.chainofresponsibility;

public class Button extends HelpHandler{
    private boolean ativo;
    public Button(HelpHandler handler, boolean ativo) {
        super(handler);
        this.ativo = ativo;
    }

    @Override
    public void handlerHelp() {
        if(ativo){
            System.out.println("Tratou o help no botão");
        }else{
            super.handlerHelp();
        }
    }
}
