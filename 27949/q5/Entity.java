package p27949.q5;

import java.util.Date;

public class Entity {
    private int id;
    private Date createdDate;
    private Date updatedDate;

    public Entity(int id, Date createdDate, Date updatedDate) throws VehicleRentalException {
        if (id <= 0) {
            throw new VehicleRentalException("ID must be greater than 0");
        }
        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }
}
