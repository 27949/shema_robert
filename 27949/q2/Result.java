package p27949.q2;

import java.util.Date;

public class Result extends Exam {
    private int obtainedMarks;
    private String remarks;

    public Result(int id, Date createdDate, Date updatedDate, String schoolName, String address, String phoneNumber, String email, String departmentName, String departmentCode, String teacherName, String subject, String teacherEmail, String phone, String studentName, int rollNumber, String grade, String contactNumber, String courseName, String courseCode, int creditHours, String examName, int maxMarks, Date examDate, int obtainedMarks, String remarks) throws SchoolDataException {
        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email, departmentName, departmentCode, teacherName, subject, teacherEmail, phone, studentName, rollNumber, grade, contactNumber, courseName, courseCode, creditHours, examName, maxMarks, examDate);
        if (obtainedMarks < 0) {
            throw new SchoolDataException("Obtained marks cannot be negative");
        }
        if (remarks.isEmpty()) {
            throw new SchoolDataException("Remarks cannot be empty");
        }
        this.obtainedMarks = obtainedMarks;
        this.remarks = remarks;
    }

    public int getObtainedMarks() {
        return obtainedMarks;
    }

    public void setObtainedMarks(int obtainedMarks) {
        this.obtainedMarks = obtainedMarks;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
