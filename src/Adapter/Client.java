package Adapter;

public class Client {
    public static void main(String[] args) {
        Nuts raghavNuts = orderNuts(new RaghavNutsShop());
        System.out.println("Raghav nuts:"+raghavNuts);
        Nuts sachinNuts = orderNuts(new ShopAdapter(new SachinNutsShop()));
        System.out.println("sachin nuts:"+sachinNuts);
    }

    private static Nuts orderNuts(Shop shop) {
        return shop.orderNuts("Pista", 300L);
    }

}
