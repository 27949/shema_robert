package p27949.q2;

import java.util.Date;

public class StudentRecord extends Fee {
    private double averageMarks;

    public StudentRecord(int id, Date createdDate, Date updatedDate, String schoolName, String address, String phoneNumber, String email, String departmentName, String departmentCode, String teacherName, String subject, String teacherEmail, String phone, String studentName, int rollNumber, String grade, String contactNumber, String courseName, String courseCode, int creditHours, String examName, int maxMarks, Date examDate, int obtainedMarks, String remarks, double tuitionFee, double examFee, double totalFee) throws SchoolDataException {
        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email, departmentName, departmentCode, teacherName, subject, teacherEmail, phone, studentName, rollNumber, grade, contactNumber, courseName, courseCode, creditHours, examName, maxMarks, examDate, obtainedMarks, remarks, tuitionFee, examFee, totalFee);
        this.averageMarks = calculateAverageMarks();
    }

    public double calculateAverageMarks() {
        return (double) getObtainedMarks() / getMaxMarks() * 100;
    }

    public double getAverageMarks() {
        return averageMarks;
    }
}
