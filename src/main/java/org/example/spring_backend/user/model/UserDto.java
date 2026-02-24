package org.example.spring_backend.user.model;

import lombok.Getter;

public class UserDto {
    @Getter
    public static class SignupDto{
        private String email;
        private String name;
        private String password;


        public User toEntity(){
            return User.builder()
                    .email(this.email)
                    .name(this.name)
                    .password(this.password)
                    .build();
        }
    }
}
