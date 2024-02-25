package oop.diary;


import java.util.ArrayList;
import java.util.List;

public class Diary {
    public String getUsername;
    private String username;
    private String password;
    private boolean isLocked = true;
    private List<Entry> entries = new ArrayList<>();
    int numberOfEntry = 0;
    private int id;

    public Diary(String username, String password){
        this.username = username;
        this.password = password;

    }
    public String getUsername(){
        return username;
    }
    
    public void unlockDiary(String password){
        if(this.password.equals(password) ) isLocked = false;
    }

    public void lockDiary(){
        isLocked = true;
    }

    public boolean isLocked(){
        return isLocked;
    }

    public void createEntry(String title, String Body){
        Entry entry = new Entry(generateId(), "title", "body");
        entries.add(entry);
        numberOfEntry++;
    }

    public void deleteEntry(int id){
         Entry entry = findEntryById(id);
            entries.remove(entry);
            id --;
            numberOfEntry --;
    }

    public Entry findEntryById(int id){
        for(Entry entry : entries){
            if(entry.getId() == id) return entry ;
        }
        throw new NullPointerException("No such entry");
    }

    public void updateEntry(int id, String updatedTitle, String Update){
        Entry entry = findEntryById(id);
        for (Entry entry1 : entries){
            if(entry == entry1) {
                entry1.setBody(updatedTitle);
                entry1.setTitle(updatedTitle);
            }
            }
    }
    public int getId(String title){
        int id = 0;
        for (Entry entry : entries) if(title.equals(entry.getTitle())) id = entry.getId();
        return id;
        }

    private int generateId(){
        id++;
        return id;
    }

    public int getNumberOfEntry() {
        return numberOfEntry;
    }

}
