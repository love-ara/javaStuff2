package africa.semicolon.designPattern.service;

import africa.semicolon.designPattern.data.model.Entry;
import java.util.List;

public interface EntryServices {
    void save(Entry entry);
    void delete(String id);
    List<Entry> getEntriesFor(String username);
    Entry getEntryWith(String id);
}
