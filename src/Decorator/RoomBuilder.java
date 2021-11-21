package Decorator;

public class RoomBuilder extends HomeDecorator {
    RoomBuilder(House house) {
        super(house);
        System.out.println("RoomBuilder const....");
    }

    static {
        System.out.println("Static in room builder");
    }

    @Override
    public void design() {
        this.house.design();
        addRoom();
    }

    private void addRoom() {
        System.out.println("Adding room ....");
    }
}
