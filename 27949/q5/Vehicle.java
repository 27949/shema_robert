package p27949.q5;

import java.util.Date;

public class Vehicle extends Branch {
    private String vehicleType;
    private String registrationNumber;
    private double dailyRate;

    public Vehicle(int id, Date createdDate, Date updatedDate, String companyName, String address, String phoneNumber, String branchName, String locationCode, String vehicleType, String registrationNumber, double dailyRate) throws VehicleRentalException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, branchName, locationCode);
        if (dailyRate <= 0) {
            throw new VehicleRentalException("Daily rate must be greater than 0");
        }
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
        this.dailyRate = dailyRate;
    }

    // Getters and Setters
    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }
}
