package p27949.q7;

import java.util.Date;
import java.util.regex.Pattern;

public class Buyer extends Seller {
    private String buyerName;
    private String email;

    public Buyer(int id, Date createdDate, Date updatedDate, String agencyName, String location, String phoneNumber, String agentName, String agentEmail, String licenseNumber, String propertyCode, String propertyType, double price, String sellerName, String contactNumber, String buyerName, String buyerEmail) throws RealEstateException {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber, agentName, agentEmail, licenseNumber, propertyCode, propertyType, price, sellerName, contactNumber);
        if (!isValidEmail(buyerEmail)) {
            throw new RealEstateException("Invalid buyer email format");
        }
        this.buyerName = buyerName;
        this.email = buyerEmail;
    }

    private boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        return Pattern.compile(emailRegex).matcher(email).matches();
    }

    // Getters and Setters
    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }
}
