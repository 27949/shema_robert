package p27949.q4;

import java.util.Date;

public class Payment extends Service {
    private String paymentMethod;
    private Date paymentDate;

    public Payment(int id, Date createdDate, Date updatedDate, String hotelName, String address, String phoneNumber, String email, int roomNumber, String roomType, double pricePerNight, String customerName, String customerEmail, String contactNumber, Date bookingDate, Date checkInDate, Date checkOutDate, String serviceName, double serviceCost, String paymentMethod, Date paymentDate) throws HotelReservationException {
        super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email, roomNumber, roomType, pricePerNight, customerName, customerEmail, contactNumber, bookingDate, checkInDate, checkOutDate, serviceName, serviceCost);
        if (paymentMethod == null || paymentDate == null) {
            throw new HotelReservationException("Payment method and date cannot be null");
        }
        this.paymentMethod = paymentMethod;
        this.paymentDate = paymentDate;
    }

    // Getters and Setters
    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }
}
