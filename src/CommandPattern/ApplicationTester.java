package CommandPattern;

public class ApplicationTester implements Command{
    Tester tester;
    ApplicationTester(Tester tester) {
        this.tester = tester;
    }
    @Override
    public void execute() {
        this.tester.performAction();
    }
}
