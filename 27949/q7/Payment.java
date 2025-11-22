package p27949.q7;

import java.util.Date;

public class Payment extends Agreement {
    private double paymentAmount;
    private Date paymentDate;

    public Payment(int id, Date createdDate, Date updatedDate, String agencyName, String location, String phoneNumber, String agentName, String agentEmail, String licenseNumber, String propertyCode, String propertyType, double price, String sellerName, String contactNumber, String buyerName, String buyerEmail, Date agreementDate, String terms, double paymentAmount, Date paymentDate) throws RealEstateException {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber, agentName, agentEmail, licenseNumber, propertyCode, propertyType, price, sellerName, contactNumber, buyerName, buyerEmail, agreementDate, terms);
        if (paymentAmount <= 0) {
            throw new RealEstateException("Payment amount must be greater than 0");
        }
        this.paymentAmount = paymentAmount;
        this.paymentDate = paymentDate;
    }

    // Getters and Setters
    public double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }
}
