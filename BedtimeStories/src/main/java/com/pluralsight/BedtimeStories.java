package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BedtimeStories {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        boolean running=true;
        while(running){
            System.out.println("""
                ==============Menu==============
                1-goldilocks
                2-hansel_and_gretel
                3-mary_had_a_little_lamb
                """);
            System.out.print("enter a story number or story name: ");
            String choice = scan.nextLine();

            String filename="";

            if(choice.length()==1){
                switch (choice){
                    case "1" -> filename="goldilocks.txt";
                    case "2" -> filename="hansel_and_gretel.txt";
                    case "3" -> filename="mary_had_a_little_lamb.txt";
                    default -> {
                        System.out.println("wrong number. try again!!");
                        continue;
                    }
                }
            }
            else{
                if(choice.contains(" ")){
                    choice=choice.replace(" ","_");
                }
                filename=choice+".txt";
            }


            try {
                FileReader fileReader= new FileReader(filename);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String input;
                int lineIndex=1;
                while((input = bufferedReader.readLine()) != null){
                    System.out.println(lineIndex++ + ". "+input);
                }

                running=false;
            } catch (FileNotFoundException e){
                System.out.println("you enter wrong name. please try again!!");
            }catch (IOException e) {
                e.printStackTrace();
            }
        }



    }
}
