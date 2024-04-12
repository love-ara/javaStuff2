package oop.e_store;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Products {
    private static final List<Product> products = new ArrayList<>();
    private static int numberOfProducts;

    public static void add(Product... product) {
        products.addAll(Arrays.asList(product));
    }

    public static List<Product> view() {
        return products;
    }

    public static String generateProductId() {
        return "ab";
    }

    public static Product findProductById(String productId) {
        for (Product product : products)
            if (product.getProductId().equals(productId)) return product;

        throw new IllegalArgumentException(STR."No such product exists with id \{productId}");
    }
}