package oop.E_store;

public class User {
    private String name;
    private int age;
    private String phone;
    private String password;
    private String emailAddress;
    private Address homeAddress;



    public User(String name, int age, String phone, String password, String emailAddress, Address homeAddress) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.password = password;
        this.emailAddress = emailAddress;
        this.homeAddress = homeAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }


}
