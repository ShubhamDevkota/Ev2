package models;

public class Account {
    private String accountHolderName;

    // Constructor
    public Account(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    // Getter and Setter for accountHolderName
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    // Method that can be overridden by child classes if needed
    public void showAccountDetails() {
        System.out.println("Account Holder: " + accountHolderName);
    }
}
