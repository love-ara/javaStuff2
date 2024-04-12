package oop.e_store;

import oop.diary.IncorrectPasswordException;

import java.util.ArrayList;
import java.util.List;

public class Admin extends User {
    private List<Customer> customers = new ArrayList<>();
    private int numberOfCustomers;


    public Admin(String id, String name, String email, String password, String phone) {
        super(id, name, email, password, phone);
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void registerCustomer(Customer customer) {
        customers.add(customer);
    }

    public Customer registerCustomer(String id, String name, String email, String password, String phone) {
        Customer newCustomer = new Customer(id, name, email, password, phone);
        customers.add(newCustomer);
        numberOfCustomers++;
        return newCustomer;
    }

    public void removeCustomerAccount(String customerId, String password) {
        Customer customer = findCustomer(customerId);
        validate(customer, password);

        customers.remove(customer);
    }

    private static void validate(Customer customer, String password) {
        if (!customer.isCorrect(password)) throw new IncorrectPasswordException("Password provided is not correct");
    }

    public Customer findCustomer(String customerId) {
        for (Customer customer : customers) if (customer.getId().equals(customerId)) return customer;
        throw new IllegalArgumentException(STR."Customer with id \{customerId} not found");
    }

    public List<Product> getProducts() {
        return Products.view();
    }

    public void addInitialInventory() {
        Product electronic = new Product(Products.generateProductId(), "Pixel", 350_000.0, "Android smartphone",
                ProductCategory.ELECTRONICS);
        Product grocery = new Product(Products.generateProductId(), "Magic", 2_000.0, "Chocolate", ProductCategory.GROCERIES);
        Product utensil = new Product(Products.generateProductId(), "Plate", 1_000.0, "Earthenware", ProductCategory.UTENSILS);
        Product clothing = new Product(Products.generateProductId(), "Levis", 20_000.0, "Jeans", ProductCategory.CLOTHING);

        Products.add(electronic, grocery, utensil, clothing);
    }

    public Product findProductById(String productId) {
        return Products.findProductById(productId);
    }
}

