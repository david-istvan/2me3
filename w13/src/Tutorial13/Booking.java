package Tutorial13;

import java.util.ArrayList;
import java.util.List;

public class Booking {
    private String startDate;
    private String endDate;
    private List<Product> products; // Changed to a list for dynamic addition

    // Constructor that initializes startDate, endDate, and products
    public Booking(String startDate, String endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.products = new ArrayList<>(); // Initialize the products list
    }

    // Method to add a product to the list of products
    public void addProduct(Product product) {
        this.products.add(product);
    }

    // If needed, methods to retrieve the values of startDate, endDate, and products can be public
    // For example:
    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public List<Product> getProducts() {
        return products;
    }

    public String toString() {
        String bookingStr = "Start date : " + startDate + " , End date: " + endDate;
        for (Product product : products) {
            bookingStr += "\n    <> " + product;
        }
        return bookingStr;
    }
}
