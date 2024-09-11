package structure.proxy;

public class CompleteList implements ContactList{
    private String list;

    public CompleteList(String list) {
        this.list = list;
    }

    @Override
    public void show() {
        System.out.println("Visualizar lista telefônica em proxy");
    }
    @Override
    public void printCompleteList(){
        System.out.println("Imprimindo lista telefônica remotamente");
    }
}
