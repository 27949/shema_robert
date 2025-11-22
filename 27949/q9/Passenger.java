package p27949.q9;

import java.util.Date;

public class Passenger extends Flight {
    private String passengerName;
    private String passportNumber;
    private String nationality;

    public Passenger(int id, Date createdDate, Date updatedDate, String airlineName, String address, String contactEmail, String flightNumber, String destination, Date departureTime, String passengerName, String passportNumber, String nationality) throws AirlineException {
        super(id, createdDate, updatedDate, airlineName, address, contactEmail, flightNumber, destination, departureTime);
        if (passportNumber == null || passportNumber.trim().isEmpty()) {
            throw new AirlineException("Passport number cannot be empty");
        }
        this.passengerName = passengerName;
        this.passportNumber = passportNumber;
        this.nationality = nationality;
    }

    // Getters and Setters
    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
