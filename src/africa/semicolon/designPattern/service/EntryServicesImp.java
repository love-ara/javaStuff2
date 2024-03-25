package africa.semicolon.designPattern.service;

import africa.semicolon.designPattern.data.model.Entry;
import africa.semicolon.designPattern.data.repository.EntryRepository;
import africa.semicolon.designPattern.exceptions.EmptyEntryException;
import africa.semicolon.designPattern.exceptions.EntryNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EntryServicesImp implements EntryServices{
    @Autowired
    private EntryRepository entryRepo;

    @Override
    public void save(Entry entry) {
        entryRepo.save(entry);
    }

    @Override
    public void delete(String id) {
        entryRepo.deleteById(id);
    }

    @Override
    public List<Entry> getEntriesFor(String username) {
        List<Entry> entries = entryRepo.findByAuthor(username);
        entryRepo.findAll().forEach(entry -> {{if(entry.getAuthor().equals(username)) entries.add(entry);}});
        if (entries.isEmpty()) throw new EmptyEntryException("No entry found");

        return entries;
    }

    @Override
    public Entry getEntryWith(String id) {
        Optional<Entry> entry = entryRepo.findById(id);
        if(entry.isEmpty()) throw new EntryNotFoundException("Entry not found");

        return entry.get();
    }

    @Override
    public List<Entry> findAllEntries() {
        return entryRepo.findAll();
    }
}
