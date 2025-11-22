package p27949.q2;

import java.util.Date;

public class Department extends School {
    private String departmentName;
    private String departmentCode;

    public Department(int id, Date createdDate, Date updatedDate, String schoolName, String address, String phoneNumber, String email, String departmentName, String departmentCode) throws SchoolDataException {
        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email);
        if (departmentCode.length() < 3 || !departmentCode.matches("^[a-zA-Z0-9]*$")) {
            throw new SchoolDataException("Department code must be at least 3 characters long and be alphanumeric.");
        }
        this.departmentName = departmentName;
        this.departmentCode = departmentCode;
    }

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
