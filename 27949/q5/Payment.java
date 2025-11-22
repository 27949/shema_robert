package p27949.q5;

import java.util.Date;

public class Payment extends Charge {
    private String paymentMode;
    private String transactionId;

    public Payment(int id, Date createdDate, Date updatedDate, String companyName, String address, String phoneNumber, String branchName, String locationCode, String vehicleType, String registrationNumber, double dailyRate, String customerName, String licenseNumber, String contactNumber, Date rentalDate, Date returnDate, int rentalDays, double rentalCharge, double penaltyCharge, String paymentMode, String transactionId) throws VehicleRentalException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, branchName, locationCode, vehicleType, registrationNumber, dailyRate, customerName, licenseNumber, contactNumber, rentalDate, returnDate, rentalDays, rentalCharge, penaltyCharge);
        if (paymentMode == null || paymentMode.trim().isEmpty()) {
            throw new VehicleRentalException("Payment mode cannot be empty");
        }
        this.paymentMode = paymentMode;
        this.transactionId = transactionId;
    }

    // Getters and Setters
    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
}
