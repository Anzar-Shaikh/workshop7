package com.bl.workshop;
class Biryani  extends FoodItem implements INonVeg{
    public Biryani() {
//        type = Type.NON_VEG;
        taste = Taste.SPICY;
        preparationTime = 45;
        category = Category.MAIN_COURSE;
        name = "Biryani.";
    }

    @Override
    public void printMainIngredients() {
        System.out.println("main ingredient biryani is chicken");
    }
}

