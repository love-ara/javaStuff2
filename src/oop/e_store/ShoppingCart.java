package oop.e_store;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items;
    private int quantity;

    public ShoppingCart() {
        items = new ArrayList<>();
        this.quantity = 0;
    }

    public void add(Product product, int quantity) {
        if (isPresent(product)) updateQuantity(product, quantity);

        else items.add(new Item(product, quantity));
        this.quantity += quantity;
    }

    private void updateQuantity(Product product, int quantity) {
        Item foundItem = findItemBy(product.getProductId());
        foundItem.updateQuantityOfProduct(quantity);
    }

    private boolean isPresent(Product product) {
        for (Item item : items) if (item.getProduct().equals(product)) return true;

        return false;
    }

    public void remove(String productId, int quantity) {
        if (items.isEmpty()) throw new IllegalStateException("Shopping cart is empty");

        Item foundItem = findItemBy(productId);
        if (this.quantity >= quantity)
            items.remove(foundItem);
        //this.quantity -= quantity;
    }

    private Item findItemBy(String productId) {
        for (Item item : items) {
            Product product = item.getProduct();
            if (product.getProductId().equals(productId)) return item;
        }

        throw new ItemNotFoundException("Item is not in the cart.");
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public List<Item> getItems() {
        return items;
    }

//    public double calculatePrice() {
//        double totalPrice = 0.0;
//        for (Item item : items)
//            totalPrice += (item.getProduct().getPrice()*item.getQuantityOfProduct());
//        return totalPrice;
//    }

    public List<Item> view() {
        return items;
    }




}



