package Adapter;

public class RaghavNutsShop implements Shop{
    @Override
    public Nuts orderNuts(String name, Long quantity) {
        System.out.println("Closed now....");
        return null;
    }
}
