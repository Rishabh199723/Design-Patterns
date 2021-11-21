package Decorator;

public class Client {


    static {
        System.out.println("Hi.....");
    }

    public static void main(String[] args) {
        House house = new BalconyBuilder(new KitchenBuilder(new RoomBuilder(new ApartmentHouse())));
        house.design();
    }
}
