package p27949.q9;

import java.util.Date;
import java.util.regex.Pattern;

public class Airline extends Entity {
    private String airlineName;
    private String address;
    private String contactEmail;

    public Airline(int id, Date createdDate, Date updatedDate, String airlineName, String address, String contactEmail) throws AirlineException {
        super(id, createdDate, updatedDate);
        if (!isValidEmail(contactEmail)) {
            throw new AirlineException("Invalid email format");
        }
        this.airlineName = airlineName;
        this.address = address;
        this.contactEmail = contactEmail;
    }

    private boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        return Pattern.compile(emailRegex).matcher(email).matches();
    }

    // Getters and Setters
    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }
}
