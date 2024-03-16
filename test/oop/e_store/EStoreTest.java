//package oop.e_store;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class EStoreTest {
//    private Customer customer;
//    private Address address;
//    //private BillingInformation billingInformation;
//
//
//    @BeforeEach
//    public void createInstance() {
//        address = new Address("city", "country", "1", "street", "state");
//        customer = new Customer("1", "Ara", 15, "0901687273", "password",
//                "password", address);
//        CreditCard cardInformation = new CreditCard("123", "24", "05",
//                  "5678 1234 9012 3456", "Aramide",  CardType.MASTER_CARD);
//        //billingInformation = new BillingInformation("0901687273", "Ara",
//               // address, cardInformation);
//    }
//
//    @Test
//    public void addItemTest(){
//        Product product = new Product("45", "Shirt", 23.0, "Cotton", ProductCategory.CLOTHING);
//        customer.addToCart(product, 2);
//        assertEquals(0, customer.viewOrders().size());
//    }
//}
