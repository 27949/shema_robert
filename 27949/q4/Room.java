package p27949.q4;

import java.util.Date;

public class Room extends Hotel {
    private int roomNumber;
    private String roomType;
    private double pricePerNight;

    public Room(int id, Date createdDate, Date updatedDate, String hotelName, String address, String phoneNumber, String email, int roomNumber, String roomType, double pricePerNight) throws HotelReservationException {
        super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email);
        if (pricePerNight <= 0) {
            throw new HotelReservationException("Price per night must be greater than 0");
        }
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.pricePerNight = pricePerNight;
    }

    // Getters and Setters
    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }
}
