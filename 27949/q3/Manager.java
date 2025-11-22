package p27949.q3;

import java.util.Date;

public class Manager extends Department {
    private String managerName;
    private String managerEmail;
    private String phone;

    public Manager(int id, Date createdDate, Date updatedDate, String companyName, String address, String phoneNumber, String email, String departmentName, String departmentCode, String managerName, String managerEmail, String phone) throws PayrollDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, email, departmentName, departmentCode);
        if (managerName.isEmpty()) {
            throw new PayrollDataException("Manager name cannot be empty");
        }
        if (!managerEmail.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$")) {
            throw new PayrollDataException("Invalid email format");
        }
        if (!phone.matches("^\\d{10}$")) {
            throw new PayrollDataException("Phone number must be 10 digits");
        }
        this.managerName = managerName;
        this.managerEmail = managerEmail;
        this.phone = phone;
    }

    // Getters and Setters
    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getManagerEmail() {
        return managerEmail;
    }

    public void setManagerEmail(String managerEmail) {
        this.managerEmail = managerEmail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
