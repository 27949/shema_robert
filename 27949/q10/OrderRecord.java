package p27949.q10;

import java.util.Date;

public final class OrderRecord extends Invoice {

    public OrderRecord(int id, Date createdDate, Date updatedDate, String storeName, String address, String email, String categoryName, String categoryCode, String productName, String productCode, double price, String customerName, String contactNumber, String customerAddress, Date orderDate, String orderId, String paymentMethod, String paymentStatus, String shippingAddress, double shippingCost, double totalAmount) throws ShoppingException {
        super(id, createdDate, updatedDate, storeName, address, email, categoryName, categoryCode, productName, productCode, price, customerName, contactNumber, customerAddress, orderDate, orderId, paymentMethod, paymentStatus, shippingAddress, shippingCost, totalAmount);
    }

    public double calculateTotalAmount() {
        return getPrice() + getShippingCost();
    }
}
