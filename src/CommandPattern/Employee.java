package CommandPattern;

public abstract class Employee {
    private String name;
    Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void performAction();
}
