package Adapter;

public abstract class Nuts {
    String name;
    Long quantity;
    public String getName() {
        return name;
    }

    public Long getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return ("name:"+name+" quantity:"+quantity);
    }
}
