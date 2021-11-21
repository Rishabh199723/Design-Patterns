package BuilderPattern;

public interface FoodBuilder {
    public FoodBuilder setFoodName(String name);

    public FoodBuilder setPrice(Double price);

    public FoodBuilder setIngredient(String ingredient);

    public FoodBuilder cutToPieces(Long pieces);

    public FishCurry fetchDish();

}
