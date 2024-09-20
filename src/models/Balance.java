package models;


public class Balance extends Account{
    private double balance;

    // Constructor to
    public Balance(String accountHolderName, double balance) {
        super(accountHolderName);
        this.balance = balance;
    }

    // Getter Setter for balance
    public double getBalance() {
        return balance;
    }


    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Deposit amount into the balance
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited to balance: " + amount + ". Updated balance: " + balance);
    }

    // Withdraw amount from the balance
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + ". Updated balance: " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }




}


