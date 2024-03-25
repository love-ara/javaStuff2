package africa.semicolon.designPattern.controllers;

import africa.semicolon.designPattern.dtos.requests.*;

import africa.semicolon.designPattern.exceptions.DiaryException;
import africa.semicolon.designPattern.service.DiaryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DiaryController {
    @Autowired
    private DiaryServices diaryServices;

    @PostMapping("/register")
    public String registerUser(@RequestBody RegisterRequest registerRequest){
        try {
            diaryServices.register(registerRequest);
            return "Success";
        }catch (DiaryException e){
            return e.getMessage();
        }
    }

    @PostMapping("/sign-in")
    public String loginUser(@RequestBody LoginRequest loginRequest){
        try {
            diaryServices.login(loginRequest);
            return "Login Success";
        }catch (DiaryException e){
            return e.getMessage();
        }
    }
    @PostMapping ("/sign-out/{name}")
    public String logoutUser(@PathVariable("name") String username){
        try {
            diaryServices.logout(username);
            return username + " Logout Success";
        }catch (DiaryException e){
            return e.getMessage();
        }
    }

    @DeleteMapping("/delete")
    public  String deleteDiary(@RequestBody DeleteRequest deleteRequest){
        try {
            diaryServices.deleteDiary(deleteRequest);
            return "Delete Success";
        }catch (DiaryException e){
            return e.getMessage();
        }
    }
    @PostMapping("/create-entry")
    public  String createEntry(@RequestBody CreateEntryRequest createEntryRequest){
        try {
            diaryServices.createEntryWith(createEntryRequest);
            return "Entry Created Successfully";
        }catch (DiaryException e){
            return e.getMessage();
        }
    }
    @PatchMapping("/update-entry")
    public String updateEntry(@RequestBody UpdateEntryRequest updateEntryRequest){
        try {
            diaryServices.updateEntryWith(updateEntryRequest);
            return "Entry Updated Successfully";
        }catch (DiaryException e){
            return e.getMessage();
        }
    }
    @DeleteMapping("/deleteEntry")
    public String deleteEntry(String id,  String username){
        try {
            diaryServices.delete(id, username);
            return "Success";
        }catch (DiaryException e){
            return e.getMessage();
        }
    }
    @GetMapping("/get-entries/{username}")
    public List<?> entries(@PathVariable("username") String username){
        try {
            return diaryServices.getEntriesFor(username);
        }catch (DiaryException e){
            return List.of(e.getMessage());
        }
    }
    @GetMapping("/get-all-entries")
    public List<?> allEntries(){
        try{
            return diaryServices.FindAllEntries();
        }catch (DiaryException e){
            return List.of(e.getMessage());
        }
    }
    @GetMapping("/get-entry/{username}/{id}")
    public String entry(@PathVariable("id") String id, @PathVariable("username") String username){
        try {
            return String.valueOf(diaryServices.getEntryWith(id,username));
        }catch (DiaryException e){
            return e.getMessage();
        }
    }
}
