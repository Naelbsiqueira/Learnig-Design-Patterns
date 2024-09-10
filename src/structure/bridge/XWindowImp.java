package structure.bridge;

public class XWindowImp extends WindowsImp{
    @Override
    public void devDrawText() {
        System.out.println("Desenhou Text x");
    }

    @Override
    public void devDrawLine() {
        System.out.println("Desenhou Linha x");

    }
}
