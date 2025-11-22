package p27949.q8;

import java.util.Date;

public final class LibraryRecord extends Record {

    public LibraryRecord(int id, Date createdDate, Date updatedDate, String libraryName, String location, String phoneNumber, String sectionName, String sectionCode, String title, String author, String ISBN, String memberName, int memberId, String contactNumber, Date borrowDate, Date returnDate, double fineAmount, int daysLate, Date paymentDate, String paymentMode, double totalFine) throws LibraryException {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber, sectionName, sectionCode, title, author, ISBN, memberName, memberId, contactNumber, borrowDate, returnDate, fineAmount, daysLate, paymentDate, paymentMode, totalFine);
    }

    public double calculateFine() {
        return getFineAmount() * getDaysLate();
    }
}
