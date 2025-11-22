package p27949.q7;

import java.util.Date;

public class Property extends Agent {
    private String propertyCode;
    private String propertyType;
    private double price;

    public Property(int id, Date createdDate, Date updatedDate, String agencyName, String location, String phoneNumber, String agentName, String email, String licenseNumber, String propertyCode, String propertyType, double price) throws RealEstateException {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber, agentName, email, licenseNumber);
        if (price <= 0) {
            throw new RealEstateException("Price must be greater than 0");
        }
        this.propertyCode = propertyCode;
        this.propertyType = propertyType;
        this.price = price;
    }

    // Getters and Setters
    public String getPropertyCode() {
        return propertyCode;
    }

    public void setPropertyCode(String propertyCode) {
        this.propertyCode = propertyCode;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
