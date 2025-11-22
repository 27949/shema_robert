package p27949.q9;

import java.util.Date;

public final class TicketRecord extends Invoice {

    public TicketRecord(int id, Date createdDate, Date updatedDate, String airlineName, String address, String contactEmail, String flightNumber, String destination, Date departureTime, String passengerName, String passportNumber, String nationality, String seatNumber, String seatType, String ticketNumber, double price, double baggageWeight, double baggageFee, Date paymentDate, String paymentMode, double totalFare) throws AirlineException {
        super(id, createdDate, updatedDate, airlineName, address, contactEmail, flightNumber, destination, departureTime, passengerName, passportNumber, nationality, seatNumber, seatType, ticketNumber, price, baggageWeight, baggageFee, paymentDate, paymentMode, totalFare);
    }

    public double generateInvoice() {
        return getPrice() + getBaggageFee();
    }
}
