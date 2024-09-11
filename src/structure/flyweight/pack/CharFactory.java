package structure.flyweight.pack;

import java.util.HashMap;
import java.util.Map;

public class CharFactory {
    private static Map<Character, CharacterFlyweight> flyweight = new HashMap<>();

    public static CharacterFlyweight getFlyweight(char c) {
        CharacterFlyweight character = null;
        if (flyweight.get(c) == null) {
            character = new CharacterFlyweight(c);
            flyweight.put(c, character);
        } else {
            character = flyweight.get(c);
        }
        return character;
    }
}
