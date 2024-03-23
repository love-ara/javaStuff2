package africa.semicolon.designPattern.dtos.requests;

import lombok.Data;

@Data
public class CreateEntryRequest {
    private String title;
    private String body;
    private String author;
}
