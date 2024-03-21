package repository;

import data.model.Diary;
import data.repository.DiaryRepository;
import data.repository.DiaryRepositoryImp;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryRepositoryImpTest {
    private DiaryRepository rep;

    @BeforeEach
    public void setUp() {
         rep = new DiaryRepositoryImp();
    }

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
        Diary diary = new Diary("username", "password");
        rep.save(diary);
        Diary diaryTwo = new Diary("anotherUsername", "anotherPassword");
        rep.save(diaryTwo);
        assertEquals(2, rep.count());
        rep.delete(diary);
        assertEquals(1, rep.count());
    }

    @Test
    public void saveMoreThanOneDiary_findTheDiaries_returnsAllDiaryTest(){
        Diary diary = new Diary();
        rep.save(diary);
        Diary diaryTwo = new Diary("anotherUsername", "anotherPassword");
        rep.save(diaryTwo);
        Diary diaryThree = new Diary("otherUsername", "otherPassword");
        rep.save(diaryThree);
        List<Diary> diaries = new ArrayList<>();
        diaries.add(diary);
        diaries.add(diaryTwo);
        diaries.add(diaryThree);
        assertEquals(rep.findAll(), diaries);
    }

    @Test
    public void diaryCanBeFoundByUsernameTest(){
        Diary diary = new Diary("username", "password");
        rep.save(diary);
        assertEquals(diary, rep.findById("username"));
    }

    @Test
    public void diaryCanBeDeletedWithUsernameTest(){
        Diary diary = new Diary("username", "password");
        rep.save(diary);
        Diary anotherDiary = new Diary("anotherUsername", "anotherPassword");
        rep.save(anotherDiary);
        assertEquals(2, rep.count());
        rep.delete("anotherUsername");
        assertEquals(1, rep.count());
    }
}
