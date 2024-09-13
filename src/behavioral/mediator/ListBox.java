package behavioral.mediator;

public class ListBox extends Widget{
    public ListBox(DialongDirector director) {
        super(director);
    }
    public void getSelection(){
        System.out.println("Recuperou a seleção");
    }
}
