package com.pluralsight;

import java.io.*;
import java.util.ArrayList;

public class PayrollCalculator {

    public static void main(String[] args) {

      ArrayList<Employee> employees=new ArrayList<Employee>();

        String path="PayrollCalculator\\employees.csv";
        try
        {
            FileReader fileReader = new FileReader(path);


            BufferedReader bufReader = new BufferedReader(fileReader);
            String input;


            while((input = bufReader.readLine()) != null) {
                if (input.startsWith("id")){
                    continue;
                }

                String[] data=input.split("\\|");

                int id=Integer.parseInt(data[0]);
                String name=data[1];
                double hour=Double.parseDouble(data[2]);
                double payRate=Double.parseDouble(data[3]);

                Employee employee = new Employee(id,name,hour,payRate);
                employees.add(employee);

                for (Employee e:employees){
                    System.out.println("=================================");
                    System.out.printf("Employee ID: %d\nEmployee name: %s\nGross pay: $%.2f\n",
                            e.getId(),e.getName(),e.getGrossPay());
                    System.out.println("=================================");

                }

            }

            bufReader.close();
        }
        catch(IOException e) {

            e.printStackTrace();
        }

        try{
            FileWriter fileWriter= new FileWriter("PayrollCalculator\\text.txt");
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);

            String text;
            bufferedWriter.write("id|name|gross pay\n");
            for (Employee e:employees){
                text=e.getId()+"|"+e.getName()+"|"+ String.format("%.2f",e.getGrossPay())+"\n";
                bufferedWriter.write(text);
            }
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}