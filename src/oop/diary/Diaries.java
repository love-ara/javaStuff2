package oop.diary;


import java.util.ArrayList;
import java.util.List;

public class Diaries {
    private final List<Diary> diaries = new ArrayList<>();

    public void add(String username, String password){
        Diary diary = new Diary(username, password);
        diaries.add(diary);

    }

    public Diary findByUsername(String username){
        for(Diary diary: diaries){
            if(diary.getUsername.equals(username)) return diary;
        }
        throw new NullPointerException("Diary does not exist");
    }
     public  void delete(String username, String password){

     }
}
