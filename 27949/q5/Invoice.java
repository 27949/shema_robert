package p27949.q5;

import java.util.Date;

public class Invoice extends Payment {
    private double totalCharge;

    public Invoice(int id, Date createdDate, Date updatedDate, String companyName, String address, String phoneNumber, String branchName, String locationCode, String vehicleType, String registrationNumber, double dailyRate, String customerName, String licenseNumber, String contactNumber, Date rentalDate, Date returnDate, int rentalDays, double rentalCharge, double penaltyCharge, String paymentMode, String transactionId, double totalCharge) throws VehicleRentalException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, branchName, locationCode, vehicleType, registrationNumber, dailyRate, customerName, licenseNumber, contactNumber, rentalDate, returnDate, rentalDays, rentalCharge, penaltyCharge, paymentMode, transactionId);
        if (totalCharge <= 0) {
            throw new VehicleRentalException("Total charge must be greater than 0");
        }
        this.totalCharge = totalCharge;
    }

    // Getters and Setters
    public double getTotalCharge() {
        return totalCharge;
    }

    public void setTotalCharge(double totalCharge) {
        this.totalCharge = totalCharge;
    }
}
