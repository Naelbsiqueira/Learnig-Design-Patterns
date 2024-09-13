package behavioral.mediator;

public abstract class Widget{
    private DialongDirector director;

    public Widget(DialongDirector director) {
        this.director = director;
    }

    public void changed(){
        director.widgetChanged(this);
    };

}
