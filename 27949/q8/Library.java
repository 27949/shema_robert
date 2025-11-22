package p27949.q8;

import java.util.Date;
import java.util.regex.Pattern;

public class Library extends Entity {
    private String libraryName;
    private String location;
    private String phoneNumber;

    public Library(int id, Date createdDate, Date updatedDate, String libraryName, String location, String phoneNumber) throws LibraryException {
        super(id, createdDate, updatedDate);
        if (!isValidPhoneNumber(phoneNumber)) {
            throw new LibraryException("Invalid phone number format");
        }
        this.libraryName = libraryName;
        this.location = location;
        this.phoneNumber = phoneNumber;
    }

    private boolean isValidPhoneNumber(String phoneNumber) {
        return Pattern.compile("^\\d{10}$").matcher(phoneNumber).matches();
    }

    // Getters and Setters
    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
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
