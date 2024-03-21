package controllers;

import data.model.Entry;
import dtos.requests.*;
import exceptions.DiaryException;
import service.DiaryServices;
import service.DiaryServicesImp;
import service.EntryServices;
import service.EntryServicesImp;

import java.util.List;

public class DiaryController {
    private static DiaryServices diaryServices = new DiaryServicesImp();
    private static EntryServices entryServices =  new EntryServicesImp();

    public static String registerUser(RegisterRequest registerRequest){
        try {
            diaryServices.register(registerRequest);
            return "Success";
        }catch (DiaryException e){
            return e.getMessage();
        }
    }

    public static String loginUser(LoginRequest loginRequest){
        try {
            diaryServices.login(loginRequest);
            return "Success";
        }catch (DiaryException e){
            return e.getMessage();
        }
    }

    public static String logoutUser(String username){
        try {
            diaryServices.logout(username);
            return "Success";
        }catch (DiaryException e){
            return e.getMessage();
        }
    }

    public static String deleteDiary(DeleteRequest deleteRequest){
        try {
            diaryServices.deleteDiary(deleteRequest);
            return "Success";
        }catch (DiaryException e){
            return e.getMessage();
        }
    }

    public static String createEntry(CreateEntryRequest createEntryRequest){
        try {
            diaryServices.createEntryWith(createEntryRequest);
            return "Success";
        }catch (DiaryException e){
            return e.getMessage();
        }
    }

    public static String updateEntry(UpdateEntryRequest updateEntryRequest){
        try {
            diaryServices.updateEntryWith(updateEntryRequest);
            return "Success";
        }catch (DiaryException e){
            return e.getMessage();
        }
    }

    public static String deleteEntry(int id, String username){
        try {
            diaryServices.lockedStatus(username);
            entryServices.delete(id);
            return "Success";
        }catch (DiaryException e){
            return e.getMessage();
        }
    }

    public static List<?> entries(String username){
        try {
            diaryServices.lockedStatus(username);
            entryServices.getEntriesFor(username);
            return entryServices.getEntriesFor(username);
        }catch (DiaryException e){
            return List.of(e.getMessage());
        }
    }

    public static String entry(int id, String username){
        try {
            diaryServices.lockedStatus(username);
            return String.valueOf(entryServices.getEntryWith(id));
        }catch (DiaryException e){
            return e.getMessage();
        }
    }
}
