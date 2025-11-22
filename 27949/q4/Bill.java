package p27949.q4;

import java.util.Date;

public class Bill extends Payment {
    private double roomCharge;
    private double serviceCharge;
    private double totalBill;

    public Bill(int id, Date createdDate, Date updatedDate, String hotelName, String address, String phoneNumber, String email, int roomNumber, String roomType, double pricePerNight, String customerName, String customerEmail, String contactNumber, Date bookingDate, Date checkInDate, Date checkOutDate, String serviceName, double serviceCost, String paymentMethod, Date paymentDate, double roomCharge, double serviceCharge, double totalBill) throws HotelReservationException {
        super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email, roomNumber, roomType, pricePerNight, customerName, customerEmail, contactNumber, bookingDate, checkInDate, checkOutDate, serviceName, serviceCost, paymentMethod, paymentDate);
        if (roomCharge <= 0 || serviceCharge <= 0 || totalBill <= 0) {
            throw new HotelReservationException("Room charge, service charge, and total bill must be greater than 0");
        }
        this.roomCharge = roomCharge;
        this.serviceCharge = serviceCharge;
        this.totalBill = totalBill;
    }

    // Getters and Setters
    public double getRoomCharge() {
        return roomCharge;
    }

    public void setRoomCharge(double roomCharge) {
        this.roomCharge = roomCharge;
    }

    public double getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(double serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public double getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(double totalBill) {
        this.totalBill = totalBill;
    }
}
