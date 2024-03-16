package oop.e_store;

public abstract class User {
    private String id;
    private String name;
    private int age;
    private String phone;
    private String password;
    private String emailAddress;
    private Address homeAddress;
    private String type;



    public User(String id, String name, String email, String password, String phone) {
        this.id = id;
        this.password = password;
        this.phone = phone;
        this.emailAddress = email;
        this.name = name;
    }

    public String getId() {
        return id;
    }

//
//    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//    public int getAge(){
//        return age;
//    }
//
//    public void setPhone(String phone) {
//        this.phone = phone;
//    }
//    public String getPhone(){
//        return phone;
//    }
//
//    public String getEmail() {
//        return emailAddress;
//    }
//
//    public void setEmail(String emailAddress) {
//        this.emailAddress = emailAddress;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public void setHomeAddress(Address homeAddress) {
//        this.homeAddress = homeAddress;
//    }
//    public Address getHomeAddress(){
//        return homeAddress;
//    }
    public final boolean isCorrect(String password) {
        return this.password.equals(password);
    }
}

