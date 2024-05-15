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
public class JsonSerialise {
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private int id;


    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String name;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private Double amount;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String type;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String date;

    @Override
    public String toString() {
        return STR."Transaction -> {id: \{id}, name: \{name}, amount: \{amount}, type: \{type}, date: \{date}}";
    }

    public JsonSerialise() {

    }
    public static String  serialize(Transaction transaction) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.writeValueAsString(transaction);
        }catch(JsonProcessingException e) {
            System.err.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public static Transaction deserialize(String json) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(json, Transaction.class);
    }
}
