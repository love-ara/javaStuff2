//package africa.semicolon.designPattern.service;
//
//import africa.semicolon.designPattern.data.repository.DiaryRepository;
//import africa.semicolon.designPattern.data.repository.EntryRepository;
//import africa.semicolon.designPattern.dtos.requests.*;
//import africa.semicolon.designPattern.exceptions.UserAlreadyExistException;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class DiaryServicesImpTest {
//    private DiaryServices diaryServices;
//    private RegisterRequest registerRequest;
//    private LoginRequest loginRequest;
//    private CreateEntryRequest createEntryRequest;
//    private UpdateEntryRequest updateEntryRequest;
//    private EntryServices entryServices = new EntryServicesImp();
//
//    @BeforeEach
//    public void createAnInstance(){
//        diaryServices = new DiaryServicesImp();
//        registerRequest = new RegisterRequest();
//
//        registerRequest.setUsername("username");
//        registerRequest.setPassword("password");
//
//        loginRequest = new LoginRequest();
//        loginRequest.setUsername("username");
//        loginRequest.setPassword("password");
//
//        createEntryRequest = new CreateEntryRequest();
//        createEntryRequest.setTitle("title");
//        createEntryRequest.setBody("body");
//        createEntryRequest.setAuthor("username");
//    }
//
//    @AfterEach
//    public void garbageCollector() {
//        DiaryRepository diaryRepository = new DiaryRepositoryImp();
//        EntryRepository entryRepository = new EntryRepositoryImp();
//
//        diaryRepository.findAll().clear();
//        entryRepository.findAll().clear();
//    }
//
//    @Test
//    public void registerAUser_numberOfUserIsOneTest(){
//        assertEquals(0, diaryServices.getNumberOfUsers());
//        diaryServices.register(registerRequest);
//        assertEquals(1, diaryServices.getNumberOfUsers());
//    }
//
//    @Test
//    public void registerSameUserThrowsExceptionTest(){
//        diaryServices.register(registerRequest);
//        assertThrows(UserAlreadyExistException.class, () -> diaryServices.register(registerRequest));
//    }
//
//    @Test
//    public void loginAUserTest(){
//        diaryServices.register(registerRequest);
//        assertTrue(diaryServices.findUser("username").isLocked());
//        diaryServices.login(loginRequest);
//        assertFalse(diaryServices.findUser("username").isLocked());
//    }
//
//    @Test
//    public void aUserCanLogoutTest(){
//        diaryServices.register(registerRequest);
//        diaryServices.login(loginRequest);
//        assertFalse(diaryServices.findUser("username").isLocked());
//          diaryServices.logout("username");
//        assertTrue(diaryServices.findUser("username").isLocked());
//    }
//
//    @Test
//    public void  diaryCanBeDeletedTest(){
//        diaryServices.register(registerRequest);
//        diaryServices.login(loginRequest);
//        DeleteRequest deleteRequest = new DeleteRequest();
//        deleteRequest.setUsername(loginRequest.getUsername());
//        deleteRequest.setPassword(loginRequest.getPassword());
//        assertEquals(1, diaryServices.getNumberOfUsers());
//        diaryServices.deleteDiary(deleteRequest);
//        assertEquals(0, diaryServices.getNumberOfUsers());
//    }
//
//    @Test
//    public void aUserCanCreateAnEntryTest(){
//        diaryServices.register(registerRequest);
//        diaryServices.login(loginRequest);
//        diaryServices.createEntryWith(createEntryRequest);
//        assertEquals(1, entryServices.getEntriesFor("username").size());
//
//    }
//    @Test
//    public void anotherUserCanCreateAnEntryTest(){
//        registerRequest.setUsername("username1");
//        diaryServices.register(registerRequest);
//        loginRequest.setUsername("username1");
//        diaryServices.login(loginRequest);
//
//        createEntryRequest.setAuthor("username1");
//
//        diaryServices.createEntryWith(createEntryRequest);
//
//        assertEquals(1, entryServices.getEntriesFor("username1").size());
//    }
//
//    @Test
//    public void EntryCanUpdateTest(){
//        diaryServices.register(registerRequest);
//        diaryServices.login(loginRequest);
//        diaryServices.createEntryWith(createEntryRequest);
//        assertEquals("title", entryServices.getEntriesFor("username").getFirst().getTitle());
//        assertEquals(1, entryServices.getEntriesFor("username").size());
//
//
//        updateEntryRequest = new UpdateEntryRequest();
//        updateEntryRequest.setTitle("newTitle");
//        updateEntryRequest.setBody("newBody");
//        updateEntryRequest.setId("id");
//        updateEntryRequest.setAuthor("username");
//
//        diaryServices.updateEntryWith(updateEntryRequest);
//
//        assertEquals("newTitle", entryServices.getEntriesFor("username").getFirst().getTitle());
//        assertEquals(1, entryServices.getEntriesFor("username").size());
//
//
//    }
//}
