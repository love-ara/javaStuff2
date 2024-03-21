package data.model;

public class Diary {
    private String username;
    private String password;
    private boolean isLocked = true;
    private int id;

    public Diary(){

    }
    public Diary(String username, String password){
    this.username = username;
    this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return password;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public  void setLock(boolean status){
        isLocked = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
