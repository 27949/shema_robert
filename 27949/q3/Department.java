package p27949.q3;

import java.util.Date;

public class Department extends Company {
    private String departmentName;
    private String departmentCode;

    public Department(int id, Date createdDate, Date updatedDate, String companyName, String address, String phoneNumber, String email, String departmentName, String departmentCode) throws PayrollDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, email);
        if (!departmentCode.matches("^[a-zA-Z0-9]{3,}$")) {
            throw new PayrollDataException("Department code must be alphanumeric and have at least 3 characters");
        }
        this.departmentName = departmentName;
        this.departmentCode = departmentCode;
    }

    // Getters and Setters
    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }
}
