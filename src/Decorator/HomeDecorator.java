package Decorator;

public abstract class HomeDecorator implements House {

    House house;

    HomeDecorator(House house) {
        this.house = house;
    }

}
