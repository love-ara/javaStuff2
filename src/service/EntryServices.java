package service;

import data.model.Entry;
import java.util.List;

public interface EntryServices {
    void save(Entry entry);
    void delete(int id);
    List<Entry> getEntriesFor(String username);
    Entry getEntryWith(int id);
}
