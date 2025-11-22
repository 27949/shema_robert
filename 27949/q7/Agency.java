package p27949.q7;

import java.util.Date;
import java.util.regex.Pattern;

public class Agency extends Entity {
    private String agencyName;
    private String location;
    private String phoneNumber;

    public Agency(int id, Date createdDate, Date updatedDate, String agencyName, String location, String phoneNumber) throws RealEstateException {
        super(id, createdDate, updatedDate);
        if (!isValidPhoneNumber(phoneNumber)) {
            throw new RealEstateException("Invalid phone number format");
        }
        this.agencyName = agencyName;
        this.location = location;
        this.phoneNumber = phoneNumber;
    }

    private boolean isValidPhoneNumber(String phoneNumber) {
        return Pattern.compile("^\\d{10}$").matcher(phoneNumber).matches();
    }

    // Getters and Setters
    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
