package service;

import data.model.Diary;
import data.model.Entry;
import data.repository.DiaryRepository;
import data.repository.DiaryRepositoryImp;
import dtos.requests.*;
import exceptions.DiaryLockedException;
import exceptions.IncorrectPasswordException;
import exceptions.UserAlreadyExistException;
import exceptions.UserNotFoundException;

public class DiaryServicesImp implements DiaryServices{
    private DiaryRepository diaryRepo = new DiaryRepositoryImp();
    private  EntryServices entryServices = new EntryServicesImp();

    @Override
    public void register(RegisterRequest register) {
        validateUsername(register.getUsername());
        Diary diary = new Diary();
        diary.setUsername(register.getUsername());
        diary.setPassword(register.getPassword());
        diaryRepo.save(diary);
    }

    @Override
    public long getNumberOfUsers() {
        return diaryRepo.count();
    }

    @Override
    public Diary findUser(String username) {
        Diary diary = diaryRepo.findById(username);
        if(diary == null) throw new UserNotFoundException("User not found");
        return diary;
    }

    private void validateUsername(String username) {
        Diary diary = diaryRepo.findById(username);
        if(diary != null) throw new UserAlreadyExistException(String.format("username %s already exist", username));
    }


    @Override
    public void login(LoginRequest login){
        validateLoginDetails(login);
        Diary diary = diaryRepo.findById(login.getUsername());
        diary.setLock(false);
        diaryRepo.save(diary);
    }

    @Override
    public void logout(String username) {
        Diary diary = diaryRepo.findById(username);
        diary.setLock(true);
        diaryRepo.save(diary);
    }

    @Override
    public void deleteDiary(DeleteRequest deleteRequest) {
        lockedStatus(deleteRequest.getUsername());
        Diary diary = findUser(deleteRequest.getUsername());
        if(!diary.getPassword().equals(deleteRequest.getPassword())) throw new IllegalArgumentException("Wrong password");
        diaryRepo.delete(diary);
    }

    @Override
    public void createEntryWith(CreateEntryRequest createEntryRequest) {
        lockedStatus(createEntryRequest.getAuthor());
        Entry entry = new Entry();
        entry.setTitle(createEntryRequest.getTitle());
        entry.setBody(createEntryRequest.getBody());
        entry.setAuthor(createEntryRequest.getAuthor());

        entryServices.save(entry);
    }

    @Override
    public void updateEntryWith(UpdateEntryRequest updateEntryRequest) {
        lockedStatus(updateEntryRequest.getAuthor());
        Entry entry = new Entry();
        entry.setTitle(updateEntryRequest.getTitle());
        entry.setBody(updateEntryRequest.getBody());
        entry.setAuthor(updateEntryRequest.getAuthor());
        entry.setId(updateEntryRequest.getId());

        entryServices.save(entry);
    }


    private void validateLoginDetails(LoginRequest loginRequest) {
        Diary diary = diaryRepo.findById(loginRequest.getUsername());
        if(!diary.getPassword().equals(loginRequest.getPassword())) throw new IncorrectPasswordException("Incorrect password");
    }

    public void lockedStatus(String username){
        Diary diary = findUser(username);
        if(diary.isLocked()) throw new DiaryLockedException("Diary is locked");
    }


}
