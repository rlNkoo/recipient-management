package pl.rlnkoo.authservice.service;

import org.springframework.stereotype.Service;
import pl.rlnkoo.authservice.model.User;
import pl.rlnkoo.authservice.repository.UserRepository;

import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<User> findByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}
