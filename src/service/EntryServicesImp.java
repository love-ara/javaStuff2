package service;

import data.model.Entry;
import data.repository.EntryRepository;
import data.repository.EntryRepositoryImp;
import exceptions.EmptyEntryException;
import exceptions.EntryNotFoundException;

import java.util.List;

public class EntryServicesImp implements EntryServices{
    private final EntryRepository entryRepo = new EntryRepositoryImp();

    @Override
    public void save(Entry entry) {
        entryRepo.save(entry);
    }

    @Override
    public void delete(int id) {
        entryRepo.delete(id);
    }

    @Override
    public List<Entry> getEntriesFor(String username) {
        List<Entry> entries = entryRepo.findByName(username);
        if (entries.isEmpty()) throw new EmptyEntryException("No entry found");

        return entries;
    }

    @Override
    public Entry getEntryWith(int id) {
        Entry entry = entryRepo.findById(id);
        if(entry == null) throw new EntryNotFoundException("Entry not found");

        return entry;
    }
}
