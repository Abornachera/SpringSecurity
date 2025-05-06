package edu.unimagdalena.ssecurity.security.service;

import edu.unimagdalena.ssecurity.entities.User;
import edu.unimagdalena.ssecurity.repository.UserRepository;
import lombok.Generated;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JpaUserDetailService implements UserDetailsService {
    private final UserRepository userRepository;

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = (User)this.userRepository.findByUsername(username).orElseThrow(() -> {
            return new UsernameNotFoundException("Usuario no encontrado");
        });
        return new UserInfoDetail(user);
    }

    @Generated
    public JpaUserDetailService(final UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
