//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Checkout {
//    public static Order placeOrder(ShoppingCart shoppingCart, BillingInformation billingInformation) {
//        validate(shoppingCart, billingInformation);
//        double totalPrice = calculateTotalPrice(shoppingCart);
//
//        return new Order(shoppingCart, totalPrice);
//    }
//
//    public static void validate(ShoppingCart shoppingCart, BillingInformation billingInformation){
//        if (shoppingCart.view().isEmpty()) throw new IllegalStateException("Shopping cart is empty");
//
//        CardType cardType = billingInformation.creditCardInfo().cardType();
//        if (cardType == null) throw new UnsuccessfulTransactionException("Cancelled - payment unsuccessful");
//    }
//
//    public static double calculateTotalPrice(ShoppingCart shoppingCart) {
//        double totalPrice = 0.0;
//        for (Item item : shoppingCart.view()) {
//            Product product = item.getProduct();
//            int quantity = item.getQuantityOfProduct();
//
//            totalPrice += (product.getPrice() * quantity);
//        }
//
//        return totalPrice;
//    }
//}
//
//package oop.e_store;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public record BillingInformation(String receiverPhoneNumber, String receiverName,
//                                 Address deliveryAddress, CreditCard creditCardInfo){
//
//}
//
//package oop.e_store;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class ShoppingCart {
//    private List<Item> items;
//    private int quantity;
//
//    public ShoppingCart() {
//        items = new ArrayList<>();
//        this.quantity = 0;
//    }
//
//    public void add(Product product, int quantity) {
//        if (isPresent(product)) updateQuantity(product, quantity);
//
//        else items.add(new Item(product, quantity));
//        this.quantity += quantity;
//    }
//
//    private void updateQuantity(Product product, int quantity) {
//        Item foundItem = findItemBy(product.getProductId());
//        foundItem.updateQuantityOfProduct(quantity);
//    }
//
//    private boolean isPresent(Product product) {
//        for (Item item : items) if (item.getProduct().equals(product)) return true;
//
//        return false;
//    }
//
//    public void remove(String productId, int quantity) {
//        if (items.isEmpty()) throw new IllegalStateException("Shopping cart is empty");
//
//        Item foundItem = findItemBy(productId);
//        if(this.quantity == quantity)
//            items.remove(foundItem);
//        //this.quantity -= quantity;
//    }
//
//    private Item findItemBy(String productId) {
//        for (Item item : items) {
//            Product product = item.getProduct();
//            if (product.getProductId().equals(productId)) return item;
//        }
//
//        throw new ItemNotFoundException("Item is not in the cart.");
//    }
//
//    public void removeItem(Item item) {
//        items.remove(item);
//    }
//
//    public List<Item> getItems() {
//        return items;
//    }
//
////    public double calculatePrice() {
////        double totalPrice = 0.0;
////        for (Item item : items)
////            totalPrice += (item.getProduct().getPrice()*item.getQuantityOfProduct());
////        return totalPrice;
////    }
//
//    public List<Item> view() {
//        return items;
//    }
//
//
//}
//
//
//package oop.e_store;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Customer extends User{
//    private BillingInformation billingInformation;
//    private ShoppingCart shoppingCart;
//    private List<Order>  orders;
//    private List<Product> products;
//
//    public Customer(String id, String name, int age, String phoneNumber, String password, String emailAddress,
//                    Address address){
//        super(id, name, age, phoneNumber, password, emailAddress, address);
//        orders = new ArrayList<>();
//        shoppingCart = new  ShoppingCart();
//        products = new ArrayList<>();
//    }
//
//    public void setBillingInformation(BillingInformation billingInformation) {
//        this.billingInformation = billingInformation;
//    }
//
//    public BillingInformation getBillingInformation() {
//        return billingInformation;
//    }
//
//    public ProductCategory browseProduct() {
//        return null;
//    }
//    public String searchProduct(String productName){
//        for (Product product : products){
//            if(product.getProductName().equals(productName)){
//                return String.format(productName);
//            }
//        }
//        return null;
//    }
//
//    public void addToCart(Product product, int quantity){
//        shoppingCart.add(product, quantity);
//    }
//
//    public void removeFromCart(Product product, int quantity){
//        shoppingCart.remove("id", quantity);
//    }
//
//    public ShoppingCart viewCart(){
//        return shoppingCart;
//    }
//
//    public List<Order> viewOrders() {
//        return orders;
//    }
//
////    public void proceedToCheckOut(){
////        Order order = Checkout.placeOrder(shoppingCart, billingInformation);
////          orders.add(order);
////            }
//
//    public void checkout() {
//        Order newOrder = Checkout.placeOrder(shoppingCart, billingInformation);
//        orders.add(newOrder);
//    }
//}
//
//
