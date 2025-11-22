package p27949.q10;

import java.util.Date;

public class Order extends Customer {
    private Date orderDate;
    private String orderId;

    public Order(int id, Date createdDate, Date updatedDate, String storeName, String address, String email, String categoryName, String categoryCode, String productName, String productCode, double price, String customerName, String contactNumber, String customerAddress, Date orderDate, String orderId) throws ShoppingException {
        super(id, createdDate, updatedDate, storeName, address, email, categoryName, categoryCode, productName, productCode, price, customerName, contactNumber, customerAddress);
        if (orderDate == null || orderId.trim().isEmpty()) {
            throw new ShoppingException("Order date and ID cannot be empty");
        }
        this.orderDate = orderDate;
        this.orderId = orderId;
    }

    // Getters and Setters
    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
}
