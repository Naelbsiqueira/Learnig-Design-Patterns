package structure.proxy;

public class ProxyContactList implements ContactList {
    private CompleteList completeList;
    private String list;

    // Construtor correto que recebe a lista como String
    public ProxyContactList(String list) {
        this.list = list;
    }

    @Override
    public void printCompleteList() {
        System.out.println("Imprimindo lista telefônica remotamente");
    }

    @Override
    public void show() {
        // Lazy initialization: cria CompleteList apenas se for necessário
        if (completeList == null) {
            completeList = new CompleteList(list);
        }
        // Delegação da chamada ao objeto real (CompleteList)
        completeList.show();
    }
}
