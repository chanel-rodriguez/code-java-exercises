package Groceries;

import util.Input;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GroceryApplication {
    public static void main(String[] args) {

        HashMap<String, HashMap<String, Integer>> categories = new HashMap<>();
        HashMap<String, Integer> Produce = new HashMap<>();
        HashMap<String, Integer> Dairy = new HashMap<>();
        HashMap<String, Integer> Meats = new HashMap<>();
        HashMap<String, Integer> Misc = new HashMap<>();
        categories.put("Produce",Produce);
        categories.put("Dairy",Dairy);
        categories.put("Meats",Meats);
        categories.put("Misc",Misc);

        if (ask.yesNo("Would you like to make a grocery list? y/n")) {
            while (true) {
                printOptions();
                int option = ask.getInt("What do you want to do? ");

                if(option == 1){
                    addToHm(Meats);
                }
                if(option == 2){
                    addToHm(Produce);
                }
                if(option == 3){
                    addToHm(Dairy);
                }
                if(option == 4){
                    addToHm(Misc);
                }
                if (option == 5){
                    System.out.println(categories.keySet());
                    String category = ask.getString("What category do you want to view?");
                    while (!categories.keySet().contains(category)){
                        System.out.println(categories.keySet());
                        category = ask.getString("Invalid Category; What category do you want to view?");
                    }
                    printCategory(categories,category);
                }
                if (option == 6){
                    editItem(categories);
                }
                if (option == 7){
                    printTable(categories);
                }
                if (option == 8){
                    printTable(categories);
                    break;
                }
            }
        }

    }
        public static Input ask = new Input(new Scanner(System.in));

        public static void addToHm(HashMap<String, Integer> hm){
            String item = itemToAdd();
            if(hm.containsKey(item)){
                hm.put(item,qtyToAdd("This item already exists with quantity: " + hm.get(item) + "\nHow many more do you want to add? ")+hm.get(item));
            }else{
                hm.put(item,qtyToAdd("How many do you want to add?"));
            }
        }
        public static String itemToAdd(){
            return ask.getString("What item to you want to add?");
        }
        public static int qtyToAdd(String prompt){
            return ask.getInt(prompt);
        }
        public static void printCategory(HashMap<String,HashMap<String,Integer>> hm, String heading){
            System.out.printf("%-10s     Qty\n", heading.toUpperCase());
            System.out.println("--------------------");
            for(String items: hm.get(heading).keySet()) {
                System.out.printf(" -%-10s | %-10d \n", items,hm.get(heading).get(items));
            }
            System.out.println("--------------------");
        }
        public static void printTable(HashMap<String,HashMap<String,Integer>> list) {
            for (String category: list.keySet()){
                printCategory(list,category);
            }
        }
        public static void printOptions(){
            System.out.println("1- Add to Meats");
            System.out.println("2- Add to Produce");
            System.out.println("3- Add to Dairy");
            System.out.println("4- Add to Misc");
            System.out.println("5- View by Category");
            System.out.println("6- Edit an Item");
            System.out.println("7- View grocery list");
            System.out.println("8- Finish");
        }
        public static void editItem(HashMap<String,HashMap<String,Integer>> Hm){
            String item = ask.getString("Which item to do you want to edit?");
            int counter = 0;
            for(String items: Hm.keySet()){
                for (String i : Hm.get(items).keySet()){
                    if (i.equals(item)){
                        int newQty = ask.getInt(item + " currently has qty: " +Hm.get(items).get(item)+", What's the new quantity? ");
                        Hm.get(items).put(item,newQty);
                        counter++;
                    }
                }
            }
            if(counter == 0){
                System.out.println("That item does not exist");
            }
        }
}