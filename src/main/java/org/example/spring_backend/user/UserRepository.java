package org.example.spring_backend.user;

import org.example.spring_backend.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
