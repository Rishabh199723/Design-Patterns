package CommandPattern;

public class Manager {

    public void giveCommand(Command command) {
        command.execute();
    }
}
