package p27949.q1;

import java.util.Date;
import java.util.regex.Pattern;

public class Doctor extends Department {
    private String doctorName;
    private String specialization;
    private String doctorEmail;
    private String phone;

    public Doctor(int id, Date createdDate, Date updatedDate, String hospitalName, String address, String phoneNumber, String email, String departmentName, String departmentCode, String doctorName, String specialization, String doctorEmail, String phone) throws HospitalDataException {
        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email, departmentName, departmentCode);
        if (specialization.isEmpty()) {
            throw new HospitalDataException("Specialization cannot be empty.");
        }
        if (!Pattern.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$", doctorEmail)) {
            throw new HospitalDataException("Invalid email format.");
        }
        if (phone.length() != 10) {
            throw new HospitalDataException("Phone number must be 10 digits.");
        }
        this.doctorName = doctorName;
        this.specialization = specialization;
        this.doctorEmail = doctorEmail;
        this.phone = phone;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getDoctorEmail() {
        return doctorEmail;
    }

    public void setDoctorEmail(String doctorEmail) {
        this.doctorEmail = doctorEmail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
