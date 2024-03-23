package africa.semicolon.designPattern.dtos.requests;

import lombok.Data;


@Data
public class UpdateEntryRequest {
    private String title;
    private String body;
    private String id;
    private String author;

}
