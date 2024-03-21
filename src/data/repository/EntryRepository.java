package data.repository;

import data.model.Entry;

import java.util.List;

public interface EntryRepository {
    Entry save(Entry entry);
    List<Entry> findAll();
    List<Entry> findByName(String username);
    Entry findById(int id);
    void delete(int id);
    void delete(Entry entry);
    long count();
}
