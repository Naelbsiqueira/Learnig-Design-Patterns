package behavioral.mediator;

public class EntryField extends Widget{
    public EntryField(DialongDirector director) {
        super(director);
    }

    public void setText() {
        changed();
    }
}
