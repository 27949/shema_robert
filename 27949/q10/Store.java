package p27949.q10;

import java.util.Date;
import java.util.regex.Pattern;

public class Store extends Entity {
    private String storeName;
    private String address;
    private String email;

    public Store(int id, Date createdDate, Date updatedDate, String storeName, String address, String email) throws ShoppingException {
        super(id, createdDate, updatedDate);
        if (!isValidEmail(email)) {
            throw new ShoppingException("Invalid email format");
        }
        this.storeName = storeName;
        this.address = address;
        this.email = email;
    }

    private boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        return Pattern.compile(emailRegex).matcher(email).matches();
    }

    // Getters and Setters
    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
