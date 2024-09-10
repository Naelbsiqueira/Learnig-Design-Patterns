package structure.facade;

public class EcommerceFacade {
    //Estes atributo são a composição em UML
    private Stock stock;
    private Pay pay;
    private Send send;

    public EcommerceFacade() {
        this.stock = new Stock();
        this.pay = new Pay();
        this.send = new Send();
    }
    public void orderProcess(String productId, String userId){
        if (stock.stockCheck(productId) && pay.processPay(userId)){
            send.sendProduct(productId,userId);
        }else {
            System.out.println("Não foi possível processar o pedido para o usuário" + userId);
        }

    }
}
