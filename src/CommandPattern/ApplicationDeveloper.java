package CommandPattern;

public class ApplicationDeveloper implements Command{

    Developer developer;

    ApplicationDeveloper(Developer developer) {
        this.developer = developer;
    }
    @Override
    public void execute() {
        developer.performAction();
    }
}
