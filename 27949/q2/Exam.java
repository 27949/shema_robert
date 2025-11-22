package p27949.q2;

import java.util.Date;

public class Exam extends Course {
    private String examName;
    private int maxMarks;
    private Date examDate;

    public Exam(int id, Date createdDate, Date updatedDate, String schoolName, String address, String phoneNumber, String email, String departmentName, String departmentCode, String teacherName, String subject, String teacherEmail, String phone, String studentName, int rollNumber, String grade, String contactNumber, String courseName, String courseCode, int creditHours, String examName, int maxMarks, Date examDate) throws SchoolDataException {
        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email, departmentName, departmentCode, teacherName, subject, teacherEmail, phone, studentName, rollNumber, grade, contactNumber, courseName, courseCode, creditHours);
        if (maxMarks <= 0) {
            throw new SchoolDataException("Max marks must be greater than 0");
        }
        if (examDate == null) {
            throw new SchoolDataException("Exam date cannot be empty");
        }
        this.examName = examName;
        this.maxMarks = maxMarks;
        this.examDate = examDate;
    }

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }

    public int getMaxMarks() {
        return maxMarks;
    }

    public void setMaxMarks(int maxMarks) {
        this.maxMarks = maxMarks;
    }

    public Date getExamDate() {
        return examDate;
    }

    public void setExamDate(Date examDate) {
        this.examDate = examDate;
    }
}
