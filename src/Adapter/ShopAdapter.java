package Adapter;

public class ShopAdapter implements Shop{

    SachinNutsShop sachinNutsShop;

    public ShopAdapter(SachinNutsShop sachinNutsShop) {
        this.sachinNutsShop = sachinNutsShop;
    }

    @Override
    public Nuts orderNuts(String name, Long quantity) {
        SachinNuts nuts =  sachinNutsShop.buyNuts(name,quantity);
        Nuts nuts1 = new NutsAdapter(nuts);
        return nuts1;
    }
}
