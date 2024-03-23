package africa.semicolon.designPattern.dtos.requests;

import lombok.Data;

@Data
public class DeleteRequest {
    private String username;
    private String password;
}
