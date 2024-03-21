package service;

import data.model.Diary;
import dtos.requests.*;


public interface DiaryServices {
    void register(RegisterRequest register);

    long getNumberOfUsers();

    Diary findUser(String username);

    void login(LoginRequest loginRequest);

    void logout(String username);

    void deleteDiary(DeleteRequest deleteRequest);

    void createEntryWith(CreateEntryRequest createEntryRequest);

    void updateEntryWith(UpdateEntryRequest updateEntryRequest);

    void lockedStatus(String username);
}

