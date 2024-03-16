package oop.e_store;


public class Product {
    private String productId;
    private String productName;
    private double price;
    private String productDescription;
    private ProductCategory productCategory;

    public Product(String productId, String productName, double price, String productDescription, ProductCategory productCategory) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.productDescription = productDescription;
        this.productCategory = productCategory;
    }


    public String getProductId() {
        return productId;
    }

    public void setId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return productName;
    }

    public void setName(String name) {
        this.productName = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

//    public Seller getProductOwner() {
//        return productOwner;
//    }
//
//    public void setProductOwner(Seller productOwner) {
//        this.productOwner = productOwner;
//    }
//
//    public Customer getBuyerOfTheProduct() {
//        return buyerOfTheProduct;
//    }
//
//    public void setBuyerOfTheProduct(Customer buyerOfTheProduct) {
//        this.buyerOfTheProduct = buyerOfTheProduct;
//    }




    public String getDescription() {
        return productDescription;
    }

    public void setDescription(String description) {
        this.productDescription = description;
    }

//    public static boolean isSold(Product obj) {
//
//        if(obj.getBuyerOfTheProduct() == null) {
//            return false;
//        }
//        return true;
//    }



}

