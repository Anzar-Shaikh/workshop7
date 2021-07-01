package com.bl.workshop;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
}