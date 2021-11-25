package CommandPattern;

public class Developer extends Employee{


    Developer(String name) {
        super(name);
    }

    @Override
    public void performAction() {
        System.out.println(getName()+" is developing code ......");
    }
}
