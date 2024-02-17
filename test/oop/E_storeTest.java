package oop;

import oop.E_store.Item;
import oop.E_store.Product;
import oop.E_store.ProductCategory;
import oop.E_store.ShoppingCart;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class E_storeTest {
    private ShoppingCart shoppingCart;
    private List<Item> items;

    @BeforeEach
    public void createInstance(){
        items = new ArrayList<>();
        shoppingCart = new ShoppingCart(items);
    }

    @Test
    public void addItemTest(){
        Product product = new Product("45", "Shirt", new BigDecimal("23.00"), "Cotton", ProductCategory.CLOTHING);
        shoppingCart.addItem(new Item(2, product));
        assertEquals(1, shoppingCart.getItems().size());
    }
}
