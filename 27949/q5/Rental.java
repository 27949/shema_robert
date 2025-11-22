package p27949.q5;

import java.util.Date;

public class Rental extends Customer {
    private Date rentalDate;
    private Date returnDate;
    private int rentalDays;

    public Rental(int id, Date createdDate, Date updatedDate, String companyName, String address, String phoneNumber, String branchName, String locationCode, String vehicleType, String registrationNumber, double dailyRate, String customerName, String licenseNumber, String contactNumber, Date rentalDate, Date returnDate, int rentalDays) throws VehicleRentalException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, branchName, locationCode, vehicleType, registrationNumber, dailyRate, customerName, licenseNumber, contactNumber);
        if (rentalDays <= 0) {
            throw new VehicleRentalException("Rental days must be greater than 0");
        }
        this.rentalDate = rentalDate;
        this.returnDate = returnDate;
        this.rentalDays = rentalDays;
    }

    // Getters and Setters
    public Date getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(Date rentalDate) {
        this.rentalDate = rentalDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public void setRentalDays(int rentalDays) {
        this.rentalDays = rentalDays;
    }
}
