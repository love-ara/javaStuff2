//package repository;
//
//import africa.semicolon.designPattern.data.model.Entry;
//import africa.semicolon.designPattern.data.repository.EntryRepository;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@Repository
//public class EntryRepositoryImpTest {
//    @Autowired
//    private EntryRepository entryRep;
//
//
//    }
//    @AfterEach
//    public void tearDown() {
//        entryRep.findAll().clear();
//    }
//
//
//    @Test
//    public void createNewEntry() {
//        Entry entry = new Entry();
//        entryRep.save(entry);
//        assertEquals(1, entryRep.count());
//    }
//
//    @Test
//    public void moreThanOneEntriesCanBeCreatedAndSavedTest() {
//        entryRep.save(new Entry());
//        entryRep.save(new Entry());
//        entryRep.save(new Entry());
//        assertEquals(3, entryRep.count());
//    }
//
//
//      @Test
//      public void allEntriesCanBeFoundTest() {
//        Entry entry = new Entry("title", "body");
//        entryRep.save(entry);
//        Entry entry1 = new Entry();
//        Entry entry2 = new Entry("title", "body");
//        entryRep.save(entry1);
//        entryRep.save(entry2);
//        List<Entry> expected = new ArrayList<>();
//        expected.add(entry);
//        expected.add(entry1);
//        expected.add(entry2);
//      assertEquals(expected, entryRep.findAll() );
//      }
//
//
//    @Test
//    public void entriesCanBeFoundWithIdTest() {
//        Entry entry = new Entry();
//        entryRep.save(entry);
//        assertEquals(entry, entryRep.findById(1));
//    }
//
//    @Test
//    public void entriesCanBeDeletedTest() {
//        Entry entry = new Entry();
//        entryRep.save(entry);
//        Entry entryTwo = new Entry();
//        entryRep.save(entryTwo);
//        assertEquals(2, entryRep.count());
//
//        entryRep.delete(entry);
//        assertEquals(1, entryRep.count());
//    }
//
//    @Test
//    public void entriesCanBeDeletedWithIdTest() {
//        Entry entry = new Entry();
//        entryRep.save(entry);
//        Entry entryTwo = new Entry();
//        entryRep.save(entryTwo);
//        assertEquals(2, entryRep.count());
//
//        entryRep.delete(1);
//        assertEquals(1, entryRep.count());
//    }
//
