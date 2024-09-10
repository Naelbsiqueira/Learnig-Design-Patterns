package structure.bridge;

public abstract class Window {
    private WindowsImp imp;
    public void drawRect(){
        imp.devDrawLine();
        imp.devDrawLine();
        imp.devDrawLine();
        imp.devDrawLine();
    };
    public void drawText(){
        imp.devDrawText();
    }

    public WindowsImp getImp() {
        return imp;
    }

    public void setImp(WindowsImp imp) {
        this.imp = imp;
    }
}
