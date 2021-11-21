package Adapter;

public class SachinNutsShop {

    public SachinNuts buyNuts(String name, Long quantity) {
        SachinNuts nuts = new SachinNuts();
        nuts.setNutsName(name);
        nuts.setNutsQuantity(quantity);
        return  nuts;
    }
}
