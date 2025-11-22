package p27949.q6;

import java.util.Date;

public class Payment extends Loan {
    private double paymentAmount;
    private Date paymentDate;

    public Payment(int id, Date createdDate, Date updatedDate, String bankName, String branchCode, String address, String accountNumber, String accountType, double balance, String customerName, String email, String phoneNumber, String transactionId, String transactionType, double amount, double depositAmount, Date depositDate, double withdrawalAmount, Date withdrawalDate, double loanAmount, double interestRate, int duration, double paymentAmount, Date paymentDate) throws BankingException {
        super(id, createdDate, updatedDate, bankName, branchCode, address, accountNumber, accountType, balance, customerName, email, phoneNumber, transactionId, transactionType, amount, depositAmount, depositDate, withdrawalAmount, withdrawalDate, loanAmount, interestRate, duration);
        if (paymentAmount <= 0) {
            throw new BankingException("Payment amount must be greater than 0");
        }
        this.paymentAmount = paymentAmount;
        this.paymentDate = paymentDate;
    }

    // Getters and Setters
    public double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }
}
