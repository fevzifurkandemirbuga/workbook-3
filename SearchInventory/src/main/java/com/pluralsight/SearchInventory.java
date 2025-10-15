package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class SearchInventory {
    public static void main(String[] args) {
        ArrayList<Product> inventory = getInventory();
        System.out.println("We carry the following inventory: ");
        for (Product p : inventory) {
            System.out.println("========================================");
            System.out.printf("ID: %d \nItem Name: %s \nPrice: $%.2f\n", p.getId(), p.getName(), p.getPrice());
            System.out.println("========================================");
        }
    }
    public static ArrayList<Product> getInventory() {
        ArrayList<Product> inventory = new ArrayList<Product>();

        try{
            FileReader fR=new FileReader("inventory.csv");
            BufferedReader bR=new BufferedReader(fR);
            String input;
            while((input= bR.readLine())!=null){

                String[] items=input.split("\\|");
                inventory.add(new Product(Integer.parseInt(items[0]),items[1],Float.parseFloat(items[2])));

            }

            bR.close();


        }catch (IOException e){
            e.printStackTrace();
        }
        inventory.sort(Comparator.comparing(Product::getName));

        return inventory;
    }
}
