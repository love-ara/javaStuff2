package files.json;

public class Person {
    private String name;
    private String dateOfBirth;
    private Gender gender;
    private String phoneNumber;

    public Person(String name, String date, Gender gender, String number) {
        this.name = name;
        this.dateOfBirth = date;
        this.gender = gender;
        this.phoneNumber = number;
    }
    public Person(){

    }


    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }


    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
