package Decorator;

public class BalconyBuilder extends HomeDecorator {
    BalconyBuilder(House house) {
        super(house);
        System.out.println("BalconyBuilder const....");
    }
    static {
        System.out.println("Static in balcony builder");
    }

    @Override
    public void design() {
        this.house.design();
        addBalcony();
    }

    private void addBalcony() {
        System.out.println("Adding balcony ....");
    }
}
