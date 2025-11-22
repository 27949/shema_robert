package p27949.q7;

import java.util.Date;

public class Agreement extends Buyer {
    private Date agreementDate;
    private String terms;

    public Agreement(int id, Date createdDate, Date updatedDate, String agencyName, String location, String phoneNumber, String agentName, String agentEmail, String licenseNumber, String propertyCode, String propertyType, double price, String sellerName, String contactNumber, String buyerName, String buyerEmail, Date agreementDate, String terms) throws RealEstateException {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber, agentName, agentEmail, licenseNumber, propertyCode, propertyType, price, sellerName, contactNumber, buyerName, buyerEmail);
        if (terms == null || terms.trim().isEmpty()) {
            throw new RealEstateException("Terms cannot be empty");
        }
        this.agreementDate = agreementDate;
        this.terms = terms;
    }

    // Getters and Setters
    public Date getAgreementDate() {
        return agreementDate;
    }

    public void setAgreementDate(Date agreementDate) {
        this.agreementDate = agreementDate;
    }

    public String getTerms() {
        return terms;
    }

    public void setTerms(String terms) {
        this.terms = terms;
    }
}
