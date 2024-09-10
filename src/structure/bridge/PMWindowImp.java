package structure.bridge;

public class PMWindowImp extends WindowsImp{
    @Override
    public void devDrawText() {
        System.out.println("Desenhou Text PM");
    }

    @Override
    public void devDrawLine() {
        System.out.println("Desenhou Linha PM");

    }
}
