package structure.flyweight.pack;

public class CharacterFlyweight implements Flyweight {
    private static int countInstance = 0;
    private char c;

    CharacterFlyweight(char c) {
        this.c = c;
        countInstance++;
    }

    @Override
    public void print(String formate) {
        System.out.print(c + formate);
    }
    public static int getCountInstance(){
        return countInstance;
    }
}
