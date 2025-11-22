package p27949.q4;

import java.util.Date;

public class Service extends Booking {
    private String serviceName;
    private double serviceCost;

    public Service(int id, Date createdDate, Date updatedDate, String hotelName, String address, String phoneNumber, String email, int roomNumber, String roomType, double pricePerNight, String customerName, String customerEmail, String contactNumber, Date bookingDate, Date checkInDate, Date checkOutDate, String serviceName, double serviceCost) throws HotelReservationException {
        super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email, roomNumber, roomType, pricePerNight, customerName, customerEmail, contactNumber, bookingDate, checkInDate, checkOutDate);
        if (serviceCost <= 0) {
            throw new HotelReservationException("Service cost must be greater than 0");
        }
        this.serviceName = serviceName;
        this.serviceCost = serviceCost;
    }

    // Getters and Setters
    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getServiceCost() {
        return serviceCost;
    }

    public void setServiceCost(double serviceCost) {
        this.serviceCost = serviceCost;
    }
}
