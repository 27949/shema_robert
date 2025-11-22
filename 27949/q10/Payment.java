package p27949.q10;

import java.util.Date;

public class Payment extends Order {
    private String paymentMethod;
    private String paymentStatus;

    public Payment(int id, Date createdDate, Date updatedDate, String storeName, String address, String email, String categoryName, String categoryCode, String productName, String productCode, double price, String customerName, String contactNumber, String customerAddress, Date orderDate, String orderId, String paymentMethod, String paymentStatus) throws ShoppingException {
        super(id, createdDate, updatedDate, storeName, address, email, categoryName, categoryCode, productName, productCode, price, customerName, contactNumber, customerAddress, orderDate, orderId);
        if (paymentMethod.trim().isEmpty() || paymentStatus.trim().isEmpty()) {
            throw new ShoppingException("Payment method and status cannot be empty");
        }
        this.paymentMethod = paymentMethod;
        this.paymentStatus = paymentStatus;
    }

    // Getters and Setters
    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}
