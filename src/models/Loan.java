package models;
import java.util.Scanner;


public class Loan extends Account{
    double loanAmount;
    double loanInterestRate;
    double loanTime;

    //Constructor
    public Loan(String accountHolderName, double loanAmount, double loanInterestRate, double loanTime) {
        super(accountHolderName);
        this.loanAmount = loanAmount;
        this.loanInterestRate = loanInterestRate;
        this.loanTime = loanTime;
    }

    //Getter and Setter

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getLoanInterestRate() {
        return loanInterestRate;
    }

    public void setLoanInterestRate(double loanInterestRate) {
        this.loanInterestRate = loanInterestRate;
    }

    public double getLoanTime() {
        return loanTime;
    }

    public void setLoanTime(double loanTime) {
        this.loanTime = loanTime;
    }

    public double getLoanAmountWithInterest() {

        return loanAmount+((loanAmount * loanInterestRate * loanTime) / 100);
    }

    //Loan Paying


    public void payloan() {
            Scanner sc = new Scanner(System.in);


            System.out.println("Loan time: " + loanTime + " years");
            System.out.println("Interest rate: " + loanInterestRate + "%");
            System.out.println("Total loan amount: " + getLoanAmountWithInterest());
            System.out.println("Enter the amount you want to pay off:");
            double paymentAmount = sc.nextDouble();

            double amountWithInterest = getLoanAmountWithInterest();
        if (paymentAmount >= amountWithInterest) {

            System.out.println("Loan paid off.");
            System.out.println("Here is your change");
            double note = paymentAmount -= loanAmount ;
            System.out.println("You got "+note+" in return");

            if (note >= 1000) {
                int times = (int) (note / 1000);
                System.out.println("1000 *" + times);
                note = note - (1000 * times);
            }


            if (note >= 500) {
                int times = (int) (note / 500);
                System.out.println("500 *" + times);
                note = note - (500 * times);

            }
            if (note >= 100) {
                int times = (int) (note / 100);
                System.out.println("100 *" + times);
                note = note - (100 * times);

            }
            if (note >= 50) {
                int times = (int) (note / 50);
                System.out.println("50 *" + times);
                note = note - (50 * times);

            }
            if (note >= 20) {
                int times = (int) (note / 20);
                System.out.println("20 *" + times);
                note = note - (20 * times);

            }
            if (note >= 10) {
                int times = (int) (note / 10);
                System.out.println("10 *" + times);
                note = note - (10 * times);

            }
            if (note >= 5) {
                int times = (int) (note / 5);
                System.out.println("5 *" + times);
                note = note - (5 * times);

            }


        }

        else if (paymentAmount == amountWithInterest) {
                System.out.println("Loan fully paid off.");
                loanAmount = 0;
                loanTime = 0;
        }

        else if (paymentAmount > 0) {
                loanAmount -= paymentAmount;
                System.out.println("Remaining loan amount: " + loanAmount);
        }
        else {
                System.out.println("Invalid payment amount.");
        }
        }

    }
