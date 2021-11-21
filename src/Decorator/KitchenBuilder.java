package Decorator;

public class KitchenBuilder extends HomeDecorator{
    KitchenBuilder(House house) {
        super(house);
        System.out.println("KitchenBuilder const....");
    }

    static {
        System.out.println("Static in kitchen builder");
    }

    @Override
    public void design() {
        this.house.design();
        addKitchen();
    }

    private void addKitchen() {
        System.out.println("Adding kitchen ....");
    }
}
