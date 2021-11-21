package BuilderPattern;

public class FoodEater {

    public VegFoodBuilder instructFoodMaker(VegFoodBuilder vegFoodBuilder) {
        vegFoodBuilder.setFoodName("Rice").setPrice(30.5).setIngredient("Masala").cutToPieces(4L);
        return vegFoodBuilder;
    }
}
