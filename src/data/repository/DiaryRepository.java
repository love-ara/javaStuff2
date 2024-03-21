package data.repository;

import data.model.Diary;

import java.util.List;

public interface DiaryRepository {
    void save(Diary diary);
    List<Diary> findAll();
    Diary findById(String username);
    long count();
    void delete(String username);
    void delete(Diary diary);

}
