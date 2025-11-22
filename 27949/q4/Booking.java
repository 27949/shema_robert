package p27949.q4;

import java.util.Date;

public class Booking extends Customer {
    private Date bookingDate;
    private Date checkInDate;
    private Date checkOutDate;

    public Booking(int id, Date createdDate, Date updatedDate, String hotelName, String address, String phoneNumber, String email, int roomNumber, String roomType, double pricePerNight, String customerName, String customerEmail, String contactNumber, Date bookingDate, Date checkInDate, Date checkOutDate) throws HotelReservationException {
        super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email, roomNumber, roomType, pricePerNight, customerName, customerEmail, contactNumber);
        if (bookingDate == null || checkInDate == null || checkOutDate == null) {
            throw new HotelReservationException("Dates cannot be null");
        }
        this.bookingDate = bookingDate;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    // Getters and Setters
    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public Date getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(Date checkInDate) {
        this.checkInDate = checkInDate;
    }

    public Date getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(Date checkOutDate) {
        this.checkOutDate = checkOutDate;
    }
}
