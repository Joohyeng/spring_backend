package org.example.spring_backend.user;

import lombok.RequiredArgsConstructor;
import org.example.spring_backend.user.model.User;
import org.example.spring_backend.user.model.UserDto;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    public void signup(UserDto.SignupDto dto) {
        User user = dto.toEntity();
        user.setPassword(passwordEncoder.encode(dto.getPassword()));
        userRepository.save(user);

    }

}
