package p27949.q6;

import java.util.Date;

public class Deposit extends Transaction {
    private double depositAmount;
    private Date depositDate;

    public Deposit(int id, Date createdDate, Date updatedDate, String bankName, String branchCode, String address, String accountNumber, String accountType, double balance, String customerName, String email, String phoneNumber, String transactionId, String transactionType, double amount, double depositAmount, Date depositDate) throws BankingException {
        super(id, createdDate, updatedDate, bankName, branchCode, address, accountNumber, accountType, balance, customerName, email, phoneNumber, transactionId, transactionType, amount);
        if (depositAmount <= 0) {
            throw new BankingException("Deposit amount must be greater than 0");
        }
        this.depositAmount = depositAmount;
        this.depositDate = depositDate;
    }

    // Getters and Setters
    public double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public Date getDepositDate() {
        return depositDate;
    }

    public void setDepositDate(Date depositDate) {
        this.depositDate = depositDate;
    }
}
