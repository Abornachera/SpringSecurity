package edu.unimagdalena.ssecurity.security.service;

import edu.unimagdalena.ssecurity.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service

public class JpaUserDetailService implements UserDetailsService {
    private final UserRepository userRepository;

    @Override
    public JpaUserDetailService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public
}
