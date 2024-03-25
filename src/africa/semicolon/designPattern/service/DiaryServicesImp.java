package africa.semicolon.designPattern.service;

import africa.semicolon.designPattern.data.model.Diary;
import africa.semicolon.designPattern.data.model.Entry;
import africa.semicolon.designPattern.data.repository.DiaryRepository;
import africa.semicolon.designPattern.dtos.requests.*;
import africa.semicolon.designPattern.exceptions.DiaryLockedException;
import africa.semicolon.designPattern.exceptions.IncorrectPasswordException;
import africa.semicolon.designPattern.exceptions.UserAlreadyExistException;
import africa.semicolon.designPattern.exceptions.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DiaryServicesImp implements DiaryServices{
    @Autowired
    private DiaryRepository diaryRepo;
    @Autowired
    private  EntryServices entryServices;

    @Override
    public void register(RegisterRequest register) {
        validateUsername(register.getUsername());
        Diary diary = new Diary();
        diary.setUsername(register.getUsername());
        diary.setPassword(register.getPassword());
        diaryRepo.save(diary);
    }


    @Override
    public Diary findUser(String username) {
        Optional<Diary> diary = diaryRepo.findById(username);
        if(diary.isEmpty()){
            throw new UserNotFoundException("User not found");
        }
        return diary.get();
    }

    private void validateUsername(String username) {
        if(diaryRepo.existsById(username)) throw new UserAlreadyExistException(String.format("username %s already exist"
                , username));
    }


    @Override
    public void login(LoginRequest login){
        Diary diary = findUser(login.getUsername());
        validatePassword(diary, login.getPassword());
        diary.setLocked(false);
        diaryRepo.save(diary);
    }

    @Override
    public void logout(String username) {
        Diary diary = findUser(username);
        diary.setLocked(true);
        diaryRepo.save(diary);
    }

    @Override
    public void deleteDiary(DeleteRequest deleteRequest) {
        Diary diary = findUser(deleteRequest.getUsername());
        lockedStatus(diary);
        validatePassword(diary, deleteRequest.getPassword());
        diaryRepo.delete(diary);
    }

    @Override
    public void createEntryWith(CreateEntryRequest createEntryRequest) {
        Diary diary = findUser(createEntryRequest.getAuthor());
        lockedStatus(diary);

        Entry entry = new Entry();
        entry.setTitle(createEntryRequest.getTitle());
        entry.setBody(createEntryRequest.getBody());
        entry.setAuthor(createEntryRequest.getAuthor());

        entryServices.save(entry);
    }

    @Override
    public void updateEntryWith(UpdateEntryRequest updateEntryRequest) {
        Diary diary = findUser(updateEntryRequest.getAuthor());
        lockedStatus(diary);

        Entry entry = new Entry();
        entry.setTitle(updateEntryRequest.getTitle());
        entry.setBody(updateEntryRequest.getBody());
        entry.setAuthor(updateEntryRequest.getAuthor());
        entry.setId(updateEntryRequest.getId());

        entryServices.save(entry);
    }

    @Override
    public void delete(String id, String username) {
        Diary diary = findUser(username);
        lockedStatus(diary);
        entryServices.delete(id);
    }

    @Override
    public List<Entry> FindAllEntries() {
        return entryServices.findAllEntries();
    }

    @Override
    public List<Entry> getEntriesFor(String username) {
        Diary diary = findUser(username);
        lockedStatus(diary);
        return entryServices.getEntriesFor(username);
    }

    @Override
    public Entry getEntryWith(String id, String username) {
        Diary diary = findUser(username);
        lockedStatus(diary);
        return entryServices.getEntryWith(id);
    }


    private void validatePassword(Diary diary, String password) {
        if(!diary.getPassword().equals(password)) throw new IncorrectPasswordException("Incorrect password");
    }

    private void lockedStatus(Diary diary){
        if(diary.isLocked()) throw new DiaryLockedException("Diary is locked");
    }
}
