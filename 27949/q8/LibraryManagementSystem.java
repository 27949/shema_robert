package p27949.q8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter Library Record Details:");

            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Library Name: ");
            String libraryName = scanner.nextLine();

            System.out.print("Location: ");
            String location = scanner.nextLine();

            System.out.print("Phone Number: ");
            String phoneNumber = scanner.nextLine();

            System.out.print("Section Name: ");
            String sectionName = scanner.nextLine();

            System.out.print("Section Code: ");
            String sectionCode = scanner.nextLine();

            System.out.print("Title: ");
            String title = scanner.nextLine();

            System.out.print("Author: ");
            String author = scanner.nextLine();

            System.out.print("ISBN: ");
            String isbn = scanner.nextLine();

            System.out.print("Member Name: ");
            String memberName = scanner.nextLine();

            System.out.print("Member ID: ");
            int memberId = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Member Contact Number: ");
            String contactNumber = scanner.nextLine();

            System.out.print("Borrow Date (yyyy-MM-dd): ");
            Date borrowDate = parseDate(scanner.nextLine());

            System.out.print("Return Date (yyyy-MM-dd): ");
            Date returnDate = parseDate(scanner.nextLine());

            System.out.print("Fine Amount: ");
            double fineAmount = scanner.nextDouble();
            scanner.nextLine(); 

            System.out.print("Days Late: ");
            int daysLate = scanner.nextInt();
            scanner.nextLine();
            
            System.out.print("Payment Date (yyyy-MM-dd): ");
            Date paymentDate = parseDate(scanner.nextLine());

            System.out.print("Payment Mode: ");
            String paymentMode = scanner.nextLine();

            System.out.print("Total Fine: ");
            double totalFine = scanner.nextDouble();
            scanner.nextLine(); 

            LibraryRecord record = new LibraryRecord(
                id, new Date(), new Date(), libraryName, location, phoneNumber, 
                sectionName, sectionCode, title, author, isbn, memberName, memberId, 
                contactNumber, borrowDate, returnDate, fineAmount, daysLate, 
                paymentDate, paymentMode, totalFine
            );

            System.out.println("\nCalculated Fine: " + record.calculateFine());

        } catch (LibraryException e) {
            System.err.println("\nError creating library record: " + e.getMessage());
        } catch (ParseException e) {
            System.err.println("\nInvalid date format. Please use yyyy-MM-dd.");
        } catch (Exception e) {
            System.err.println("\nAn unexpected error occurred: " + e.getMessage());
        }
    }

    private static Date parseDate(String dateStr) throws ParseException {
        return new SimpleDateFormat("yyyy-MM-dd").parse(dateStr);
    }
}
