package prob2;

public class CustomerAccount {
    private String cusName;
    private String accNo;
    private double balance;

    public CustomerAccount(String cusName, String accNo, double balance) {
        this.cusName = cusName;
        this.accNo = accNo;
        this.balance = balance;
    }

    public boolean deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }

        balance += amount;
        return true;
    }

    public boolean withdraw(double amount) {
        if (amount > balance) {
            throw new AccountException("Insufficient funds! Withdrawal amount exceeds balance.");
        }

        if (balance - amount < 100) {
            throw new AccountException("Low balance warning! Balance cannot go below $100.");
        }

        balance -= amount;
        return true;
    }

    public double getBalance() {
        return balance;
    }

    //region Getters and Setters

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //endregion
}