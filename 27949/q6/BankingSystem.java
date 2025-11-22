package p27949.q6;

import java.util.Date;
import java.util.Scanner;
import java.util.UUID;

public class BankingSystem {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter Banking Details:");

            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Bank Name: ");
            String bankName = scanner.nextLine();

            System.out.print("Branch Code: ");
            String branchCode = scanner.nextLine();

            System.out.print("Address: ");
            String address = scanner.nextLine();

            System.out.print("Account Number: ");
            String accountNumber = scanner.nextLine();

            System.out.print("Account Type: ");
            String accountType = scanner.nextLine();

            System.out.print("Balance: ");
            double balance = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Customer Name: ");
            String customerName = scanner.nextLine();

            System.out.print("Email: ");
            String email = scanner.nextLine();

            System.out.print("Phone Number: ");
            String phoneNumber = scanner.nextLine();

            System.out.print("Transaction Type: ");
            String transactionType = scanner.nextLine();

            System.out.print("Amount: ");
            double amount = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Deposit Amount: ");
            double depositAmount = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Withdrawal Amount: ");
            double withdrawalAmount = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Loan Amount: ");
            double loanAmount = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Interest Rate: ");
            double interestRate = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Duration (in years): ");
            int duration = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Payment Amount: ");
            double paymentAmount = scanner.nextDouble();
            scanner.nextLine();

            AccountRecord record = new AccountRecord(
                id, new Date(), new Date(), bankName, branchCode, address, 
                accountNumber, accountType, balance, customerName, email, 
                phoneNumber, UUID.randomUUID().toString(), transactionType, 
                amount, depositAmount, new Date(), withdrawalAmount, new Date(), 
                loanAmount, interestRate, duration, paymentAmount, new Date()
            );

            System.out.println("\nCalculated Interest: " + record.calculateInterest());
        } catch (BankingException e) {
            System.err.println("\nError creating account record: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("\nAn unexpected error occurred: " + e.getMessage());
        }
    }
}
