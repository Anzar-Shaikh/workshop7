package com.bl.workshop;

public class AppleJuice extends FoodItem implements IVeg {
    public AppleJuice() {
//        type = Type.VEG;
        taste = Taste.SWEET;
        preparationTime = 20;
        category = Category.JUICES;
        name = "Apple Juice.";
    }
    public void printMainIngredients() {
        System.out.println("main of apple juice is ingredient is apple");
    }
}
