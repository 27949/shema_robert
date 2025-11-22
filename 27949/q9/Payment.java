package p27949.q9;

import java.util.Date;

public class Payment extends Baggage {
    private Date paymentDate;
    private String paymentMode;

    public Payment(int id, Date createdDate, Date updatedDate, String airlineName, String address, String contactEmail, String flightNumber, String destination, Date departureTime, String passengerName, String passportNumber, String nationality, String seatNumber, String seatType, String ticketNumber, double price, double baggageWeight, double baggageFee, Date paymentDate, String paymentMode) throws AirlineException {
        super(id, createdDate, updatedDate, airlineName, address, contactEmail, flightNumber, destination, departureTime, passengerName, passportNumber, nationality, seatNumber, seatType, ticketNumber, price, baggageWeight, baggageFee);
        if (paymentDate == null || paymentMode == null || paymentMode.trim().isEmpty()) {
            throw new AirlineException("Payment date and mode cannot be empty");
        }
        this.paymentDate = paymentDate;
        this.paymentMode = paymentMode;
    }

    // Getters and Setters
    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }
}
