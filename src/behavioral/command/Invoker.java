package behavioral.command;

import java.util.HashMap;
import java.util.Map;

public class Invoker {
    private static Map<String, Command> commands = new HashMap<String,Command>();

    static {
        commands.put("A", new ACommand());
        commands.put("B", new BCommand());
    }
    public static void invoke(String command){
        commands.get(command).execute();
    }
}
