package Decorator;

public class ApartmentHouse implements House {
    @Override
    public void design() {
        System.out.println("Creating appartment ..........");
    }

    static {
        System.out.println("Static in apartment house");
    }
}
