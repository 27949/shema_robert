package p27949.q9;

import java.util.Date;

public class Invoice extends Payment {
    private double totalFare;

    public Invoice(int id, Date createdDate, Date updatedDate, String airlineName, String address, String contactEmail, String flightNumber, String destination, Date departureTime, String passengerName, String passportNumber, String nationality, String seatNumber, String seatType, String ticketNumber, double price, double baggageWeight, double baggageFee, Date paymentDate, String paymentMode, double totalFare) throws AirlineException {
        super(id, createdDate, updatedDate, airlineName, address, contactEmail, flightNumber, destination, departureTime, passengerName, passportNumber, nationality, seatNumber, seatType, ticketNumber, price, baggageWeight, baggageFee, paymentDate, paymentMode);
        if (totalFare <= 0) {
            throw new AirlineException("Total fare must be greater than 0");
        }
        this.totalFare = totalFare;
    }

    // Getters and Setters
    public double getTotalFare() {
        return totalFare;
    }

    public void setTotalFare(double totalFare) {
        this.totalFare = totalFare;
    }
}
