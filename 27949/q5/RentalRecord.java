package p27949.q5;

import java.util.Date;

public final class RentalRecord extends Invoice {

    public RentalRecord(int id, Date createdDate, Date updatedDate, String companyName, String address, String phoneNumber, String branchName, String locationCode, String vehicleType, String registrationNumber, double dailyRate, String customerName, String licenseNumber, String contactNumber, Date rentalDate, Date returnDate, int rentalDays, double rentalCharge, double penaltyCharge, String paymentMode, String transactionId, double totalCharge) throws VehicleRentalException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, branchName, locationCode, vehicleType, registrationNumber, dailyRate, customerName, licenseNumber, contactNumber, rentalDate, returnDate, rentalDays, rentalCharge, penaltyCharge, paymentMode, transactionId, totalCharge);
    }

    public double calculateTotalCharge() {
        return getRentalCharge() + getPenaltyCharge();
    }
}
