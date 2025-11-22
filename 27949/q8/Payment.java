package p27949.q8;

import java.util.Date;

public class Payment extends Fine {
    private Date paymentDate;
    private String paymentMode;

    public Payment(int id, Date createdDate, Date updatedDate, String libraryName, String location, String phoneNumber, String sectionName, String sectionCode, String title, String author, String ISBN, String memberName, int memberId, String contactNumber, Date borrowDate, Date returnDate, double fineAmount, int daysLate, Date paymentDate, String paymentMode) throws LibraryException {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber, sectionName, sectionCode, title, author, ISBN, memberName, memberId, contactNumber, borrowDate, returnDate, fineAmount, daysLate);
        if (paymentDate == null || paymentMode == null || paymentMode.trim().isEmpty()) {
            throw new LibraryException("Payment date and mode cannot be empty");
        }
        this.paymentDate = paymentDate;
        this.paymentMode = paymentMode;
    }

    // Getters and Setters
    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }
}
