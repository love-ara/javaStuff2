package oop.e_store;

public class Checkout {
    public static Order placeOrder(ShoppingCart shoppingCart, BillingInformation billingInformation) {
        validate(shoppingCart, billingInformation);
        double totalPrice = calculateTotalPrice(shoppingCart);

        return new Order(shoppingCart, totalPrice);
    }

    public static void validate(ShoppingCart shoppingCart, BillingInformation billingInformation){
        if (shoppingCart.view().isEmpty()) throw new IllegalStateException("Shopping cart is empty");

        CardType cardType = billingInformation.creditCardInfo().cardType();
        if (cardType == null) throw new UnsuccessfulTransactionException("Cancelled - payment unsuccessful");
    }

    public static double calculateTotalPrice(ShoppingCart shoppingCart) {
        double totalPrice = 0.0;
        for (Item item : shoppingCart.view()) {
            Product product = item.getProduct();
            int quantity = item.getQuantityOfProduct();

            totalPrice += (product.getPrice() * quantity);
        }

        return totalPrice;
    }
}


