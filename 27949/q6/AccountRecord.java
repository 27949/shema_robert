package p27949.q6;

import java.util.Date;

public final class AccountRecord extends Payment {

    public AccountRecord(int id, Date createdDate, Date updatedDate, String bankName, String branchCode, String address, String accountNumber, String accountType, double balance, String customerName, String email, String phoneNumber, String transactionId, String transactionType, double amount, double depositAmount, Date depositDate, double withdrawalAmount, Date withdrawalDate, double loanAmount, double interestRate, int duration, double paymentAmount, Date paymentDate) throws BankingException {
        super(id, createdDate, updatedDate, bankName, branchCode, address, accountNumber, accountType, balance, customerName, email, phoneNumber, transactionId, transactionType, amount, depositAmount, depositDate, withdrawalAmount, withdrawalDate, loanAmount, interestRate, duration, paymentAmount, paymentDate);
    }

    public double calculateInterest() {
        return (getLoanAmount() * getInterestRate() * getDuration()) / 100;
    }
}
