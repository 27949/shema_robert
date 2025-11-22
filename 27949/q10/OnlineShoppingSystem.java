package p27949.q10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class OnlineShoppingSystem {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter Order Record Details:");

            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Store Name: ");
            String storeName = scanner.nextLine();

            System.out.print("Store Address: ");
            String address = scanner.nextLine();

            System.out.print("Store Email: ");
            String email = scanner.nextLine();

            System.out.print("Category Name: ");
            String categoryName = scanner.nextLine();

            System.out.print("Category Code: ");
            String categoryCode = scanner.nextLine();

            System.out.print("Product Name: ");
            String productName = scanner.nextLine();

            System.out.print("Product Code: ");
            String productCode = scanner.nextLine();

            System.out.print("Price: ");
            double price = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Customer Name: ");
            String customerName = scanner.nextLine();

            System.out.print("Contact Number: ");
            String contactNumber = scanner.nextLine();

            System.out.print("Customer Address: ");
            String customerAddress = scanner.nextLine();

            System.out.print("Order Date (yyyy-MM-dd): ");
            Date orderDate = parseDate(scanner.nextLine());

            System.out.print("Order ID: ");
            String orderId = scanner.nextLine();

            System.out.print("Payment Method: ");
            String paymentMethod = scanner.nextLine();

            System.out.print("Payment Status: ");
            String paymentStatus = scanner.nextLine();

            System.out.print("Shipping Address: ");
            String shippingAddress = scanner.nextLine();

            System.out.print("Shipping Cost: ");
            double shippingCost = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Total Amount: ");
            double totalAmount = scanner.nextDouble();
            scanner.nextLine();

            OrderRecord record = new OrderRecord(
                id, new Date(), new Date(), storeName, address, email, categoryName, categoryCode, 
                productName, productCode, price, customerName, contactNumber, customerAddress, 
                orderDate, orderId, paymentMethod, paymentStatus, shippingAddress, shippingCost, totalAmount
            );

            System.out.println("\nCalculated Total Amount: " + record.calculateTotalAmount());

        } catch (ShoppingException e) {
            System.err.println("\nError creating order record: " + e.getMessage());
        } catch (ParseException e) {
            System.err.println("\nInvalid date format. Please use yyyy-MM-dd.");
        } catch (Exception e) {
            System.err.println("\nAn unexpected error occurred: " + e.getMessage());
        }
    }

    private static Date parseDate(String dateStr) throws ParseException {
        return new SimpleDateFormat("yyyy-MM-dd").parse(dateStr);
    }
}
