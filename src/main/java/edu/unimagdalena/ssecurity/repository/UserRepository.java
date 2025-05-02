package edu.unimagdalena.ssecurity.repository;

import edu.unimagdalena.ssecurity.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    public User findByUsername(String username);
}
