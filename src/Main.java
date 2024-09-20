import models.*;
import models.Loan;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your Name?");
        String name = sc.nextLine();
        Savings s1 = new Savings(name,1500, 0.09, 2);
        Balance b1 = new Balance(name,1000000.00);
        Loan l1 = new Loan(name,300,0.1,2);
        CreditCard c1 = new CreditCard(name);




        System.out.println("What do you want to do?");
        System.out.println("Press 0 to check exit, 1 to deposit, 2 to withdraw,");
        System.out.println("3 to check savings and 4 to check bank balance, ");
        System.out.println("5 to check your loan");
        System.out.println("6 to apply for a credit card, 7 to withdraw 1000 from credit card.");
        int choice = sc.nextInt();

        while(choice != 0){
            if (choice == 1) {
                System.out.println("How much do you wnt to deposit");
                double deposit = sc.nextDouble();
                b1.deposit(deposit);
            }
            else if (choice == 2) {
                System.out.println("How much do you want to withdraw");
                double withdraw = sc.nextDouble();
                b1.withdraw(withdraw);

            }

            else if (choice == 4) {
                    System.out.println(b1.getAccountHolderName() + ", your balance is " + b1.getBalance());
            }
            else if (choice == 3) {
                System.out.println(s1.getAccountHolderName() + ", your interest rate is: " + s1.getRate());
                System.out.println("Your interest amount is: " + s1.getInterest());
                double total = s1.getSavingsAmount() + s1.getInterest();
                System.out.println("Your total balance with interest is " + total);
            }
            else if (choice == 5) {
                System.out.println(l1.getAccountHolderName() + ", you took a loan of " + l1.getLoanAmount());
                System.out.println("With an interest rate of " + l1.getLoanInterestRate());
                System.out.println("For " + l1.getLoanTime() + " years");
                System.out.println("Total loan you need to pay is " + l1.getLoanAmountWithInterest());
                System.out.println("Do you want to pay off the loan? press 1 if yes else press 0");
                int pay = sc.nextInt();
                if (pay==1) {
                    l1.payloan();

                }
                else{
                    System.out.println(" ");
                }

            }
            else if (choice == 6) {
                c1.applyForCreditCard(b1);
            }


            else if (choice == 7) {
                c1.withdrawCredit();
            }


            else {
                System.out.println("Please enter a valid choice");
            }

            System.out.println("Do you want to exit? If yes press 0");
            System.out.println("Else press 1/2/3/4/5/6/7 according to need");
            choice = sc.nextInt();






    }
}
}
