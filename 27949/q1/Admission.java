package p27949.q1;

import java.util.Date;

public class Admission extends Patient {
    private Date admissionDate;
    private int roomNumber;
    private double roomCharges;

    public Admission(int id, Date createdDate, Date updatedDate, String hospitalName, String address, String phoneNumber, String email, String departmentName, String departmentCode, String doctorName, String specialization, String doctorEmail, String phone, String nurseName, String shift, int yearsOfExperience, String patientName, int age, String gender, String contactNumber, Date admissionDate, int roomNumber, double roomCharges) throws HospitalDataException {
        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email, departmentName, departmentCode, doctorName, specialization, doctorEmail, phone, nurseName, shift, yearsOfExperience, patientName, age, gender, contactNumber);
        if (admissionDate == null) {
            throw new HospitalDataException("Admission date cannot be null.");
        }
        if (roomCharges <= 0) {
            throw new HospitalDataException("Room charges must be greater than 0.");
        }
        this.admissionDate = admissionDate;
        this.roomNumber = roomNumber;
        this.roomCharges = roomCharges;
    }

    public Date getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(Date admissionDate) {
        this.admissionDate = admissionDate;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public double getRoomCharges() {
        return roomCharges;
    }

    public void setRoomCharges(double roomCharges) {
        this.roomCharges = roomCharges;
    }
}
