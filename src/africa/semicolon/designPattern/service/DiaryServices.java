package africa.semicolon.designPattern.service;

import africa.semicolon.designPattern.data.model.Diary;
import africa.semicolon.designPattern.data.model.Entry;
import africa.semicolon.designPattern.dtos.requests.*;


import java.util.List;


public interface DiaryServices {
    void register(RegisterRequest register);

    Diary findUser(String username);

    void login(LoginRequest loginRequest);

    void logout(String username);

    void deleteDiary(DeleteRequest deleteRequest);

    void createEntryWith(CreateEntryRequest createEntryRequest);

    void updateEntryWith(UpdateEntryRequest updateEntryRequest);
    void delete(String id, String username);
    List<Entry> FindAllEntries();
    List<Entry> getEntriesFor(String username);
    Entry getEntryWith(String id, String username);
}

