package p27949.q8;

import java.util.Date;

public class Record extends Payment {
    private double totalFine;

    public Record(int id, Date createdDate, Date updatedDate, String libraryName, String location, String phoneNumber, String sectionName, String sectionCode, String title, String author, String ISBN, String memberName, int memberId, String contactNumber, Date borrowDate, Date returnDate, double fineAmount, int daysLate, Date paymentDate, String paymentMode, double totalFine) throws LibraryException {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber, sectionName, sectionCode, title, author, ISBN, memberName, memberId, contactNumber, borrowDate, returnDate, fineAmount, daysLate, paymentDate, paymentMode);
        if (totalFine <= 0) {
            throw new LibraryException("Total fine must be greater than 0");
        }
        this.totalFine = totalFine;
    }

    // Getters and Setters
    public double getTotalFine() {
        return totalFine;
    }

    public void setTotalFine(double totalFine) {
        this.totalFine = totalFine;
    }
}
