package org.example.spring_backend.user;

import lombok.RequiredArgsConstructor;
import org.example.spring_backend.user.model.UserDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/signup")
    public ResponseEntity signup(UserDto.SignupDto dto){
        userService.signup(dto);
        return ResponseEntity.ok("");
    }
}
