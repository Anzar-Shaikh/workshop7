package com.bl.workshop;

public class Main {
    public static void main(String[] args) {
        Biryani biryani = new Biryani();
        biryani.price = 150;
        biryani.printMainIngredients();
        Biryani biryani1 = new Biryani();
        biryani1.price = 150;


        AppleJuice appleJuice = new AppleJuice();
        appleJuice.price = 25;
        appleJuice.printMainIngredients();

        Dosa dosa = new Dosa();
        dosa.price = 40;
        dosa.printMainIngredients();
        PaniPuri paniPuri = new PaniPuri();
        paniPuri.price = 30;
        paniPuri.printMainIngredients();

        FoodManager foodManager = new FoodManager();
        foodManager.add(dosa);
        foodManager.add(dosa);
        foodManager.add(appleJuice);
        foodManager.add(biryani);
        foodManager.add(biryani1);
        foodManager.add(paniPuri);

        foodManager.print();
        System.out.println("The total food item in food list is : " +foodManager.getFoodCount());
//        foodManager.delete(dosa);
        System.out.println("The total food item in food list is : " +foodManager.getFoodCount());
        foodManager.print();
        foodManager.printAllNonVegItem();
        foodManager.printAllVegItem();

    }
}
