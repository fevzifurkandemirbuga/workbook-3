package com.pluralsight;

public class Employee {
    private int id;
    private String name;
    private double workedHours;
    private double payRate;

    public Employee(int id, String name, double workedHours, double payRate) {
        this.id = id;
        this.name = name;
        this.workedHours = workedHours;
        this.payRate = payRate;
    }


    public double getGrossPay(){
        return this.payRate*this.workedHours;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWorkedHours() {
        return workedHours;
    }

    public void setWorkedHours(double workedHours) {
        this.workedHours = workedHours;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }
}
