package com.bl.workshop;

import java.util.*;

public class FoodManager {
    Set<FoodItem> foodList = new HashSet<>(); // it do not add multiple items of same object.
//    List<FoodItem> foodList = new ArrayList(); // it do not add multiple items of same object.

    public void add(FoodItem foodItem){
        foodList.add(foodItem);
    }

    void print() {
        for (FoodItem element : foodList) {
            System.out.println(element);
        }

    }
    public void delete(FoodItem foodItem){
        foodList.remove(foodItem);
    }
    public int getFoodCount(){
       return foodList.size();
    }
    public void printAllVegItem() {
        System.out.println("Printing all veg items");
        for (FoodItem element : foodList) {
            if(element instanceof  IVeg) {
                System.out.println(element);
            }
        }

    }
    public void printAllNonVegItem() {
        System.out.println("Printing all Non-veg items");
        for (FoodItem element : foodList) {
            if(element instanceof  INonVeg) {
                System.out.println(element);
            }
        }
    }
//    void sowMenu() {
//        Scanner sc = new Scanner(System.in);
//        System.out.print(" 1 - update food item ");
//        int choice = sc.nextInt();
//        switch (choice){
//            case 1 :
//                updateFoodItem();
//                break;
//        }
//
//    }
//    void updateFoodItem(){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter food item : ");
//        String item = sc.nextLine();
//        getFoodItem(item);
//
//    }
    FoodItem getFoodItem(String name){
        Iterator iterator = foodList.iterator();
        if (iterator.hasNext()) {
            for (int i = 0 ; i < foodList.size(); i++) {
                if (iterator.hasNext()) {
                    FoodItem fooditem = (FoodItem) iterator.next();
                    if (fooditem.name.equalsIgnoreCase(name)){
                        return fooditem;
                    }
                }
            }
        }
        return null;
    }




}