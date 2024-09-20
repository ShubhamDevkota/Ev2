package models;

import org.w3c.dom.ls.LSOutput;

public class Savings extends Account{
    private double savingsAmount;
    private double rate;
    private int time;

    //Constructor


    public Savings(String accountHolderName, double savingsAmount, double rate, int time) {
        super(accountHolderName);
        this.savingsAmount = savingsAmount;
        this.rate = rate;
        this.time = time;
    }


    //Getter and Setter


    public double getSavingsAmount() {
        return savingsAmount;
    }

    public void setSavingsAmount(double savingsAmount) {
        this.savingsAmount = savingsAmount;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }




    // Interest amount
    public double getInterest() {

        return (savingsAmount * rate * time) / 100;
    }




}




