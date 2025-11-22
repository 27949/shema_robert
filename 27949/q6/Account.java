package p27949.q6;

import java.util.Date;

public class Account extends Bank {
    private String accountNumber;
    private String accountType;
    private double balance;

    public Account(int id, Date createdDate, Date updatedDate, String bankName, String branchCode, String address, String accountNumber, String accountType, double balance) throws BankingException {
        super(id, createdDate, updatedDate, bankName, branchCode, address);
        if (balance < 0) {
            throw new BankingException("Balance cannot be negative");
        }
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    // Getters and Setters
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
