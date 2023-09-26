package com.Innovationship.LoginSignUpHRCloud.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class UserDetail {

    @Id
    private String email;
    private String password;
}
