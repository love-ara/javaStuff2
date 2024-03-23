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

    @PostMapping("/ register")
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
    @PatchMapping("/logout/{name}")
    public String logoutUser(@PathVariable("name") String username){
        try {
            diaryServices.logout(username);
            return "Logout Success";
        }catch (DiaryException e){
            return e.getMessage();
        }
    }
    @DeleteMapping("/delete/{username}")
    public  String deleteDiary(@RequestBody DeleteRequest deleteRequest){
        try {
            diaryServices.deleteDiary(deleteRequest);
            return "Delete Success";
        }catch (DiaryException e){
            return e.getMessage();
        }
    }
    @PostMapping("/createEntry")
    public  String createEntry(CreateEntryRequest createEntryRequest){
        try {
            diaryServices.createEntryWith(createEntryRequest);
            return "Entry Created Successfully";
        }catch (DiaryException e){
            return e.getMessage();
        }
    }
    @PatchMapping("/updateEntry")
    public String updateEntry(UpdateEntryRequest updateEntryRequest){
        try {
            diaryServices.updateEntryWith(updateEntryRequest);
            return "Entry Updated Successfully";
        }catch (DiaryException e){
            return e.getMessage();
        }
    }
    @DeleteMapping("/deleteEntry/{username}")
    public String deleteEntry( String id, @PathVariable String username){
        try {
            diaryServices.delete(id, username);
            return "Success";
        }catch (DiaryException e){
            return e.getMessage();
        }
    }
    @GetMapping("getEntries/{username}")
    public List<?> entries(@PathVariable String username){
        try {
            return diaryServices.getEntriesFor(username);
        }catch (DiaryException e){
            return List.of(e.getMessage());
        }
    }
    @GetMapping("getEntry/{username}")
    public String entry(String id, @PathVariable String username){
        try {
            return String.valueOf(diaryServices.getEntryWith(id,username));
        }catch (DiaryException e){
            return e.getMessage();
        }
    }
}
