package com.pluralsight;

import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        String[] quotes = {
                "The only way to do great work is to love what you do. - Steve Jobs",
                "Success is not final, failure is not fatal: it is the courage to continue that counts. - Winston Churchill",
                "Don’t watch the clock; do what it does. Keep going. - Sam Levenson",
                "Believe you can and you're halfway there. - Theodore Roosevelt",
                "Hardships often prepare ordinary people for an extraordinary destiny. - C.S. Lewis",
                "It always seems impossible until it’s done. - Nelson Mandela",
                "Dream big and dare to fail. - Norman Vaughan",
                "You miss 100% of the shots you don’t take. - Wayne Gretzky",
                "The future depends on what you do today. - Mahatma Gandhi",
                "Start where you are. Use what you have. Do what you can. - Arthur Ashe"
        };
        boolean running=true;
        while(running){
            System.out.println("""
                    =====Menu=====
                    1- random quote
                    2- enter number
                    3- exit""");
            System.out.print("enter your choice (1-3): ");
            int answer=scan.nextInt();
            int index;
            if (answer==1){
                index=(int) (Math.random()*9);
                System.out.println(quotes[index]);
            } else if (answer==2) {
                while(true){
                    try{
                        System.out.print("enter a number 1 to 10: ");
                        index= scan.nextInt();
                        index--;

                        System.out.println(quotes[index]);
                    }catch (Exception e){
                        System.out.println("Your number was out of range. please try again");
                        continue;
                    }
                    break;
                }

            } else if (answer==3) {
                running=false;

            }
            else{
                System.out.println("Please enter a number between 1 to 3");
            }


        }






    }
}
