package oop.e_store;

import java.util.ArrayList;
import java.util.List;

public class Customer extends User{
    private ShoppingCart shoppingCart;
    private BillingInformation billingInformation;
    private List<Order> orders = new ArrayList<>();



    public Customer(String id, String name, String email, String password, String phone) {
        super(id, name, email, password, phone);
    }
    public List<Item> viewCart() {
        return shoppingCart.view();
    }

    public void addToCart(Product product, int quantity) {
        shoppingCart.add(product, quantity);
    }

    public void removeFromCart(String productId, int quantity) {

        shoppingCart.remove(productId, quantity);
    }

    public void checkout() {
        Order newOrder = Checkout.placeOrder(shoppingCart, billingInformation);
        orders.add(newOrder);

        shoppingCart = new ShoppingCart();
    }

    public void setBillingInformation(BillingInformation billingInformation) {
        this.billingInformation = billingInformation;
    }

    public List<Order> viewOrders() {
        return orders;
    }

    public BillingInformation getBillingInformation() {
        return billingInformation;
    }

    public ShoppingCart getCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public String getId(){
        String id = "1";
        return id;
    }
}
