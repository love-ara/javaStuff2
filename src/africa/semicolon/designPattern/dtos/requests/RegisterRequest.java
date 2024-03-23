package africa.semicolon.designPattern.dtos.requests;

import lombok.Data;

@Data
public class RegisterRequest {
    private String username;
    private String password;
}
