package com.bl.workshop;
public class Dosa extends FoodItem implements IVeg{
    public Dosa() {
//        type = Type.VEG;
        taste = Taste.SALTY;
        preparationTime = 10;
        category = Category.STARTER;
        name = "Dosa";
    }

    @Override
    public void printMainIngredients() {
        System.out.println("Main ingredients of dosa is maida etc; ");
    }
}
