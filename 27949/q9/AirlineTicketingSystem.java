package p27949.q9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class AirlineTicketingSystem {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter Ticket Record Details:");

            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Airline Name: ");
            String airlineName = scanner.nextLine();

            System.out.print("Address: ");
            String address = scanner.nextLine();

            System.out.print("Contact Email: ");
            String contactEmail = scanner.nextLine();

            System.out.print("Flight Number: ");
            String flightNumber = scanner.nextLine();

            System.out.print("Destination: ");
            String destination = scanner.nextLine();

            System.out.print("Departure Time (yyyy-MM-dd HH:mm): ");
            Date departureTime = parseDateTime(scanner.nextLine());

            System.out.print("Passenger Name: ");
            String passengerName = scanner.nextLine();

            System.out.print("Passport Number: ");
            String passportNumber = scanner.nextLine();

            System.out.print("Nationality: ");
            String nationality = scanner.nextLine();

            System.out.print("Seat Number: ");
            String seatNumber = scanner.nextLine();

            System.out.print("Seat Type (Economy/Business): ");
            String seatType = scanner.nextLine();

            System.out.print("Ticket Number: ");
            String ticketNumber = scanner.nextLine();

            System.out.print("Price: ");
            double price = scanner.nextDouble();
            scanner.nextLine(); 

            System.out.print("Baggage Weight: ");
            double baggageWeight = scanner.nextDouble();
            scanner.nextLine();
            
            System.out.print("Baggage Fee: ");
            double baggageFee = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Payment Date (yyyy-MM-dd): ");
            Date paymentDate = parseDate(scanner.nextLine());

            System.out.print("Payment Mode: ");
            String paymentMode = scanner.nextLine();

            System.out.print("Total Fare: ");
            double totalFare = scanner.nextDouble();
            scanner.nextLine(); 

            TicketRecord record = new TicketRecord(
                id, new Date(), new Date(), airlineName, address, contactEmail, 
                flightNumber, destination, departureTime, passengerName, passportNumber, 
                nationality, seatNumber, seatType, ticketNumber, price, baggageWeight, 
                baggageFee, paymentDate, paymentMode, totalFare
            );

            System.out.println("\nGenerated Invoice: " + record.generateInvoice());

        } catch (AirlineException e) {
            System.err.println("\nError creating ticket record: " + e.getMessage());
        } catch (ParseException e) {
            System.err.println("\nInvalid date format. Please use the specified format.");
        } catch (Exception e) {
            System.err.println("\nAn unexpected error occurred: " + e.getMessage());
        }
    }

    private static Date parseDate(String dateStr) throws ParseException {
        return new SimpleDateFormat("yyyy-MM-dd").parse(dateStr);
    }

    private static Date parseDateTime(String dateTimeStr) throws ParseException {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm").parse(dateTimeStr);
    }
}
