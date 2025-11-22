package p27949.q7;

import java.util.Date;

public class Seller extends Property {
    private String sellerName;
    private String contactNumber;

    public Seller(int id, Date createdDate, Date updatedDate, String agencyName, String location, String phoneNumber, String agentName, String email, String licenseNumber, String propertyCode, String propertyType, double price, String sellerName, String contactNumber) throws RealEstateException {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber, agentName, email, licenseNumber, propertyCode, propertyType, price);
        if (sellerName == null || sellerName.trim().isEmpty()) {
            throw new RealEstateException("Seller name cannot be empty");
        }
        this.sellerName = sellerName;
        this.contactNumber = contactNumber;
    }

    // Getters and Setters
    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
}
