package com.bl.workshop;

import java.util.Scanner;

public class Main {
    FoodManager foodManager = new FoodManager();

    public static void main(String[] args) {

        Biryani biryani = new Biryani();
        biryani.price = 150;
//        biryani.printMainIngredients();
//        Biryani biryani1 = new Biryani();
//        biryani1.price = 150;

        AppleJuice appleJuice = new AppleJuice();
        appleJuice.price = 25;
//        appleJuice.printMainIngredients();

        Dosa dosa = new Dosa();
        dosa.price = 40;
//        dosa.printMainIngredients();
        PaniPuri paniPuri = new PaniPuri();
        paniPuri.price = 30;
//        paniPuri.printMainIngredients();

        Main main = new Main();
        main.foodManager.add(dosa);
        main.foodManager.add(dosa);
        main.foodManager.add(appleJuice);
        main.foodManager.add(biryani);
//        main.foodManager.add(biryani1);
        main.foodManager.add(paniPuri);

//        main.foodManager.print();
//        System.out.println("The total food item in food list is : " +main.foodManager.getFoodCount());
////        foodManager.delete(dosa);
//        System.out.println("The total food item in food list is : " +main.foodManager.getFoodCount());
//        main.foodManager.print();
//        main.foodManager.printAllNonVegItem();
//        main.foodManager.printAllVegItem();

        main.foodManager.print();

        main.sowMenu();
    }

    void sowMenu() {
        boolean run = true;
        while (run) {
            Scanner sc = new Scanner(System.in);
            System.out.print(" 1-update food item :: 2-exit. :-> ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    updateFoodItem();
                    run = true;
                    break;
                case 2:
                    System.out.println("thank - you for visiting us.");
                    run = false;
                    break;
                default:
                    System.out.println("ERROR");
                    run= true;
                    break;
            }
        }
    }

    void updateFoodItem() {
        boolean run = true;
        int parameter = 0;
        while (run) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter food item : ");
            String item = sc.next();
            FoodItem foodItem = foodManager.getFoodItem(item);
            System.out.println(foodItem);
            while (parameter !=5 ) {
                System.out.println("Enter 1-Taste 2-Prep Time, 3-name, 4-category 5-main menu");
                parameter = sc.nextInt();
                switch (parameter) {
                    case 1:
                        updateTaste(foodItem);
                        run =true;
                        break;
                    case 2:
                        updatePreparationTime(foodItem);
                        run =true;
                        break;
                    case 3:
                        updateName(foodItem);
                        run =true;
                        break;
                    case 4:
                        updateCategory(foodItem);
                        run=true;
                        break;
                    case 5 :
                        run=false;
                        break;
                    default:
                        System.out.println("OHHHHHOOOOOOO invalid choice");
                }
                System.out.println(foodItem);
            }
        }
    }

    private void updateCategory(FoodItem foodItem) {
        Scanner sc = new Scanner(System.in);
        System.out.println("chose from below : ");
        System.out.println("1-MAIN_COURSE 2-STARTER 3-JUICES 4-DESERT");
        int choice = sc.nextInt();
        switch (choice) {
            case 1 :
                foodItem.category = FoodItem.Category.MAIN_COURSE;
                break;
            case 2 :
                foodItem.category = FoodItem.Category.STARTER;
                break;
            case 3 :
                foodItem.category = FoodItem.Category.JUICES;
                break;
            case 4 :
                foodItem.category = FoodItem.Category.DESERT;
                break;
            default:
                System.out.println("OHHOOOOOOO invalid choice");
        }
        System.out.println(foodItem);
    }

    private void updateName(FoodItem foodItem) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter new name : ");
        String name = sc.nextLine();
        foodItem.name =name;
        System.out.println(foodItem);
    }

    private void updateTaste( FoodItem foodItem){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Choose from below ");
        System.out.println("1-SPICY 2-SWEET 3-SALTY 4-SPICY_SALTY");
        System.out.print("Enter your choice : ");
        int taste = sc.nextInt();
        switch (taste) {
            case 1:
                foodItem.taste = FoodItem.Taste.SPICY;
                break;
            case 2:
                foodItem.taste = FoodItem.Taste.SWEET;
                break;
            case 3:
                foodItem.taste = FoodItem.Taste.SALTY;
                break;
            case 4:
                foodItem.taste = FoodItem.Taste.SPICY_SALTY;
            default:
                System.out.println("Enter right taste.");
        }

    }
    public void updatePreparationTime(FoodItem foodItem){
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter new time : ");
        byte newTime  = sc.nextByte();
        foodItem.preparationTime = newTime;

    }
}
