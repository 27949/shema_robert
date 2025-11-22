package p27949.q4;

import java.util.Date;

public class ReservationRecord extends Feedback {

    public ReservationRecord(int id, Date createdDate, Date updatedDate, String hotelName, String address, String phoneNumber, String email, int roomNumber, String roomType, double pricePerNight, String customerName, String customerEmail, String contactNumber, Date bookingDate, Date checkInDate, Date checkOutDate, String serviceName, double serviceCost, String paymentMethod, Date paymentDate, double roomCharge, double serviceCharge, double totalBill, int rating, String comments) throws HotelReservationException {
        super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email, roomNumber, roomType, pricePerNight, customerName, customerEmail, contactNumber, bookingDate, checkInDate, checkOutDate, serviceName, serviceCost, paymentMethod, paymentDate, roomCharge, serviceCharge, totalBill, rating, comments);
    }

    public double generateBill() {
        return getRoomCharge() + getServiceCharge();
    }
}
