package oop.e_store;

public class Address {
    private String city;
    private String country;
    private String houseNumber;
    private String street;
    private String state;

    public Address(String city, String country, String houseNumber, String street, String state) {
        this.city = city;
        this.country = country;
        this.houseNumber = houseNumber;
        this.street = street;
        this.state = state;
    }


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }


    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


}
