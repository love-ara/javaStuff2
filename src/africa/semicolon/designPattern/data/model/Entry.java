package africa.semicolon.designPattern.data.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document
public class Entry {
    private String title;
    private String body;
    private LocalDateTime creationDate = LocalDateTime.now();
    private String author;
    @Id
    private String id;
}
