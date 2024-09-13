package behavioral.mediator;

public class FontDialogDirector extends DialongDirector{

    private ListBox lb;
    private EntryField ef;
    @Override
    public void createWidget() {
         lb =  new ListBox(this);
         ef =  new EntryField(this);
    }

    @Override
    public void widgetChanged(Widget w) {
        lb.getSelection();
    }

    public EntryField getEf() {
        return ef;
    }

}
