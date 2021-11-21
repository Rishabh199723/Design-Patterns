package Adapter;

public class SachinNuts {
    String nutsName;
    Long nutsQuantity;

    public String getNutsName() {
        return nutsName;
    }

    public void setNutsName(String nutsName) {
        this.nutsName = nutsName;
    }

    public Long getNutsQuantity() {
        return nutsQuantity;
    }

    public void setNutsQuantity(Long nutsQuantity) {
        this.nutsQuantity = nutsQuantity;
    }

    @Override
    public String toString() {
        return "Name: "+nutsName+" Quantity: "+nutsQuantity;
    }
}
