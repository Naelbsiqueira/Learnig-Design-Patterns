package structure.bridge;
/*Padrão Bridge: separa a abstração da implementação,
permitindo que ambos variem independentemente.
Ele utiliza composição para delegar a implementação
a uma classe separada, promovendo maior flexibilidade.
Isso facilita a extensão de funcionalidades sem alterar
o código base.*/

public class BridgeMain {
    public static void main(String[] args) {
        TrasienWindow ic = new TrasienWindow();
        ic.setImp(new PMWindowImp());
        ic.drawRect();
    }
}
