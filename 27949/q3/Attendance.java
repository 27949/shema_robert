package p27949.q3;

import java.util.Date;

public class Attendance extends Employee {
    private int totalDays;
    private int presentDays;
    private int leaveDays;

    public Attendance(int id, Date createdDate, Date updatedDate, String companyName, String address, String phoneNumber, String email, String departmentName, String departmentCode, String managerName, String managerEmail, String phone, String employeeName, int employeeId, String designation, String contactNumber, int totalDays, int presentDays, int leaveDays) throws PayrollDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, email, departmentName, departmentCode, managerName, managerEmail, phone, employeeName, employeeId, designation, contactNumber);
        if (totalDays < 0 || presentDays < 0 || leaveDays < 0) {
            throw new PayrollDataException("Days cannot be negative");
        }
        if (presentDays > totalDays) {
            throw new PayrollDataException("Present days cannot be greater than total days");
        }
        this.totalDays = totalDays;
        this.presentDays = presentDays;
        this.leaveDays = leaveDays;
    }

    // Getters and Setters
    public int getTotalDays() {
        return totalDays;
    }

    public void setTotalDays(int totalDays) {
        this.totalDays = totalDays;
    }

    public int getPresentDays() {
        return presentDays;
    }

    public void setPresentDays(int presentDays) {
        this.presentDays = presentDays;
    }

    public int getLeaveDays() {
        return leaveDays;
    }

    public void setLeaveDays(int leaveDays) {
        this.leaveDays = leaveDays;
    }
}
