package p27949.q5;

import java.util.Date;

public class Customer extends Vehicle {
    private String customerName;
    private String licenseNumber;
    private String contactNumber;

    public Customer(int id, Date createdDate, Date updatedDate, String companyName, String address, String phoneNumber, String branchName, String locationCode, String vehicleType, String registrationNumber, double dailyRate, String customerName, String licenseNumber, String contactNumber) throws VehicleRentalException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, branchName, locationCode, vehicleType, registrationNumber, dailyRate);
        if (licenseNumber == null || licenseNumber.trim().isEmpty()) {
            throw new VehicleRentalException("License number cannot be empty");
        }
        this.customerName = customerName;
        this.licenseNumber = licenseNumber;
        this.contactNumber = contactNumber;
    }

    // Getters and Setters
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
}
