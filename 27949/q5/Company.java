package p27949.q5;

import java.util.Date;

public class Company extends Entity {
    private String companyName;
    private String address;
    private String phoneNumber;

    public Company(int id, Date createdDate, Date updatedDate, String companyName, String address, String phoneNumber) throws VehicleRentalException {
        super(id, createdDate, updatedDate);
        if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) {
            throw new VehicleRentalException("Phone number must be 10 digits");
        }
        this.companyName = companyName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    // Getters and Setters
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
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
}
