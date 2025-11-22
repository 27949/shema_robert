package p27949.q7;

import java.util.Date;

public final class RealEstateRecord extends Commission {

    public RealEstateRecord(int id, Date createdDate, Date updatedDate, String agencyName, String location, String phoneNumber, String agentName, String agentEmail, String licenseNumber, String propertyCode, String propertyType, double price, String sellerName, String contactNumber, String buyerName, String buyerEmail, Date agreementDate, String terms, double paymentAmount, Date paymentDate, double commissionRate, double commissionAmount) throws RealEstateException {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber, agentName, agentEmail, licenseNumber, propertyCode, propertyType, price, sellerName, contactNumber, buyerName, buyerEmail, agreementDate, terms, paymentAmount, paymentDate, commissionRate, commissionAmount);
    }

    public double calculateCommission() {
        return (getPrice() * getCommissionRate()) / 100;
    }
}
