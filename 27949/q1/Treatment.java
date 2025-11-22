package p27949.q1;

import java.util.Date;

public class Treatment extends Admission {
    private String diagnosis;
    private String treatmentGiven;
    private double treatmentCost;

    public Treatment(int id, Date createdDate, Date updatedDate, String hospitalName, String address, String phoneNumber, String email, String departmentName, String departmentCode, String doctorName, String specialization, String doctorEmail, String phone, String nurseName, String shift, int yearsOfExperience, String patientName, int age, String gender, String contactNumber, Date admissionDate, int roomNumber, double roomCharges, String diagnosis, String treatmentGiven, double treatmentCost) throws HospitalDataException {
        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email, departmentName, departmentCode, doctorName, specialization, doctorEmail, phone, nurseName, shift, yearsOfExperience, patientName, age, gender, contactNumber, admissionDate, roomNumber, roomCharges);
        if (diagnosis.isEmpty() || treatmentGiven.isEmpty()) {
            throw new HospitalDataException("Diagnosis and treatment cannot be empty.");
        }
        if (treatmentCost <= 0) {
            throw new HospitalDataException("Treatment cost must be greater than 0.");
        }
        this.diagnosis = diagnosis;
        this.treatmentGiven = treatmentGiven;
        this.treatmentCost = treatmentCost;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getTreatmentGiven() {
        return treatmentGiven;
    }

    public void setTreatmentGiven(String treatmentGiven) {
        this.treatmentGiven = treatmentGiven;
    }

    public double getTreatmentCost() {
        return treatmentCost;
    }

    public void setTreatmentCost(double treatmentCost) {
        this.treatmentCost = treatmentCost;
    }
}
