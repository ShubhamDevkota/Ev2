package models;

public class CreditCard extends Account {
    private boolean hasCreditCard;
    private double creditLimit;

    // Constructor
    public CreditCard(String accountHolderName) {
        super(accountHolderName);
        this.hasCreditCard = false;
        this.creditLimit = 1000;  // Credit limit for credit card withdrawal
    }
    // Getter and Setter


    public boolean isHasCreditCard() {
        return hasCreditCard;
    }

    public void setHasCreditCard(boolean hasCreditCard) {
        this.hasCreditCard = hasCreditCard;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    //  apply for a credit card based on balance
    public void applyForCreditCard(Balance b1) {

        if(!hasCreditCard){
            if (b1.getBalance() > 10000) {
                hasCreditCard = true;
                System.out.println("Now you have a credit card.");
                System.out.println("You can withdraw 1000 per day ");
                hasCreditCard = true;
            }
        }

        else if(hasCreditCard){
            System.out.println("You already have credit card");
        }
        else {
            System.out.println("Sorry, " + getAccountHolderName() + ". Your balance is insufficient for a credit card.");
        }
    }



    // withdraw  if the user has credit card
    public void withdrawCredit() {
        if (hasCreditCard) {
            if (creditLimit == 1000) {
                creditLimit -= 1000;
                System.out.println("You have withdrawn 1000 from your credit card. You can't withdraw any more today" );
            }

            else {
                System.out.println("You cannot withdraw 1000.");
            }
        }
        else {
            System.out.println("You do not have a credit card.");
            System.out.println("Press 6 if you want to make one.");
        }
    }


}
