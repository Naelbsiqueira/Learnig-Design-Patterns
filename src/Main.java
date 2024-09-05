import strutural.singleton.Singleton;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    Singleton instance = Singleton.getInstance();
        System.out.println(instance);
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance1);
    }
}