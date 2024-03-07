package oop.diary;


import java.util.ArrayList;
import java.util.List;

public class Diary {
    private String username;
    private String password;
    private boolean isLocked = true;
    private List<Entry> entries = new ArrayList<>();
    int numberOfEntry = 0;
    private int id = 0;

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

    public void createEntry(String title, String body){
        Entry entry = new Entry(generateId(), title, body);
        entries.add(entry);
        numberOfEntry++;
    }

    public void deleteEntry(int id){
         Entry entry = findEntryById(id);
            entries.remove(entry);
            this.id --;
            numberOfEntry --;
    }

    public Entry findEntryById(int id){
        for(Entry entry : entries){
            if(entry.getId() == id) return entry ;
        }
        throw new NullPointerException("No such entry");
    }

    public void updateEntry(int id, String updatedTitle, String updatedBody){
        Entry entry = findEntryById(id);
                entry.setTitle(updatedTitle);
                entry.setBody(updatedBody);

    }
    public int getId(String title){
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
