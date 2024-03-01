package oop;

import oop.diary.Diary;
import oop.diary.Entry;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {
    private Diary diary;

    @BeforeEach
    public void createAnInstance(){
        diary = new Diary("username", "password");
    }

    @Test
    public void diaryIsLockedTest(){
        assertTrue(diary.isLocked());
    }

    @Test
    public void diaryIsLocked_diaryIsUnlockedWhenUnlockedTest(){
        assertTrue(diary.isLocked());

        diary.unlockDiary("password");
        assertFalse(diary.isLocked());
    }

    @Test
    public void anEntryCanBeCreatedIn_a_diaryTest(){
        assertTrue(diary.isLocked());
        diary.unlockDiary("password");

        diary.createEntry("title", "body");
        assertEquals(1, diary.getNumberOfEntry());
    }

    @Test
    public void anEntryCanBeDeletedIn_a_diaryTest(){
        assertTrue(diary.isLocked());
        diary.unlockDiary("password");
        diary.createEntry("title", "body");
        diary.createEntry("title", "body");

        diary.deleteEntry(2);
        assertEquals(1, diary.getNumberOfEntry());
    }

    @Test
    public void anEntryCanBeFoundByIdTest(){
        assertTrue(diary.isLocked());
        diary.unlockDiary("password");
        diary.createEntry("title", "body");

        Entry found = diary.findEntryById(1);
        assertEquals(1, found.getId());
    }

    @Test
    public void anEntryCanBeUpdatedTest(){
        assertTrue(diary.isLocked());
        diary.unlockDiary("password");
        diary.createEntry("title", "body");
        Entry found = diary.findEntryById(1);

        assertEquals("title", found.getTitle());

        diary.updateEntry(1, "newTitle", "newBody");
        Entry updatedEntry = diary.findEntryById(1);
        assertEquals(updatedEntry, found);
    }
}
