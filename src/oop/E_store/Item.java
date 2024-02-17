package oop.E_store;

public class Item {
    private int quantityOfProduct;
    private Product product;

    public Item(int quantityOfProduct, Product product){
        this.quantityOfProduct = quantityOfProduct;
        this.product = product;
    }

    public int getQuantityOfProduct(){
        return quantityOfProduct;
    }

    public Product getProduct(){
        return product;
    }
}
