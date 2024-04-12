package oop.e_store;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Order {
    private int orderID;
    private int numberOfItems;
    private String items;
    private double totalPrice;
    private String orderDate;

    public Order(ShoppingCart shoppingCart, double totalPrice) {
        this.numberOfItems = shoppingCart.getItems().size();
        this.totalPrice = totalPrice;
        items = getItems(shoppingCart);

        orderDate = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MMM/yyyy"));
    }

    private static String getItems(ShoppingCart shoppingCart) {

        StringBuilder items = new StringBuilder();

        String asterisks = "*".repeat(17);

        items.append("\n").append(asterisks).append("\n");
        for (Item item : shoppingCart.view()) items.append(item).append("\n").append(asterisks).append("\n");

        return items.toString();
    }

    @Override
    public String toString() {
        return String.format("""
                Order Id: %d
                Number of items: %s
                Items: %sTotal Price: ₦%,.2f
                Order Date: %s
                """, orderID, numberOfItems, items, totalPrice, orderDate);
    }
}