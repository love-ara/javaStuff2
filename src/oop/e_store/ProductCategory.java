package oop.e_store;

public enum ProductCategory {
    ELECTRONICS,
    GROCERIES,
    UTENSILS,
    CLOTHING;

    private final String[] productCategory;
    ProductCategory(String... productCategory) {
        this.productCategory = productCategory;
    }
    public String[] getProductCategory(){
        return productCategory;
    }
}

