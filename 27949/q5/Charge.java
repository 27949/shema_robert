package p27949.q5;

import java.util.Date;

public class Charge extends Rental {
    private double rentalCharge;
    private double penaltyCharge;

    public Charge(int id, Date createdDate, Date updatedDate, String companyName, String address, String phoneNumber, String branchName, String locationCode, String vehicleType, String registrationNumber, double dailyRate, String customerName, String licenseNumber, String contactNumber, Date rentalDate, Date returnDate, int rentalDays, double rentalCharge, double penaltyCharge) throws VehicleRentalException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, branchName, locationCode, vehicleType, registrationNumber, dailyRate, customerName, licenseNumber, contactNumber, rentalDate, returnDate, rentalDays);
        if (rentalCharge < 0 || penaltyCharge < 0) {
            throw new VehicleRentalException("Charges cannot be negative");
        }
        this.rentalCharge = rentalCharge;
        this.penaltyCharge = penaltyCharge;
    }

    // Getters and Setters
    public double getRentalCharge() {
        return rentalCharge;
    }

    public void setRentalCharge(double rentalCharge) {
        this.rentalCharge = rentalCharge;
    }

    public double getPenaltyCharge() {
        return penaltyCharge;
    }

    public void setPenaltyCharge(double penaltyCharge) {
        this.penaltyCharge = penaltyCharge;
    }
}
