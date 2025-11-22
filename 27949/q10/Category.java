package p27949.q10;

import java.util.Date;

public class Category extends Store {
    private String categoryName;
    private String categoryCode;

    public Category(int id, Date createdDate, Date updatedDate, String storeName, String address, String email, String categoryName, String categoryCode) throws ShoppingException {
        super(id, createdDate, updatedDate, storeName, address, email);
        if (categoryName.length() < 3) {
            throw new ShoppingException("Category name must have at least 3 characters");
        }
        this.categoryName = categoryName;
        this.categoryCode = categoryCode;
    }

    // Getters and Setters
    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }
}
