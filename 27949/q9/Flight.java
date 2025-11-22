package p27949.q9;

import java.util.Date;

public class Flight extends Airline {
    private String flightNumber;
    private String destination;
    private Date departureTime;

    public Flight(int id, Date createdDate, Date updatedDate, String airlineName, String address, String contactEmail, String flightNumber, String destination, Date departureTime) throws AirlineException {
        super(id, createdDate, updatedDate, airlineName, address, contactEmail);
        if (flightNumber == null || flightNumber.trim().isEmpty() || 
            destination == null || destination.trim().isEmpty() || 
            departureTime == null) {
            throw new AirlineException("Flight number, destination, and departure time cannot be empty");
        }
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
    }

    // Getters and Setters
    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }
}
