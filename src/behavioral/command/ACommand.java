package behavioral.command;

public class ACommand implements Command{
    @Override
    public void execute() {
        System.out.println("Executou comando A");
    }
}
