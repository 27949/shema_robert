package p27949.q8;

import java.util.Date;

public class Fine extends Borrow {
    private double fineAmount;
    private int daysLate;

    public Fine(int id, Date createdDate, Date updatedDate, String libraryName, String location, String phoneNumber, String sectionName, String sectionCode, String title, String author, String ISBN, String memberName, int memberId, String contactNumber, Date borrowDate, Date returnDate, double fineAmount, int daysLate) throws LibraryException {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber, sectionName, sectionCode, title, author, ISBN, memberName, memberId, contactNumber, borrowDate, returnDate);
        if (fineAmount < 0) {
            throw new LibraryException("Fine amount cannot be negative");
        }
        this.fineAmount = fineAmount;
        this.daysLate = daysLate;
    }

    // Getters and Setters
    public double getFineAmount() {
        return fineAmount;
    }

    public void setFineAmount(double fineAmount) {
        this.fineAmount = fineAmount;
    }

    public int getDaysLate() {
        return daysLate;
    }

    public void setDaysLate(int daysLate) {
        this.daysLate = daysLate;
    }
}
