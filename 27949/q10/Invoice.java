package p27949.q10;

import java.util.Date;

public class Invoice extends Shipping {
    private double totalAmount;

    public Invoice(int id, Date createdDate, Date updatedDate, String storeName, String address, String email, String categoryName, String categoryCode, String productName, String productCode, double price, String customerName, String contactNumber, String customerAddress, Date orderDate, String orderId, String paymentMethod, String paymentStatus, String shippingAddress, double shippingCost, double totalAmount) throws ShoppingException {
        super(id, createdDate, updatedDate, storeName, address, email, categoryName, categoryCode, productName, productCode, price, customerName, contactNumber, customerAddress, orderDate, orderId, paymentMethod, paymentStatus, shippingAddress, shippingCost);
        if (totalAmount <= 0) {
            throw new ShoppingException("Total amount must be greater than 0");
        }
        this.totalAmount = totalAmount;
    }

    // Getters and Setters
    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
