package p27949.q2;

import java.util.Date;
import java.util.Scanner;

public class SchoolMngtSys {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter School Details:");
            System.out.print("Name: ");
            String schoolName = scanner.nextLine();
            System.out.print("Address: ");
            String address = scanner.nextLine();
            System.out.print("Phone Number: ");
            String phoneNumber = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();

            System.out.println("\nEnter Department Details:");
            System.out.print("Name: ");
            String departmentName = scanner.nextLine();
            System.out.print("Code: ");
            String departmentCode = scanner.nextLine();

            System.out.println("\nEnter Teacher Details:");
            System.out.print("Name: ");
            String teacherName = scanner.nextLine();
            System.out.print("Subject: ");
            String subject = scanner.nextLine();
            System.out.print("Email: ");
            String teacherEmail = scanner.nextLine();
            System.out.print("Phone: ");
            String phone = scanner.nextLine();

            System.out.println("\nEnter Student Details:");
            System.out.print("Name: ");
            String studentName = scanner.nextLine();
            System.out.print("Roll Number: ");
            int rollNumber = Integer.parseInt(scanner.nextLine());
            System.out.print("Grade: ");
            String grade = scanner.nextLine();
            System.out.print("Contact Number: ");
            String contactNumber = scanner.nextLine();

            System.out.println("\nEnter Course Details:");
            System.out.print("Name: ");
            String courseName = scanner.nextLine();
            System.out.print("Code: ");
            String courseCode = scanner.nextLine();
            System.out.print("Credit Hours: ");
            int creditHours = Integer.parseInt(scanner.nextLine());

            System.out.println("\nEnter Exam Details:");
            System.out.print("Name: ");
            String examName = scanner.nextLine();
            System.out.print("Max Marks: ");
            int maxMarks = Integer.parseInt(scanner.nextLine());

            System.out.println("\nEnter Result Details:");
            System.out.print("Obtained Marks: ");
            int obtainedMarks = Integer.parseInt(scanner.nextLine());
            System.out.print("Remarks: ");
            String remarks = scanner.nextLine();

            System.out.println("\nEnter Fee Details:");
            System.out.print("Tuition Fee: ");
            double tuitionFee = Double.parseDouble(scanner.nextLine());
            System.out.print("Exam Fee: ");
            double examFee = Double.parseDouble(scanner.nextLine());
            double totalFee = tuitionFee + examFee;

            StudentRecord record = new StudentRecord(1, new Date(), new Date(), schoolName, address, phoneNumber, email, departmentName, departmentCode, teacherName, subject, teacherEmail, phone, studentName, rollNumber, grade, contactNumber, courseName, courseCode, creditHours, examName, maxMarks, new Date(), obtainedMarks, remarks, tuitionFee, examFee, totalFee);

            System.out.println("\n--- Student Record ---");
            System.out.println("School: " + record.getSchoolName());
            System.out.println("Department: " + record.getDepartmentName());
            System.out.println("Teacher: " + record.getTeacherName());
            System.out.println("Student: " + record.getStudentName());
            System.out.println("Course: " + record.getCourseName());
            System.out.println("Average Marks: " + record.getAverageMarks());
            System.out.println("Total Fee: " + record.getTotalFee());

        } catch (SchoolDataException | NumberFormatException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
