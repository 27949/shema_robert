package p27949.q4;

import java.util.Date;
import java.util.Scanner;

public class HotelReservationSystem {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter Reservation Details:");

            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            System.out.print("Hotel Name: ");
            String hotelName = scanner.nextLine();

            System.out.print("Address: ");
            String address = scanner.nextLine();

            System.out.print("Phone Number: ");
            String phoneNumber = scanner.nextLine();

            System.out.print("Email: ");
            String email = scanner.nextLine();

            System.out.print("Room Number: ");
            int roomNumber = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            System.out.print("Room Type: ");
            String roomType = scanner.nextLine();

            System.out.print("Price Per Night: ");
            double pricePerNight = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            System.out.print("Customer Name: ");
            String customerName = scanner.nextLine();

            System.out.print("Customer Email: ");
            String customerEmail = scanner.nextLine();

            System.out.print("Contact Number: ");
            String contactNumber = scanner.nextLine();

            System.out.print("Service Name: ");
            String serviceName = scanner.nextLine();

            System.out.print("Service Cost: ");
            double serviceCost = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            System.out.print("Payment Method: ");
            String paymentMethod = scanner.nextLine();

            System.out.print("Room Charge: ");
            double roomCharge = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            System.out.print("Service Charge: ");
            double serviceCharge = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            System.out.print("Total Bill: ");
            double totalBill = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            System.out.print("Rating (1-5): ");
            int rating = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            System.out.print("Comments: ");
            String comments = scanner.nextLine();

            ReservationRecord record = new ReservationRecord(
                id, new Date(), new Date(), hotelName, address, phoneNumber, 
                email, roomNumber, roomType, pricePerNight, customerName, customerEmail, 
                contactNumber, new Date(), new Date(), new Date(), serviceName, serviceCost, 
                paymentMethod, new Date(), roomCharge, serviceCharge, totalBill, rating, comments
            );
            System.out.println("\nTotal bill: " + record.generateBill());
        } catch (HotelReservationException e) {
            System.err.println("\nError creating reservation: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("\nAn unexpected error occurred: " + e.getMessage());
        }
    }
}
