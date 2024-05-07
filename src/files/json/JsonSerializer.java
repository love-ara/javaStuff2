package files.json;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

import java.time.LocalDate;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class JsonSerializer {
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String name;

    @JsonProperty("dob")
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate date_of_birth;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String phoneNumber;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String gender;

    @Override
    public String toString() {
        return STR."person -> {name: \{name}, date_of_birth: \{date_of_birth}, phoneNumber: \{phoneNumber}, gender: \{gender}}";
    }

    public JsonSerializer() {

    }
    public static String  serialize(Person person) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.writeValueAsString(person);
        }catch(JsonProcessingException e) {
            System.err.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public static Person deserialize(String json) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
       return mapper.readValue(json, Person.class);
    }
}
