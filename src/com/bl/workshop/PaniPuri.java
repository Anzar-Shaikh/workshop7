package com.bl.workshop;

public class PaniPuri extends FoodItem implements IVeg {
    public PaniPuri() {
//        type = Type.VEG;
        taste = Taste.SPICY;
        preparationTime =2;
        category = Category.STARTER;
        name = "PaniPuri";
    }
    public void printMainIngredients() {
        System.out.println("main ingredient of panipuri is pani puri");
    }
}
