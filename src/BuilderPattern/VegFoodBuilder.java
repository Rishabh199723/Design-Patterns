package BuilderPattern;

public class VegFoodBuilder implements FoodBuilder{

    FishCurry curry = new FishCurry();

    @Override
    public VegFoodBuilder setFoodName(String name) {
        System.out.println("Setting name ....");
        curry.setName(name);
        return this;
    }

    @Override
    public VegFoodBuilder setPrice(Double price) {
        System.out.println("Setting price ....");
        curry.setPrice(price);
        return this;
    }

    @Override
    public VegFoodBuilder setIngredient(String ingredient) {
        System.out.println("Setting ingredient ....");
        curry.setIngredient(ingredient);
        return this;
    }

    @Override
    public VegFoodBuilder cutToPieces(Long pieces) {
        System.out.println("Cutting pieces ....");
        curry.setPieces(pieces);
        return this;
    }

    @Override
    public FishCurry fetchDish(){
        return curry;
    }

}
