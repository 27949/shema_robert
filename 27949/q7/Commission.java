package p27949.q7;

import java.util.Date;

public class Commission extends Payment {
    private double commissionRate;
    private double commissionAmount;

    public Commission(int id, Date createdDate, Date updatedDate, String agencyName, String location, String phoneNumber, String agentName, String agentEmail, String licenseNumber, String propertyCode, String propertyType, double price, String sellerName, String contactNumber, String buyerName, String buyerEmail, Date agreementDate, String terms, double paymentAmount, Date paymentDate, double commissionRate, double commissionAmount) throws RealEstateException {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber, agentName, agentEmail, licenseNumber, propertyCode, propertyType, price, sellerName, contactNumber, buyerName, buyerEmail, agreementDate, terms, paymentAmount, paymentDate);
        if (commissionRate < 0) {
            throw new RealEstateException("Commission rate cannot be negative");
        }
        this.commissionRate = commissionRate;
        this.commissionAmount = commissionAmount;
    }

    // Getters and Setters
    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public double getCommissionAmount() {
        return commissionAmount;
    }

    public void setCommissionAmount(double commissionAmount) {
        this.commissionAmount = commissionAmount;
    }
}
