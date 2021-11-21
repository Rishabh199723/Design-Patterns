package BuilderPattern;

public class Client {

    public static void main(String[] args) {
        FoodEater foodEater = new FoodEater();
        VegFoodBuilder builder = foodEater.instructFoodMaker(new VegFoodBuilder());
        FishCurry curry = builder.fetchDish();
        System.out.println("Dish>>>>>>>"+curry);
    }
}
