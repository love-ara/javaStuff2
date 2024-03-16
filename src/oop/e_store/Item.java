package oop.e_store;

public class Item {
    private int quantityOfProduct;
    private Product product;

    public Item(Product product, int quantityOfProduct){
        this.quantityOfProduct = quantityOfProduct;
        this.product = product;
    }

    public int getQuantityOfProduct(){
        return quantityOfProduct;
    }

    public Product getProduct(){
        return product;
    }

    public void updateQuantityOfProduct(int quantityOfProduct) {
        validateQuantity(quantityOfProduct);
        this.quantityOfProduct = quantityOfProduct;
    }

    private void validateQuantity(int quantityOfProduct) {
            if (quantityOfProduct <= 0) throw new IllegalArgumentException("Quantity of product " +
                    "should be greater than zero");
    }

    @Override
    public String toString() {
        return String.format("Product: %s%nQuantity: %d", product, quantityOfProduct);
    }



}
