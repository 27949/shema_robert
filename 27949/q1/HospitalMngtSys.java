package p27949.q1;

import java.util.Date;
import java.util.Scanner;

public class HospitalMngtSys {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter Entity Details:");
            System.out.print("ID: ");
            String idStr = scanner.nextLine();
            int id = idStr.isEmpty() ? 1 : Integer.parseInt(idStr);

            System.out.println("\nEnter Hospital Details:");
            System.out.print("Name: ");
            String hospitalName = scanner.nextLine();
            if (hospitalName.isEmpty()) {
                hospitalName = "General Hospital";
            }
            System.out.print("Address: ");
            String address = scanner.nextLine();
            if (address.isEmpty()) {
                address = "123 Main St";
            }
            System.out.print("Phone Number: ");
            String phoneNumber = scanner.nextLine();
            if (phoneNumber.isEmpty()) {
                phoneNumber = "1234567890";
            }
            System.out.print("Email: ");
            String email = scanner.nextLine();
            if (email.isEmpty()) {
                email = "contact@generalhospital.com";
            }

            System.out.println("\nEnter Department Details:");
            System.out.print("Name: ");
            String departmentName = scanner.nextLine();
            if (departmentName.isEmpty()) {
                departmentName = "Cardiology";
            }
            System.out.print("Code: ");
            String departmentCode = scanner.nextLine();
            if (departmentCode.isEmpty()) {
                departmentCode = "CARD";
            }

            System.out.println("\nEnter Doctor Details:");
            System.out.print("Name: ");
            String doctorName = scanner.nextLine();
            if (doctorName.isEmpty()) {
                doctorName = "Dr. Smith";
            }
            System.out.print("Specialization: ");
            String specialization = scanner.nextLine();
            if (specialization.isEmpty()) {
                specialization = "Cardiologist";
            }
            System.out.print("Email: ");
            String doctorEmail = scanner.nextLine();
            if (doctorEmail.isEmpty()) {
                doctorEmail = "dr.smith@generalhospital.com";
            }
            System.out.print("Phone: ");
            String doctorPhone = scanner.nextLine();
            if (doctorPhone.isEmpty()) {
                doctorPhone = "0987654321";
            }

            System.out.println("\nEnter Nurse Details:");
            System.out.print("Name: ");
            String nurseName = scanner.nextLine();
            if (nurseName.isEmpty()) {
                nurseName = "Nurse Betty";
            }
            System.out.print("Shift (Day/Night): ");
            String shift = scanner.nextLine();
            if (shift.isEmpty()) {
                shift = "Day";
            }
            System.out.print("Years of Experience: ");
            String yearsStr = scanner.nextLine();
            int yearsOfExperience = yearsStr.isEmpty() ? 5 : Integer.parseInt(yearsStr);

            System.out.println("\nEnter Patient Details:");
            System.out.print("Name: ");
            String patientName = scanner.nextLine();
            if (patientName.isEmpty()) {
                patientName = "John Doe";
            }
            System.out.print("Age: ");
            String ageStr = scanner.nextLine();
            int age = ageStr.isEmpty() ? 30 : Integer.parseInt(ageStr);
            System.out.print("Gender (Male/Female/Other): ");
            String gender = scanner.nextLine();
            if (gender.isEmpty()) {
                gender = "Male";
            }
            System.out.print("Contact Number: ");
            String contactNumber = scanner.nextLine();
            if (contactNumber.isEmpty()) {
                contactNumber = "1122334455";
            }

            System.out.println("\nEnter Admission Details:");
            System.out.print("Room Number: ");
            String roomStr = scanner.nextLine();
            int roomNumber = roomStr.isEmpty() ? 101 : Integer.parseInt(roomStr);
            System.out.print("Room Charges: ");
            String chargesStr = scanner.nextLine();
            double roomCharges = chargesStr.isEmpty() ? 500.0 : Double.parseDouble(chargesStr);

            System.out.println("\nEnter Treatment Details:");
            System.out.print("Diagnosis: ");
            String diagnosis = scanner.nextLine();
            if (diagnosis.isEmpty()) {
                diagnosis = "Fever";
            }
            System.out.print("Treatment Given: ");
            String treatmentGiven = scanner.nextLine();
            if (treatmentGiven.isEmpty()) {
                treatmentGiven = "Paracetamol";
            }
            System.out.print("Treatment Cost: ");
            String treatmentCostStr = scanner.nextLine();
            double treatmentCost = treatmentCostStr.isEmpty() ? 100.0 : Double.parseDouble(treatmentCostStr);

            System.out.println("\nEnter Bill Details:");
            System.out.print("Doctor Fee: ");
            String feeStr = scanner.nextLine();
            double doctorFee = feeStr.isEmpty() ? 200.0 : Double.parseDouble(feeStr);
            System.out.print("Medicine Cost: ");
            String medicineCostStr = scanner.nextLine();
            double medicineCost = medicineCostStr.isEmpty() ? 50.0 : Double.parseDouble(medicineCostStr);

            HospitalRecord record = new HospitalRecord(id, new Date(), new Date(), hospitalName, address, phoneNumber, email, departmentName, departmentCode, doctorName, specialization, doctorEmail, doctorPhone, nurseName, shift, yearsOfExperience, patientName, age, gender, contactNumber, new Date(), roomNumber, roomCharges, diagnosis, treatmentGiven, treatmentCost, doctorFee, medicineCost);

            System.out.println("\n--- Hospital Record ---");
            System.out.println("Patient Name: " + record.getPatientName());
            System.out.println("Age: " + record.getAge());
            System.out.println("Gender: " + record.getGender());
            System.out.println("Contact: " + record.getContactNumber());
            System.out.println("\n--- Admission & Treatment ---");
            System.out.println("Room Number: " + record.getRoomNumber());
            System.out.println("Admission Date: " + record.getAdmissionDate());
            System.out.println("Diagnosis: " + record.getDiagnosis());
            System.out.println("Treatment: " + record.getTreatmentGiven());
            System.out.println("\n--- Bill ---");
            System.out.println("Room Charges: " + record.getRoomCharges());
            System.out.println("Treatment Cost: " + record.getTreatmentCost());
            System.out.println("Doctor Fee: " + record.getDoctorFee());
            System.out.println("Medicine Cost: " + record.getMedicineCost());
            System.out.println("Total Bill: " + record.generateBill());

        } catch (HospitalDataException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
