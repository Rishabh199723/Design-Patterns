package CommandPattern;

public class Tester extends Employee{

    Tester(String name) {
        super(name);
    }

    @Override
    public void performAction() {
        System.out.println(getName() + "is performing testing ......");
    }
}
