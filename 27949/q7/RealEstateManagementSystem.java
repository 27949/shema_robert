package p27949.q7;

import java.util.Date;
import java.util.Scanner;

public class RealEstateManagementSystem {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter Real Estate Details:");

            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Agency Name: ");
            String agencyName = scanner.nextLine();

            System.out.print("Location: ");
            String location = scanner.nextLine();

            System.out.print("Phone Number: ");
            String phoneNumber = scanner.nextLine();

            System.out.print("Agent Name: ");
            String agentName = scanner.nextLine();

            System.out.print("Agent Email: ");
            String agentEmail = scanner.nextLine();

            System.out.print("License Number: ");
            String licenseNumber = scanner.nextLine();

            System.out.print("Property Code: ");
            String propertyCode = scanner.nextLine();

            System.out.print("Property Type: ");
            String propertyType = scanner.nextLine();

            System.out.print("Price: ");
            double price = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Seller Name: ");
            String sellerName = scanner.nextLine();

            System.out.print("Seller Contact Number: ");
            String contactNumber = scanner.nextLine();

            System.out.print("Buyer Name: ");
            String buyerName = scanner.nextLine();

            System.out.print("Buyer Email: ");
            String buyerEmail = scanner.nextLine();

            System.out.print("Terms: ");
            String terms = scanner.nextLine();

            System.out.print("Payment Amount: ");
            double paymentAmount = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Commission Rate: ");
            double commissionRate = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Commission Amount: ");
            double commissionAmount = scanner.nextDouble();
            scanner.nextLine();

            RealEstateRecord record = new RealEstateRecord(
                id, new Date(), new Date(), agencyName, location, phoneNumber, 
                agentName, agentEmail, licenseNumber, propertyCode, propertyType, 
                price, sellerName, contactNumber, buyerName, buyerEmail, 
                new Date(), terms, paymentAmount, new Date(), commissionRate, commissionAmount
            );

            System.out.println("\nCalculated Commission: " + record.calculateCommission());

        } catch (RealEstateException e) {
            System.err.println("\nError creating real estate record: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("\nAn unexpected error occurred: " + e.getMessage());
        }
    }
}
