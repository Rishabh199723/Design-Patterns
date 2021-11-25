package CommandPattern;

public class Client {

    public static void main(String[] args) {
        Manager manager = new Manager();
        Command developApplication = new ApplicationDeveloper(new Developer("Ram"));
        Command testApplication = new ApplicationTester(new Tester("Shyam"));
        manager.giveCommand(developApplication);
        manager.giveCommand(testApplication);
    }
}
