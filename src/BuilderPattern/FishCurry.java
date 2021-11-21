package BuilderPattern;

public class FishCurry extends Food{

    @Override
        public String toString() {
            return "Name:"+getName()+"Price:"+getPrice()+"Ingredient:"+getIngredient()+"Pieces:"+getPieces();
        }
}
