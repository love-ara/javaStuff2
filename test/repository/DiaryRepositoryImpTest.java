package repository;

import africa.semicolon.designPattern.data.model.Diary;
import africa.semicolon.designPattern.data.repository.DiaryRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@Repository
public class DiaryRepositoryImpTest {
    @Autowired
    private DiaryRepository rep;
    
    @AfterEach
    public void tearDown() {
        rep.findAll().clear();
    }
    @Test
    public void diaryCanBeCreatedTest(){
        Diary diary = new Diary();
        rep.save(diary);
        assertEquals(1, rep.count());
    }

    @Test
    public void createTwoDiaries_numberOfDiariesIncreasesToTwo(){
        Diary diary = new Diary();
        rep.save(diary);
        Diary diaryTwo = new Diary();
        rep.save(diaryTwo);
        assertEquals(2, rep.count());
    }

    @Test
    public void saveMoreThanOneDiary_DeleteMoreThanOne_DiaryCountReducesTest(){
        Diary diary = new Diary();
        rep.save(diary);
        Diary diaryTwo = new Diary();
        rep.save(diaryTwo);
        assertEquals(2, rep.count());
        rep.delete(diary);
        assertEquals(1, rep.count());
    }

    @Test
    public void saveMoreThanOneDiary_findTheDiaries_returnsAllDiaryTest(){
        Diary diary = new Diary();
        rep.save(diary);
        Diary diaryTwo = new Diary();
        rep.save(diaryTwo);
        Diary diaryThree = new Diary();
        rep.save(diaryThree);
        List<Diary> diaries = new ArrayList<>();
        diaries.add(diary);
        diaries.add(diaryTwo);
        diaries.add(diaryThree);
        assertEquals(rep.findAll(), diaries);
    }

    @Test
    public void diaryCanBeFoundByUsernameTest(){
        Diary diary = new Diary();
        diary.setUsername("username");
        rep.save(diary);
        assertEquals(diary, rep.findById("username"));
    }

    @Test
    public void diaryCanBeDeletedWithUsernameTest(){
        Diary diary = new Diary();
        rep.save(diary);
        Diary anotherDiary = new Diary();
        rep.save(anotherDiary);
        assertEquals(2, rep.count());
        rep.delete(anotherDiary);
        assertEquals(1, rep.count());
    }
}
