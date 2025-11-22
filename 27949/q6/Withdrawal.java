package p27949.q6;

import java.util.Date;

public class Withdrawal extends Deposit {
    private double withdrawalAmount;
    private Date withdrawalDate;

    public Withdrawal(int id, Date createdDate, Date updatedDate, String bankName, String branchCode, String address, String accountNumber, String accountType, double balance, String customerName, String email, String phoneNumber, String transactionId, String transactionType, double amount, double depositAmount, Date depositDate, double withdrawalAmount, Date withdrawalDate) throws BankingException {
        super(id, createdDate, updatedDate, bankName, branchCode, address, accountNumber, accountType, balance, customerName, email, phoneNumber, transactionId, transactionType, amount, depositAmount, depositDate);
        if (withdrawalAmount <= 0) {
            throw new BankingException("Withdrawal amount must be greater than 0");
        }
        this.withdrawalAmount = withdrawalAmount;
        this.withdrawalDate = withdrawalDate;
    }

    // Getters and Setters
    public double getWithdrawalAmount() {
        return withdrawalAmount;
    }

    public void setWithdrawalAmount(double withdrawalAmount) {
        this.withdrawalAmount = withdrawalAmount;
    }

    public Date getWithdrawalDate() {
        return withdrawalDate;
    }

    public void setWithdrawalDate(Date withdrawalDate) {
        this.withdrawalDate = withdrawalDate;
    }
}
