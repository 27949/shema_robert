package p27949.q10;

import java.util.Date;

public class Product extends Category {
    private String productName;
    private String productCode;
    private double price;

    public Product(int id, Date createdDate, Date updatedDate, String storeName, String address, String email, String categoryName, String categoryCode, String productName, String productCode, double price) throws ShoppingException {
        super(id, createdDate, updatedDate, storeName, address, email, categoryName, categoryCode);
        if (price <= 0) {
            throw new ShoppingException("Price must be greater than 0");
        }
        this.productName = productName;
        this.productCode = productCode;
        this.price = price;
    }

    // Getters and Setters
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
