package p27949.q8;

import java.util.Date;

public class Borrow extends Member {
    private Date borrowDate;
    private Date returnDate;

    public Borrow(int id, Date createdDate, Date updatedDate, String libraryName, String location, String phoneNumber, String sectionName, String sectionCode, String title, String author, String ISBN, String memberName, int memberId, String contactNumber, Date borrowDate, Date returnDate) throws LibraryException {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber, sectionName, sectionCode, title, author, ISBN, memberName, memberId, contactNumber);
        if (borrowDate == null || returnDate == null) {
            throw new LibraryException("Borrow date and return date cannot be empty");
        }
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
    }

    // Getters and Setters
    public Date getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(Date borrowDate) {
        this.borrowDate = borrowDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }
}
