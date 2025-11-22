package p27949.q5;

import java.util.Date;
import java.util.Scanner;
import java.util.UUID;

public class VehicleRentalSystem {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter Vehicle Rental Details:");

            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Company Name: ");
            String companyName = scanner.nextLine();

            System.out.print("Address: ");
            String address = scanner.nextLine();

            System.out.print("Phone Number: ");
            String phoneNumber = scanner.nextLine();

            System.out.print("Branch Name: ");
            String branchName = scanner.nextLine();

            System.out.print("Location Code: ");
            String locationCode = scanner.nextLine();

            System.out.print("Vehicle Type: ");
            String vehicleType = scanner.nextLine();

            System.out.print("Registration Number: ");
            String registrationNumber = scanner.nextLine();

            System.out.print("Daily Rate: ");
            double dailyRate = scanner.nextDouble();
            scanner.nextLine(); 

            System.out.print("Customer Name: ");
            String customerName = scanner.nextLine();

            System.out.print("License Number: ");
            String licenseNumber = scanner.nextLine();

            System.out.print("Contact Number: ");
            String contactNumber = scanner.nextLine();

            System.out.print("Rental Days: ");
            int rentalDays = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Rental Charge: ");
            double rentalCharge = scanner.nextDouble();
            scanner.nextLine(); 

            System.out.print("Penalty Charge: ");
            double penaltyCharge = scanner.nextDouble();
            scanner.nextLine(); 

            System.out.print("Payment Mode: ");
            String paymentMode = scanner.nextLine();

            System.out.print("Total Charge: ");
            double totalCharge = scanner.nextDouble();
            scanner.nextLine(); 

            RentalRecord record = new RentalRecord(
                id, new Date(), new Date(), companyName, address, phoneNumber, 
                branchName, locationCode, vehicleType, registrationNumber, dailyRate, 
                customerName, licenseNumber, contactNumber, new Date(), new Date(), 
                rentalDays, rentalCharge, penaltyCharge, paymentMode, UUID.randomUUID().toString(), totalCharge
            );

            System.out.println("\nTotal charge: " + record.calculateTotalCharge());
        } catch (VehicleRentalException e) {
            System.err.println("\nError creating rental record: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("\nAn unexpected error occurred: " + e.getMessage());
        }
    }
}
