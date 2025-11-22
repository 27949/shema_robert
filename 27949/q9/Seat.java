package p27949.q9;

import java.util.Date;

public class Seat extends Passenger {
    private String seatNumber;
    private String seatType;

    public Seat(int id, Date createdDate, Date updatedDate, String airlineName, String address, String contactEmail, String flightNumber, String destination, Date departureTime, String passengerName, String passportNumber, String nationality, String seatNumber, String seatType) throws AirlineException {
        super(id, createdDate, updatedDate, airlineName, address, contactEmail, flightNumber, destination, departureTime, passengerName, passportNumber, nationality);
        if (!seatType.equals("Economy") && !seatType.equals("Business")) {
            throw new AirlineException("Seat type must be either Economy or Business");
        }
        this.seatNumber = seatNumber;
        this.seatType = seatType;
    }

    // Getters and Setters
    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getSeatType() {
        return seatType;
    }

    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }
}
