package files.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;


import static files.json.Gender.FEMALE;
import static org.junit.jupiter.api.Assertions.*;

class JsonSerializerTest {
    @Override
    public String toString() {
        return "  ";
    }
    @Test
    public void testJsonSerializer() {
        Person person = new Person();
        person.setName("Aramide");
        String dateOfBirth = "2024-05-25";
        person.setDateOfBirth(dateOfBirth);
        person.setGender(FEMALE);
        person.setPhoneNumber("1234567890");

        String json = JsonSerializer.serialize(person);
        String expected =
                "{\"name\":\"Aramide\",\"dateOfBirth\":\"2024-05-25\",\"gender\":\"FEMALE\",\"phoneNumber\":\"1234567890\"}";

        assertEquals(expected, json);
    }

    @Test
    public void testJsonDeserializer() throws JsonProcessingException {
        Person person = new Person("John", "2024-02-10", FEMALE,"12439343443");
        String json = JsonSerializer.serialize(person);
        System.out.printf("json: %s%n", json);
        Person personFromJson = JsonSerializer.deserialize(json);
        System.out.printf("person from json: %s%n", personFromJson);

        assertNotNull(personFromJson);
        assertEquals(person.getDateOfBirth(), personFromJson.getDateOfBirth());
        assertEquals(FEMALE, personFromJson.getGender());
        assertEquals("John", personFromJson.getName());
        assertEquals("12439343443", personFromJson.getPhoneNumber());
    }
}