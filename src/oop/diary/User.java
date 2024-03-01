package oop.diary;

public class User {
    private Diary diary = new Diary("username", "password");

    public Diary createDiary(String username, String  password){
        diary = new Diary(username, password);
        return diary;
    }

    public void lockDiary(){
            diary.lockDiary();
    }

    public  void unlockDiary(String password){
        diary.unlockDiary(password);
    }

    public void addEntry(String tile, String body){
            diary.createEntry(tile, body);
    }
    public Entry findEntryById(int id){
      return diary.findEntryById(id);
    }
    public void updateEntry(int id, String updatedTitle, String updateBody){
        diary.updateEntry(id, updatedTitle, updateBody);
    }
    public  void deleteEntry(int id){
        diary.deleteEntry(id);
    }

}
