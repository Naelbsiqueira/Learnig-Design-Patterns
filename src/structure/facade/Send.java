package structure.facade;

public class Send {
    public void sendProduct(String productId, String userId){
        //Lógica para enviar Produto ...
        System.out.println("Produto " + productId + " enviado para o usuário " + userId);
    }
}
