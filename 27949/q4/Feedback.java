package p27949.q4;

import java.util.Date;

public class Feedback extends Bill {
    private int rating;
    private String comments;

    public Feedback(int id, Date createdDate, Date updatedDate, String hotelName, String address, String phoneNumber, String email, int roomNumber, String roomType, double pricePerNight, String customerName, String customerEmail, String contactNumber, Date bookingDate, Date checkInDate, Date checkOutDate, String serviceName, double serviceCost, String paymentMethod, Date paymentDate, double roomCharge, double serviceCharge, double totalBill, int rating, String comments) throws HotelReservationException {
        super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email, roomNumber, roomType, pricePerNight, customerName, customerEmail, contactNumber, bookingDate, checkInDate, checkOutDate, serviceName, serviceCost, paymentMethod, paymentDate, roomCharge, serviceCharge, totalBill);
        if (rating < 1 || rating > 5) {
            throw new HotelReservationException("Rating must be between 1 and 5");
        }
        this.rating = rating;
        this.comments = comments;
    }

    // Getters and Setters
    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
