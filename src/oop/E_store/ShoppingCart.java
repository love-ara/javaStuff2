package oop.E_store;

import java.math.BigDecimal;
import java.util.List;

public class ShoppingCart {
    private List<Item> items;

    public ShoppingCart(List<Item> items){
        this.items = items;
    }

    public void addItem(Item item){
        items.add(item);
    }

    public void removeItem(Item item){
        items.remove(item);
    }

    public List<Item> getItems(){
        return items;
    }

    public BigDecimal calculatePrice(){
        BigDecimal totalPrice = BigDecimal.valueOf(0.00);
        for (Item item : items) totalPrice = totalPrice.add(item.getProduct().getPrice() .multiply(BigDecimal.valueOf(item.getQuantityOfProduct())));
        return totalPrice;
    }
}
