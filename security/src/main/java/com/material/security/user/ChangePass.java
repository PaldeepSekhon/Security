package main.java.com.material.security.user; 

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ChangePass {

    private String currentPassword;
    private String newPassword;
    private String confirmationPassword;
}    

