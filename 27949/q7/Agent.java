package p27949.q7;

import java.util.Date;
import java.util.regex.Pattern;

public class Agent extends Agency {
    private String agentName;
    private String email;
    private String licenseNumber;

    public Agent(int id, Date createdDate, Date updatedDate, String agencyName, String location, String phoneNumber, String agentName, String email, String licenseNumber) throws RealEstateException {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber);
        if (!isValidEmail(email)) {
            throw new RealEstateException("Invalid email format");
        }
        this.agentName = agentName;
        this.email = email;
        this.licenseNumber = licenseNumber;
    }

    private boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        return Pattern.compile(emailRegex).matcher(email).matches();
    }

    // Getters and Setters
    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }
}
