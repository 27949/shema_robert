package p27949.q1;

import java.util.Date;
import java.util.regex.Pattern;

public class Hospital extends Entity {
    private String hospitalName;
    private String address;
    private String phoneNumber;
    private String email;

    public Hospital(int id, Date createdDate, Date updatedDate, String hospitalName, String address, String phoneNumber, String email) throws HospitalDataException {
        super(id, createdDate, updatedDate);
        if (phoneNumber.length() != 10) {
            throw new HospitalDataException("Phone number must be 10 digits.");
        }
        if (!Pattern.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$", email)) {
            throw new HospitalDataException("Invalid email format.");
        }
        this.hospitalName = hospitalName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
