package p27949.q10;

import java.util.Date;

public class Shipping extends Payment {
    private String shippingAddress;
    private double shippingCost;

    public Shipping(int id, Date createdDate, Date updatedDate, String storeName, String address, String email, String categoryName, String categoryCode, String productName, String productCode, double price, String customerName, String contactNumber, String customerAddress, Date orderDate, String orderId, String paymentMethod, String paymentStatus, String shippingAddress, double shippingCost) throws ShoppingException {
        super(id, createdDate, updatedDate, storeName, address, email, categoryName, categoryCode, productName, productCode, price, customerName, contactNumber, customerAddress, orderDate, orderId, paymentMethod, paymentStatus);
        if (shippingCost < 0) {
            throw new ShoppingException("Shipping cost cannot be negative");
        }
        this.shippingAddress = shippingAddress;
        this.shippingCost = shippingCost;
    }

    // Getters and Setters
    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public double getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }
}
