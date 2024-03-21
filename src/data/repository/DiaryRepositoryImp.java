package data.repository;

import data.model.Diary;
import java.util.ArrayList;
import java.util.List;


public class DiaryRepositoryImp implements DiaryRepository{

    private static List<Diary> journals = new ArrayList<>();
    private int lastDiaryId;


    @Override
    public void save(Diary diary) {
        if(isNew(diary)) addIdTo(diary);
        else update(diary);

        journals.add(diary);
    }

    private void update(Diary diary) {
        for(Diary journal : journals) {
            if (journal.getId() == diary.getId()) delete(journal);
            break;
        }

    }

    private void addIdTo(Diary diary) {
        diary.setId(generateId());
    }

    private int generateId() {
        return ++lastDiaryId;
    }

    private boolean isNew(Diary diary) {
        return diary.getId() == 0;
    }

    @Override
    public List<Diary> findAll() {
        return journals;
    }

    @Override
    public Diary findById(String username) {
        for(Diary diary : journals) {
            if (diary.getUsername().equals(username)) return diary;
        }     
        return null;
    }

    @Override
    public long count() {
        return journals.size();
    }

    @Override
    public void delete(String username) {
        Diary diary = findById(username);
        if(diary != null)
            journals.remove(diary);
    }

    @Override
    public void delete(Diary diary) {
        if(findById(diary.getUsername()) != null)
            journals.remove(diary);
    }
}


